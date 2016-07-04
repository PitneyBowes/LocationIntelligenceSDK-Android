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

package com.pb.locationintelligence.geo911;

import android.content.Context;

import com.pb.locationintelligence.geo911.model.PsapResponse;
import com.pb.locationintelligence.interfaces.RequestObserver;

/**
 * This service provides Life-saving emergency call-routing information (PSAP details) w.r.t requested Address or Latitude-Longitude.
 * @author NE002GU
 *
 */
public interface Geo911Service {

	/**
	 * Retrieves Public Safety Answering Points (PSAP) details. 
	 * Accepts the address as input and returns PSAP locations' details 
	 * including agency name, phone number, county name, coverage, contact person's 
	 * details, site details and mailing address
	 * @param context
	 * 			Required - Android Context
	 * @param address
	 * 			Required - Free-form address text
	 * @param requestObserver
	 * 			Required - Asynchronous request observer
	 */
    public void getPSAPByAddress(Context context, String address, RequestObserver<PsapResponse> requestObserver);
    
    /**
     * Retrieves Public Safety Answering Points (PSAP) details.
     * Accepts latitude and longitude co-ordinates as input and returns PSAP locations' details
     * including agency name, including agency name, phone number, county name, coverage, 
     * contact person's details, site details and mailing address.
     * @param context
     * 			Required - Android Context
     * @param latitude
     * 			Required - latitude of the location
     * @param longitude
     * 			Required - longitude of the location
     * @param requestObserver
     * 			Required - Asynchronous request observer
     */
    public void getPSAPByLocation(Context context, Double latitude, Double longitude, RequestObserver<PsapResponse> requestObserver);

}
