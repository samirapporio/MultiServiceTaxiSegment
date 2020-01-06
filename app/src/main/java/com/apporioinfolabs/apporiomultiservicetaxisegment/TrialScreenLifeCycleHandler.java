package com.apporioinfolabs.apporiomultiservicetaxisegment;

import android.app.Activity;
import android.content.Context;

import com.apporioinfolabs.taxisegment.ExampleInterface;
import com.apporioinfolabs.taxisegment.MainActivityTaxi;
import com.apporioinfolabs.taxisegment.handlers.TaxiSegmentScreensLifeCycleHandler;

public class TrialScreenLifeCycleHandler implements TaxiSegmentScreensLifeCycleHandler {

    @Override
    public void onScreenLifeCycle(Activity activity , Context context , String screenName, String lifeCycleMethod, ExampleInterface updator) {
        MainActivityTaxi mainActivityTaxi = (MainActivityTaxi) activity;
    }
}
