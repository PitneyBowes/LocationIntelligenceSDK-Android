package com.pb.locationintelligence.geotax.model;

/**
 * Created by MU001JH on 8/16/2016.
 */
public class TaxResponse extends TaxRateResponse {

    private Census census;


    private LatLongFields latLongFields;

    public LatLongFields getLatLongFields() {
        return latLongFields;
    }

    public void setLatLongFields(LatLongFields latLongFields) {
        this.latLongFields = latLongFields;
    }

    public Census getCensus() {
        return census;
    }

    public void setCensus(Census census) {
        this.census = census;
    }
}
