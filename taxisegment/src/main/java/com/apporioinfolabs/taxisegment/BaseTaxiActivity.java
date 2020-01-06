package com.apporioinfolabs.taxisegment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.apporioinfolabs.taxisegment.utils.TaxiSegmentLogs;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class BaseTaxiActivity extends FragmentActivity implements ExampleInterface{




    @Override
    protected void onStart() {
        super.onStart();
        dispatchLifeCycle("onStart");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath( TaxiSegment.mBuilder.mFontpath.equals("")? "fonts/GoogleSans-Regular.ttf" : TaxiSegment.mBuilder.mFontpath )
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        dispatchLifeCycle("onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        dispatchLifeCycle("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        dispatchLifeCycle("onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        dispatchLifeCycle("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dispatchLifeCycle("onDestroy");
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    private void dispatchLifeCycle( String lifeCycle){
        if(TaxiSegment.mBuilder.mTaxiSegmentScreensLifeCycleHandler == null){
            TaxiSegmentLogs.e(""+getClass().getSimpleName(),"Found No Taxi Screen LifeCycle handler");
        }else{
            TaxiSegment.mBuilder.mTaxiSegmentScreensLifeCycleHandler.onScreenLifeCycle(BaseTaxiActivity.this, BaseTaxiActivity.this, ""+getClass().getSimpleName(),""+lifeCycle, this);
        }
    }

    @Override
    public void updateSomeView(int action) {

    }
}
