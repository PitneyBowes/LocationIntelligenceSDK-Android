
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

package com.pb.locationintelligence.geocode.model;

import java.util.List;

import com.pb.locationintelligence.geocode.model.forward.Address;


public class Candidate {

	private int precisionLevel;
	private String formattedStreetAddress;
	private String formattedLocationAddress;
	private String identifier;
	private String precisionCode;
	private String sourceDictionary;
	private FieldsMatching matching;
	private GeoPos geometry;
	private Address address;
	private List<CandidateRange> ranges;

	public int getPrecisionLevel() {
		return precisionLevel;
	}

	public void setPrecisionLevel(int precisionLevel) {
		this.precisionLevel = precisionLevel;
	}

	public String getFormattedStreetAddress() {
		return formattedStreetAddress;
	}

	public void setFormattedStreetAddress(String formattedStreetAddress) {
		this.formattedStreetAddress = formattedStreetAddress;
	}

	public String getFormattedLocationAddress() {
		return formattedLocationAddress;
	}

	public void setFormattedLocationAddress(String formattedLocationAddress) {
		this.formattedLocationAddress = formattedLocationAddress;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getPrecisionCode() {
		return precisionCode;
	}

	public void setPrecisionCode(String precisionCode) {
		this.precisionCode = precisionCode;
	}

	public String getSourceDictionary() {
		return sourceDictionary;
	}

	public void setSourceDictionary(String sourceDictionary) {
		this.sourceDictionary = sourceDictionary;
	}

	public FieldsMatching getMatching() {
		return matching;
	}

	public void setMatching(FieldsMatching matching) {
		this.matching = matching;
	}

	public GeoPos getGeometry() {
		return geometry;
	}

	public void setGeometry(GeoPos geometry) {
		this.geometry = geometry;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<CandidateRange> getRanges() {
		return ranges;
	}
	
}