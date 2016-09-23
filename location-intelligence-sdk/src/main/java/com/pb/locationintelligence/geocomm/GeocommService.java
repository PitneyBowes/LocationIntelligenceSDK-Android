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

package com.pb.locationintelligence.geocomm;

import com.pb.locationintelligence.geocomm.model.RateCenterResponse;
import com.pb.locationintelligence.interfaces.RequestObserver;

import android.content.Context;

/**
 * This service provides rate center information w.r.t requested Address or Latitude-Longitude.
 * @author MO001US
 *
 */
public interface GeocommService {

	/**
	 * 
	 * @param context
	 * @param address
	 * @param requestObserver
	 */
    public void getRateCenterByAddress(Context context, String address, RequestObserver<RateCenterResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param address
     * @param areaCodeInfo
     * @param requestObserver
     */
    public void getRateCenterByAddress(Context context, String address, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param address
     * @param areaCodeInfo
     * @param level
     * @param requestObserver
     */
    public void getRateCenterByAddress(Context context, String address, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param address
     * @param country
     * @param requestObserver
     */
    public void getRateCenterByAddress(Context context, String address, String country, RequestObserver<RateCenterResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param address
     * @param country
     * @param areaCodeInfo
     * @param requestObserver
     */
    public void getRateCenterByAddress(Context context, String address, String country, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param address
     * @param country
     * @param areaCodeInfo
     * @param level
     * @param requestObserver
     */
    public void getRateCenterByAddress(Context context, String address, String country, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param longitude
     * @param latitude
     * @param requestObserver
     */
    public void getRateCenterByLocation(Context context, Double longitude, Double latitude, RequestObserver<RateCenterResponse> requestObserver);
    /**
     * 
     * @param context
     * @param longitude
     * @param latitude
     * @param areaCodeInfo
     * @param requestObserver
     */
    public void getRateCenterByLocation(Context context, Double longitude, Double latitude, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param longitude
     * @param latitude
     * @param areaCodeInfo
     * @param level
     * @param requestObserver
     */
    public void getRateCenterByLocation(Context context, Double longitude, Double latitude, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver);
    
    

}
