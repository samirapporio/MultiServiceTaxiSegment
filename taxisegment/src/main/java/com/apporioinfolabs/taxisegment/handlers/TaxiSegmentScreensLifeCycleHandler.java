package com.apporioinfolabs.taxisegment.handlers;

import android.app.Activity;
import android.content.Context;

import com.apporioinfolabs.taxisegment.ExampleInterface;

public interface TaxiSegmentScreensLifeCycleHandler {

    void onScreenLifeCycle(Activity activity, Context context , String screenName, String lifeCycleMethod , ExampleInterface updator);
}
