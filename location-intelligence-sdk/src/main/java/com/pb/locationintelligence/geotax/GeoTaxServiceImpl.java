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

import com.google.gson.Gson;
import com.pb.locationintelligence.OAuth.AuthToken;
import com.pb.locationintelligence.OAuth.OAuthService;
import com.pb.locationintelligence.geotax.model.TaxRateResponse;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.network.ErrorResponse;
import com.pb.locationintelligence.network.GetRestService;
import com.pb.locationintelligence.utils.Log;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utils;

import org.json.JSONException;
import org.json.JSONObject;

public class GeoTaxServiceImpl extends OAuthService implements
        GeoTaxService {

    private GetRestService _GetRestService = null;
    private String geotaxUrl = "/geotax/v1/";
    private UrlMaker urlMaker;

    @Override
    public void getGeoTaxRateByLocation(final Context context,final String taxRateTypeId,final Double latitude,
    		final Double longitude,final RequestObserver<TaxRateResponse> requestObserver)
    {

        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is sucessfull, It's time to call Geotax API ");
                urlMaker = UrlMaker.getInstance();
                String url = urlMaker.getAbsoluteUrl(geotaxUrl) + "taxrate/" + taxRateTypeId +"/bylocation?"
                        + "latitude=" + urlMaker.getEncodedURL(getString(latitude)) + "&longitude=" + urlMaker.getEncodedURL(getString(longitude));
                getGeotaxResponse(context, url, "getGeoTaxRateByLocation", requestObserver);
            }

            @Override
            public void onRequestStart() {
                Log.d("Authentication request has been started for Geotax ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });

    }

	@Override
	public void getGeoTaxRateByAddress(final Context context, final String taxRateTypeId,
			final String address, final RequestObserver<TaxRateResponse> requestObserver) {
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Geotax API ");
	                urlMaker = UrlMaker.getInstance();
	                String url = urlMaker.getAbsoluteUrl(geotaxUrl) + "taxrate/" + taxRateTypeId  + "/byaddress?"
	                        + "address=" + urlMaker.getEncodedURL(getString(address));
	                getGeotaxResponse(context, url, "getGeoTaxRateByAddress", requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Geotax ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });

		
	}


	@Override
	public void getGeoTaxByLocation(final Context context, final String taxRateTypeId,
			final Double latitude, final Double longitude,final Double purchaseAmount,
			final RequestObserver<TaxRateResponse> requestObserver) {
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Geotax API ");
	                urlMaker = UrlMaker.getInstance();
	                String url =  urlMaker.getAbsoluteUrl(geotaxUrl) + "tax/" + taxRateTypeId +"/bylocation?"
	                        + "latitude=" + urlMaker.getEncodedURL(getString(latitude)) + "&longitude=" + urlMaker.getEncodedURL(getString(longitude))
	                        + "&purchaseAmount=" + urlMaker.getEncodedURL(getString(purchaseAmount));
	                getGeotaxResponse(context, url, "getGeoTaxByLocation", requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Geotax ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });

		
	}


	@Override
	public void getGeoTaxByAddress(final Context context, final String taxRateTypeId,
			final String address, final Double purchaseAmount,
			final RequestObserver<TaxRateResponse> requestObserver) {
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Geotax API ");
	                urlMaker = UrlMaker.getInstance();
	                String url = urlMaker.getAbsoluteUrl(geotaxUrl) + "tax/" + taxRateTypeId +"/byaddress?"
	                        + "address=" + urlMaker.getEncodedURL(getString(address))  + "&purchaseAmount=" + urlMaker.getEncodedURL(getString(purchaseAmount));
	                getGeotaxResponse(context, url, "getGeoTaxByAddress", requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Geotax ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });

		
	}

    private void getGeotaxResponse(final Context context, final String url,
            final String methodName,
            final RequestObserver<TaxRateResponse> requestObserver) {

        Log.d("Calling Geotax Service to retrieve Tax Rate response for " + methodName);
        _GetRestService = new GetRestService(context, url, null,
                this, new RequestObserver<String>() {

                    @Override
                    public void onSucess(String data) {
                        Log.d("Tax Rate Response for " + methodName);
                        TaxRateResponse response = null;
                        try {
                            JSONObject jsonResponse = new JSONObject(data);
                            Gson gson = new Gson();
                            response = gson.fromJson(jsonResponse.toString(),
                            		TaxRateResponse.class);

                            Log.d("Got the Tax Rate Response " + response);

                        } catch (JSONException e) {
                            Log.e("Excpetion in Json parsing of geotax response : "
                                    + e.getMessage());
                            ErrorResponse errorResponse = new ErrorResponse(
                                    Utils.getInternalErrorResponseObject(
                                            e.getMessage(), e));
                            errorResponse.setRootErrorMessage(e.getMessage());

                            requestObserver.onFailure(errorResponse);
                            return;
                        }
                        requestObserver.onSucess(response);
                    }

                    @Override
                    public void onRequestStart() {
                        Log.d("Tax Rate Response for  " + methodName
                                + "request has been started");
                        requestObserver.onRequestStart();
                    }

                    @Override
                    public void onFailure(ErrorResponse errorData) {
                        Log.d("Oops Retrieval of Tax Rate Details for " + methodName
                                + "failed");
                        requestObserver.onFailure(errorData);
                    }
                });
        _GetRestService.execute();
    }
    
    private String getString(Object value) {
		if (value == null) {
			return "";
		}
		return value.toString();
	}
}
