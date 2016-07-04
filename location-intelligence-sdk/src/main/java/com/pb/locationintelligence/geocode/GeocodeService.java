
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

package com.pb.locationintelligence.geocode;

import java.util.List;

import com.pb.locationintelligence.geocode.model.BundleType;
import com.pb.locationintelligence.geocode.model.Countries;
import com.pb.locationintelligence.geocode.model.GeocodeServiceResponseList;
import com.pb.locationintelligence.geocode.model.OperationType;
import com.pb.locationintelligence.geocode.model.Reverse.Point;
import com.pb.locationintelligence.geocode.model.capabilities.GeocodeCapabilitiesResponse;
import com.pb.locationintelligence.geocode.model.dictionaries.ConfiguredDictionaryResponse;
import com.pb.locationintelligence.geocode.model.forward.Address;
import com.pb.locationintelligence.geocode.preferences.GeocodePreferenceBuilder;
import com.pb.locationintelligence.interfaces.RequestObserver;

import android.content.Context;



public interface GeocodeService {


    /**
     * 
     * @param context
     * @param bundleType
     * @param requestObserver
     */
    public void getConfiguredDictionaries(Context context, BundleType bundleType, RequestObserver<ConfiguredDictionaryResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param countryName
     * @param bundleType
     * @param requestObserver
     */
    public void getConfiguredDictionaries(Context context, Countries countryName, BundleType bundleType, RequestObserver<ConfiguredDictionaryResponse> requestObserver);
    

    /**
     * 
     * @param context
     * @param bundleType
     * @param requestObserver
     */
    public void getCapabilities(Context context, BundleType bundleType, RequestObserver<GeocodeCapabilitiesResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param countryName
     * @param bundleType
     * @param requestObserver
     */
    public void getCapabilities(Context context, Countries countryName, BundleType bundleType, RequestObserver<GeocodeCapabilitiesResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param operation
     * @param bundleType
     * @param requestObserver
     */
    public void getCapabilities(Context context, OperationType operation, BundleType bundleType, RequestObserver<GeocodeCapabilitiesResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param countryName
     * @param operation
     * @param bundleType
     * @param requestObserver
     */
    public void getCapabilities(Context context, Countries countryName, OperationType operation, BundleType bundleType, RequestObserver<GeocodeCapabilitiesResponse> requestObserver);
    
    /**
     * 
     * @param context
     * @param address
     * @param bundleType
     * @param requestObserver
     */
    public void getGeocode(Context context, Address address, BundleType bundleType, RequestObserver<GeocodeServiceResponseList> requestObserver);
    
    /**
     * 
     * @param context
     * @param addresses
     * @param bundleType
     * @param requestObserver
     */
    public void getGeocodeBatch(Context context, List<Address> addresses, BundleType bundleType, RequestObserver<GeocodeServiceResponseList> requestObserver);
    
    /**
     * 
     * @param context
     * @param addresses
     * @param bundleType
     * @param preferenceBuilder
     * @param requestObserver
     */
    public void getGeocodeAdvancedBatch(Context context, List<Address> addresses, BundleType bundleType, GeocodePreferenceBuilder preferenceBuilder, RequestObserver<GeocodeServiceResponseList> requestObserver);
    
    /**
     * 
     * @param context
     * @param point
     * @param bundleType
     * @param requestObserver
     */
    public void getReverseGeocode(Context context, Point point, BundleType bundleType, RequestObserver<GeocodeServiceResponseList> requestObserver);
    
    /**
     * 
     * @param context
     * @param points
     * @param bundleType
     * @param requestObserver
     */
    public void getReverseGeocodeBatch(Context context, List<Point> points, BundleType bundleType, RequestObserver<GeocodeServiceResponseList> requestObserver);
    
    /**
     * 
     * @param context
     * @param points
     * @param bundleType
     * @param preferenceBuilder
     * @param requestObserver
     */
    public void getReverseGeocodeAdvancedBatch(Context context, List<Point> points, BundleType bundleType, GeocodePreferenceBuilder preferenceBuilder, RequestObserver<GeocodeServiceResponseList> requestObserver);

}