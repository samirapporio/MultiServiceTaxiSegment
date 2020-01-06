package com.apporioinfolabs.taxisegment.utils;

import com.apporioinfolabs.taxisegment.TaxiSegment;

public class Apis {


    public interface Endpoints{
        String Getvehicles = TaxiSegment.mBuilder.mBaseUrl+"/some_api_end_points" ;
    }


    public interface Tags{
        String Getvehicles = "Getvehicles" ;
    }


}
