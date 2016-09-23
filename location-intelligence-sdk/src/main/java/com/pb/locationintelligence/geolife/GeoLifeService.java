
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

package com.pb.locationintelligence.geolife;

import android.content.Context;

import com.pb.locationintelligence.geolife.model.GeoLifeResponse;
import com.pb.locationintelligence.geolife.model.segmentation.Segmentation;
import com.pb.locationintelligence.interfaces.RequestObserver;

;
/**
 * This GeoLifeService Version 2 provides demographic data and lifestyle characteristics for a specific area.
 *
 */
public interface GeoLifeService {

    /**
     * Returns the geodemographic range variables - ageTheme, genderTheme, maritalStatusTheme, ethnicityTheme, HouseholdSizeTheme etc
     * based on an address provided
     * @param context
     *   		Required - Android Context
     * @param address
     *   		Required - Free-form address text
     * @param country
     *          Optional - Country Code
     *          Acceptable list of country codes: USA,CAN,AUS,SWE,JPN,GBR
     * @param profile
     * 			Optional - Pre-defined profiles sets. Below are the values:
     * 			  			'Top5Ascending': Retrieves the top 5 results in ascending order.
     * 						'Top5Decending': Retrieves the top 5 results in descending order.
     * 						'Top3Ascending': Retrieves the top 3 results in ascending order.
     * 						'Top3Decending': Retrieves the top 3 results in descending order
     * @param filter
     * 			Optional - Represents demographic themes to narrow down search results
     * 						for example; AgeTheme, IncomeTheme, EthnicityTheme
     * 						Maximum number of themes that can be provided as a filter are 10.
     * @param requestObserver
     * 			Required - Asynchronous request observer
     */
    void getDemographicsByAddress(Context context, String address, String country, String profile, String filter, RequestObserver<GeoLifeResponse> requestObserver);

    /**
     * Returns the geodemographic range variables - ageTheme, genderTheme, maritalStatusTheme, ethnicityTheme, HouseholdSizeTheme etc 
     * based on a location provided
     * @param context
     *    		Required - Android Context
     * @param latitude
     *  		Required - latitude of the location
     * @param longitude
     *  		Required - longitude of the location
     * @param profile
     * 			Optional - Pre-defined profiles sets. Below are the values:
     * 			  			'Top5Ascending': Retrieves the top 5 results in ascending order.
     * 						'Top5Decending': Retrieves the top 5 results in descending order.
     * 						'Top3Ascending': Retrieves the top 3 results in ascending order.
     * 						'Top3Decending': Retrieves the top 3 results in descending order
     * @param filter
     *  		Optional - Represents demographic themes to narrow down search results
     * 					   for example; AgeTheme, IncomeTheme, EthnicityTheme
     * 					   Maximum number of themes that can be provided as a filter are 10.
     * @param requestObserver
     * 			Required - Asynchronous request observer
     */
    void getDemographicsByLocation(Context context, Double latitude, Double longitude, String profile, String filter, RequestObserver<GeoLifeResponse> requestObserver);
    


    /**
     * Returns the lifestyle segmentation data for the specified address asynchronously
     * @param context
     *   		Required - Android Context
     *  @param address
	 * 			Required - address text
     * @param country
 * 			Optional - Country Code
*          Acceptable list of country codes: USA,CAN,AUS,SWE,JPN,GBR
     * @param requestObserver
     */
    void getSegmentationByAddress(Context context, String address, String country, RequestObserver<Segmentation> requestObserver);

    /**
     * Returns the lifestyle segmentation data for the specified location asynchronously
     * @param context
     *   		Required - Android Context
     * @param longitude
 * 		Required - longitude of the location
     * @param latitude
* 		Required - latitude of the location
     * @param requestObserver
     */
    void getSegmentationByLocation(final Context context, final Double longitude, final Double latitude, final RequestObserver<Segmentation> requestObserver);

}
