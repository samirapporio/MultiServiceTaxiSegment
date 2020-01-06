package com.apporioinfolabs.taxisegment.handlers;

public interface TaxiSegmentActionHandler {

    void onElementClick(String data);
    void onElementClick(String screenName, int actionName, String data);

}
