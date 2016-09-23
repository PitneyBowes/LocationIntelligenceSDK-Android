package com.pb.locationintelligence.geotax.model;

import com.pb.locationintelligence.common.model.Address;


public class TaxRateAddress extends Address {

    protected String distanceUnits;
    protected String bufferWidth;
    protected String userBufferWidth;


    public String getDistanceUnits() {
        return distanceUnits;
    }

    /**
     * Sets the value of the returnAllCandidateInfo property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setDistanceUnits(String value) {
        this.distanceUnits = value;
    }

    public String getBufferWidth() {
        return bufferWidth;
    }

    /**
     * Sets the value of the returnAllCandidateInfo property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setBufferWidth(String value) {
        this.bufferWidth = value;
    }

    public String getUserBufferWidth() {
        return userBufferWidth;
    }

    /**
     * Sets the value of the returnAllCandidateInfo property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setUserBufferWidth(String value) {
        this.userBufferWidth = value;
    }


}
