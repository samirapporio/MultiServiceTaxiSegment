package com.apporioinfolabs.apporiomultiservicetaxisegment;

import android.util.Log;

import com.apporioinfolabs.taxisegment.handlers.TaxiSegmentScreensLifeCycleHandler;

public class TrialScreenLifeCycleHandler implements TaxiSegmentScreensLifeCycleHandler {
    @Override
    public void onScreenLifeCucler(String screenName, String lifeCycleMethod) {
        Log.d("********", ""+screenName+": "+lifeCycleMethod);
    }
}
