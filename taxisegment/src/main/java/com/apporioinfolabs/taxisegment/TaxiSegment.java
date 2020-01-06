package com.apporioinfolabs.taxisegment;

import android.app.Application;

import com.apporioinfolabs.taxisegment.handlers.TaxiSegmentActionHandler;
import com.apporioinfolabs.taxisegment.handlers.TaxiSegmentScreensLifeCycleHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TaxiSegment {

    public static TaxiSegment.Builder mBuilder = null ;
    private static final String TAG = "TaxiSegment_TaxiSegment";
    public static Gson gson ;
    


    public static TaxiSegment.Builder startInit(Application application){
        return new TaxiSegment.Builder(application) ;
    }

    private static void init(TaxiSegment.Builder inBuilder) {
        // here comes the final builder object
        mBuilder = inBuilder ;
        gson = new GsonBuilder().create();

    }

    public static class Builder {
        public  Application mApplication;
        public String mBaseUrl ;
        public String mFontpath = "";

        TaxiSegmentActionHandler mTaxiSegmentActionHandler;
        TaxiSegmentScreensLifeCycleHandler mTaxiSegmentScreensLifeCycleHandler;


        private Builder() {}

        private Builder(Application application) {
            mApplication = application;
        }

        public Builder setBaseUrl(String baseUrl){
            mBaseUrl = baseUrl ;
            return this ;
        }

        public Builder setFontStyle(String fontpath){
            mFontpath  = fontpath ;
            return this ;
        }






        public Builder setonElementClickHandler(TaxiSegmentActionHandler taxiSegmentActionHandler){
            mTaxiSegmentActionHandler = taxiSegmentActionHandler;
            return this;
        }


        public Builder setScreenLifeCyclehandler(TaxiSegmentScreensLifeCycleHandler taxiSegmentScreensLifeCycleHandler ){
            mTaxiSegmentScreensLifeCycleHandler = taxiSegmentScreensLifeCycleHandler;
            return this ;
        }





        public void init() {
            TaxiSegment.init(this);
        }

    }





}
