
/*
 * Copyright 2016 Pitney Bowes Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 *
 */

package com.pb.locationintelligence.geocode.model.forward;

import java.util.Map;

public class Address {

    private String mainAddressLine;
    private String addressLastLine;
    private String placeName;
    private String areaName1;
    private String areaName2;
    private String areaName3;
    private String areaName4;
    private String postCode1;
    private String postCode2;
    private String country;
    private String addressNumber;
    private String streetName;
    private String unitType;
    private String unitValue;
    private Map customFields;

    public String getMainAddressLine() {
        return mainAddressLine;
    }

    public void setMainAddressLine(String value) {
        this.mainAddressLine = value;
    }

    public String getAddressLastLine() {
        return addressLastLine;
    }

    public void setAddressLastLine(String value) {
        this.addressLastLine = value;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String value) {
        this.placeName = value;
    }

    public String getAreaName1() {
        return areaName1;
    }

    public void setAreaName1(String value) {
        this.areaName1 = value;
    }

    public String getAreaName2() {
        return areaName2;
    }

    public void setAreaName2(String value) {
        this.areaName2 = value;
    }

    public String getAreaName3() {
        return areaName3;
    }

    public void setAreaName3(String value) {
        this.areaName3 = value;
    }

    public String getAreaName4() {
        return areaName4;
    }

    public void setAreaName4(String value) {
        this.areaName4 = value;
    }

    public String getPostCode1() {
        return postCode1;
    }

    public void setPostCode1(String value) {
        this.postCode1 = value;
    }

    public String getPostCode2() {
        return postCode2;
    }

    public void setPostCode2(String value) {
        this.postCode2 = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String value) {
        this.addressNumber = value;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String value) {
        this.streetName = value;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String value) {
        this.unitType = value;
    }

    public String getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(String value) {
        this.unitValue = value;
    }

    public Map getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Map value) {
        this.customFields = value;
    }

}
