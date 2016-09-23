

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

package com.pb.locationintelligence.common.model;

public class Location {

    private Match match;
    private Address address;
    private Poi poi;
    private Distance distance;
    private Geometry geometry;

    /**
     * Applicable to custom-specified datasets only
     */
    private String dataset;

    private PlaceByLocationResponse place;

    /**
     * 
     * @return The poi
     */
    public Poi getPoi() {
        return poi;
    }

    public Match getMatch() {
        return match;
    }

    /**
     * 
     * @param poi
     *            The poi
     */
    public void setPoi(Poi poi) {
        this.poi = poi;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public PlaceByLocationResponse getPlace() {
        return place;
    }

    public void setPlace(PlaceByLocationResponse place) {
        this.place = place;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

	public String getDataset() {
		return dataset;
	}

	public void setDataset(String dataset) {
		this.dataset = dataset;
	}
}
