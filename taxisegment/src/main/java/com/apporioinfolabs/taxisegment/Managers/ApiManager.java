package com.apporioinfolabs.taxisegment.Managers;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.AnalyticsListener;
import com.androidnetworking.interfaces.StringRequestListener;
import com.apporioinfolabs.taxisegment.TaxiSegment;
import com.apporioinfolabs.taxisegment.models.ModelResultChecker;

public class ApiManager {

    private OnApiListeners onApiListeners;

    public ApiManager(OnApiListeners onApiListeners) {
        this.onApiListeners = onApiListeners;
    }

    public void get(String screenName, final String apiName, String url) {
        onApiListeners.onApiStarted(apiName,ApiRunningStates.RUNNING);
        AndroidNetworking.get(url).build().setAnalyticsListener(new AnalyticsListener() {
            @Override
            public void onReceived(long timeTakenInMillis, long bytesSent, long bytesReceived, boolean isFromCache) {

            }
        }).getAsString(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
                onApiListeners.onApiStarted(apiName,ApiRunningStates.STOP);
                ModelResultChecker modelResultChecker =  TaxiSegment.gson.fromJson(response, ModelResultChecker.class);
                if(modelResultChecker.getResult() == ApiRunningStates.Success){
                    onApiListeners.onApiSuccessResult(apiName, response);
                }else if ( modelResultChecker.getResult() == ApiRunningStates.Failed){
                    onApiListeners.onApiSuccessResult(apiName, modelResultChecker.getMessage());
                }
            }

            @Override
            public void onError(ANError anError) {
                onApiListeners.onApiStarted(apiName,ApiRunningStates.STOP);
                onApiListeners.onApiError(apiName, anError);
            }
        });

    }

}
