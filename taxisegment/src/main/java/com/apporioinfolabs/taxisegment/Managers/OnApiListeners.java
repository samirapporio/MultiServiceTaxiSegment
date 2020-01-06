package com.apporioinfolabs.taxisegment.Managers;

import com.androidnetworking.error.ANError;

public interface OnApiListeners {

    void onApiStarted(String Apiname, int ApiRunningState);

    void onApiSuccessResult(String ApiName, String response);

    void onApiFailedResult(String ApiName, String message);

    void onApiError(String ApiName, ANError anError);

}
