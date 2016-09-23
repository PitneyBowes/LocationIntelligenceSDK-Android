
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

package com.pb.locationintelligence.geotax;

import android.content.Context;

import com.pb.locationintelligence.geotax.model.TaxAddressRequest;
import com.pb.locationintelligence.geotax.model.TaxLocationRequest;
import com.pb.locationintelligence.geotax.model.TaxRateAddressRequest;
import com.pb.locationintelligence.geotax.model.TaxRateLocationRequest;
import com.pb.locationintelligence.geotax.model.TaxRateResponse;
import com.pb.locationintelligence.geotax.model.TaxResponseList;
import com.pb.locationintelligence.interfaces.RequestObserver;

/**
 * This service provides tax details w.r.t requested Address or Latitude-Longitude.
 * @author NE002GU
 *
 */
public interface GeoTaxService {

	/**
	 * 
	 * @param context
	 * 			Required - Android Context
	 * @param taxRateTypeId
	 * 			Required - Tax Rate Types
	 * @param latitude
     * 			Required - latitude of the location
     * @param longitude
     * 			Required - longitude of the location
	 * @param requestObserver
	 * 			Required - Asynchronous request observer
	 */
    public void getGeoTaxRateByLocation(Context context, String taxRateTypeId, Double latitude, Double longitude, RequestObserver<TaxRateResponse> requestObserver);
    
    /**
     * 
     * @param context
     * 			Required - Android Context
     * @param taxRateTypeId
	 * 			Required - Tax Rate Types
     * @param address
	 * 			Required - Free-form address text
     * @param requestObserver
     * 			Required - Asynchronous request observer
     */
    public void getGeoTaxRateByAddress(Context context, String taxRateTypeId, String address, RequestObserver<TaxRateResponse> requestObserver);
    
    /**
	 * 
	 * @param context
	 * 			Required - Android Context
	 * @param taxRateTypeId
	 * 			Required - Tax Rate Types
	 * @param latitude
     * 			Required - latitude of the location
     * @param longitude
     * 			Required - longitude of the location
     * @param purchaseAmount
     * 			Required - 
	 * @param requestObserver
	 * 			Required - Asynchronous request observer
	 */
    public void getGeoTaxByLocation(Context context, String taxRateTypeId, Double latitude, Double longitude, Double purchaseAmount, RequestObserver<TaxRateResponse> requestObserver);

    /**
     * 
     * @param context
     * 			Required - Android Context
     * @param taxRateTypeId
	 * 			Required - Tax Rate Types
     * @param address
	 * 			Required - Free-form address text
	 * @param purchaseAmount
     * 			Required - 
     * @param requestObserver
     * 			Required - Asynchronous request observer
     */
    public void getGeoTaxByAddress(Context context, String taxRateTypeId, String address, Double purchaseAmount, RequestObserver<TaxRateResponse> requestObserver);


	/**
	 *
	 * @param context
	 * 			Required - Android Context
	 * @param taxRateTypeId
	 * 			Required - Tax Rate Types
	 * @param request
	 * 			Required - TaxRateLocationRequest object list with multiple locations.
	 * @param requestObserver
	 * 			Required - Asynchronous request observer
	 */
	public void getGeoTaxRateBatchByLocation(Context context,String taxRateTypeId, TaxRateLocationRequest request,RequestObserver<TaxResponseList> requestObserver);


	/**
	 *
	 * @param context
	 * 			Required - Android Context
	 * @param taxRateTypeId
	 * 			Required - Tax Rate Types
	 * @param request
	 * 			Required - TaxRateAddressRequest object list with multiple Address.
	 * @param requestObserver
	 * 			Required - Asynchronous request observer
	 */
	public void getGeoTaxRateByBatchAddress(Context context,String taxRateTypeId, TaxRateAddressRequest request,RequestObserver<TaxResponseList> requestObserver);


	/**
	 *
	 * @param context
	 * 			Required - Android Context
	 * @param taxRateTypeId
	 * 			Required - Tax Rate Types
	 * @param request
	 * 			Required - TaxLocationRequest object list with multiple Address.
	 * @param requestObserver
	 * 			Required - Asynchronous request observer
	 */
	public void getGeoTaxByBatchLocation(Context context,String taxRateTypeId, TaxLocationRequest request,RequestObserver<TaxResponseList> requestObserver);


	/**
	 *
	 * @param context
	 * 			Required - Android Context
	 * @param taxRateTypeId
	 * 			Required - Tax Rate Types
	 * @param request
	 * 			Required - TaxAddressRequest object list with multiple Address.
	 * @param requestObserver
	 * 			Required - Asynchronous request observer
	 */
	public void getGeoTaxByBatchAddress(Context context,String taxRateTypeId,TaxAddressRequest request,RequestObserver<TaxResponseList> requestObserver);
}
