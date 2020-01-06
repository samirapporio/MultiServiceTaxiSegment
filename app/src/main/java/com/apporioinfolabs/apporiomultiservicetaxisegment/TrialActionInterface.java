package com.apporioinfolabs.apporiomultiservicetaxisegment;

import android.util.Log;

import com.apporioinfolabs.taxisegment.handlers.TaxiSegmentActionHandler;

public class TrialActionInterface implements TaxiSegmentActionHandler {

    @Override
    public void onElementClick(String data) {
        Log.i("********************",""+data);
    }

    @Override
    public void onElementClick(String screenName, int actionName, String data) {

    }
}