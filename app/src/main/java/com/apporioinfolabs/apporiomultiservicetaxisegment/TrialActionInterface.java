package com.apporioinfolabs.apporiomultiservicetaxisegment;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.apporioinfolabs.taxisegment.MainActivityTaxi;
import com.apporioinfolabs.taxisegment.handlers.TaxiSegmentActionHandler;

public class TrialActionInterface implements TaxiSegmentActionHandler {

    @Override
    public void onElementClick(String data) {
        Log.i("********************",""+data);
    }

    @Override
    public void onElementClick(Activity activity, Context context, String screenName, int actionName, String data) {
        MainActivityTaxi mainActivityTaxi = (MainActivityTaxi) activity;
//        mainActivityTaxi.updateSomeView();
    }
}