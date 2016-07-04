
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

package com.pb.locationintelligence.geo911.model;

public class PsapAddress {  
	
	
    private String formattedAddress;
    private String mainAddressLine;

		
    private String addressLastLine;
    private String placeName;
    private String areaName1;
    private String areaName2;
    private String areaName3;
    private String areaName4;
    private String postCode;
    private String postCodeExt;
	
	
	private String country;
	
    private String addressNumber;
    private String streetName;
    private String unitType;
    private String unitValue;
	public String getFormattedAddress() {
		return formattedAddress;
	}
	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	public String getMainAddressLine() {
		return mainAddressLine;
	}
	public void setMainAddressLine(String mainAddressLine) {
		this.mainAddressLine = mainAddressLine;
	}
	public String getAddressLastLine() {
		return addressLastLine;
	}
	public void setAddressLastLine(String addressLastLine) {
		this.addressLastLine = addressLastLine;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getAreaName1() {
		return areaName1;
	}
	public void setAreaName1(String areaName1) {
		this.areaName1 = areaName1;
	}
	public String getAreaName2() {
		return areaName2;
	}
	public void setAreaName2(String areaName2) {
		this.areaName2 = areaName2;
	}
	public String getAreaName3() {
		return areaName3;
	}
	public void setAreaName3(String areaName3) {
		this.areaName3 = areaName3;
	}
	public String getAreaName4() {
		return areaName4;
	}
	public void setAreaName4(String areaName4) {
		this.areaName4 = areaName4;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPostCodeExt() {
		return postCodeExt;
	}
	public void setPostCodeExt(String postCodeExt) {
		this.postCodeExt = postCodeExt;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	public String getUnitValue() {
		return unitValue;
	}
	public void setUnitValue(String unitValue) {
		this.unitValue = unitValue;
	}
    

}
