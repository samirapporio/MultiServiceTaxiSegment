package com.apporioinfolabs.apporiomultiservicetaxisegment;

import android.app.Application;

import com.apporioinfolabs.taxisegment.TaxiSegment;

public class MainApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();


        TaxiSegment.startInit(this)
                .setBaseUrl("some url goes here")
                .setFontStyle("fonts/LongCang-Regular.ttf")
                .setonElementClickHandler(new TrialActionInterface())
                .setScreenLifeCyclehandler(new TrialScreenLifeCycleHandler())
                .init();
    }
}
