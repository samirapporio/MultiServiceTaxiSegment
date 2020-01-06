package com.apporioinfolabs.taxisegment.handlers;

import android.app.Activity;
import android.content.Context;

public interface TaxiSegmentActionHandler {

    void onElementClick(String data);
    void onElementClick(Activity activity , Context context, String screenName, int actionName, String data);

}
