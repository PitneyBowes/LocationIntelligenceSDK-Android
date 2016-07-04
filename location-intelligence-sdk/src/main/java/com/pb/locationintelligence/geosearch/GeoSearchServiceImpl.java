
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

package com.pb.locationintelligence.geosearch;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.google.gson.Gson;
import com.pb.locationintelligence.OAuth.AuthToken;
import com.pb.locationintelligence.OAuth.OAuthService;
import com.pb.locationintelligence.common.model.Location;
import com.pb.locationintelligence.geosearch.model.GeoSearch;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.network.ErrorResponse;
import com.pb.locationintelligence.network.GetRestService;
import com.pb.locationintelligence.utils.Log;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utils;

/**
 * Implementation of Geo Search Interface This implementation is tightly coupled
 * with network layer
 * 
 * @author ga007ja
 * 
 */
public class GeoSearchServiceImpl extends OAuthService implements
        GeoSearchService {

    private GetRestService _GetRestService = null;
    private String geoSearchUrl = "/geosearch/v1/locations?";
    private UrlMaker urlMaker;

    /**
     * Geo Search IMPL with mandatory + optional parameters
     */
    @Override
    public void geoSearch(final Context context, final String searchText,
            final Double originLatitude, final Double originLongitude,
            final Float searchRadius, final String searchRadiusUnit,
            final Integer maxCandidates, 
            final RequestObserver<GeoSearch> requestObserver) {

        /**
         * It also checks for authentication, If authentication is successful
         * then It goes for Geo search apis. If response is successful then Its
         * sends relevant Geosearch objects through call back to the caller and
         * if response is failure then also It sends failure callback to the
         * caller
         */
        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is sucessfull, It's time to call GeoSearch APIs ");
                geoSearchInternal(context, searchText, originLatitude,
                        originLongitude, searchRadius, searchRadiusUnit,
                        maxCandidates, requestObserver);
              
            }

            @Override
            public void onRequestStart() {

                Log.d("Authentication request has been started for GeoSearch ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) {

                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });

    }

    /**
     * Geo Search IMPL with mandatory parameters
     */

    @Override
    public void geoSearch(final Context context, final String searchText,
            final Double originLatitude, final Double originLongitude,
            final RequestObserver<GeoSearch> requestObserver) {

        /**
         * It also checks for authentication, If authentication is successful
         * then It goes for Geo search apis. If response is successful then Its
         * sends relevant Geosearch objects through call back to the caller and
         * if response is failure then also It sends failure callback to the
         * caller
         */
        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is sucessfull, It's time to call GeoSearch APIs ");
                geoSearchInternal(context, searchText, originLatitude,
                        originLongitude, null, null, null, requestObserver);
              
            }

            @Override
            public void onRequestStart() {
                Log.d("Authentication request has been started for GeoSearch ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });

    }

    private void geoSearchInternal(Context context, String searchText,
            Double originLatitude, Double originLongitude,
            Float searchRadius, String searchRadiusUnit,
            Integer maxCandidates,
            final RequestObserver<GeoSearch> requestObserver) {

        Log.d("Calling GeoSearch Service to retrieve  list of places and "
                + "points of interest near the input text/location vicinity ");
        urlMaker = UrlMaker.getInstance();
        StringBuilder urlBuilder = new StringBuilder(
                urlMaker.getAbsoluteUrl(geoSearchUrl)).append("searchText=")
                .append(urlMaker.getEncodedURL(getString(searchText))).append("&longitude=")
                .append(urlMaker.getEncodedURL(getString(originLongitude))).append("&latitude=")
                .append(urlMaker.getEncodedURL(getString(originLatitude)));

       
        if (searchRadius != null) {
            urlBuilder.append("&searchRadius=").append(urlMaker.getEncodedURL(getString(searchRadius)));
        }

        if (searchRadiusUnit != null) {
            urlBuilder.append("&searchRadiusUnit=").append(urlMaker.getEncodedURL(getString(searchRadiusUnit)));
        }

        if (maxCandidates != null) {
            urlBuilder.append("&maxCandidates=").append(urlMaker.getEncodedURL(getString(maxCandidates)));
        }

        Log.d("The Geo search request URL is "+urlBuilder.toString());

        _GetRestService = new GetRestService(context, urlBuilder.toString(),
                null,this, new RequestObserver<String>() {

                    @Override
                    public void onSucess(String geoSearch) {
                        // Log.d("Got Geo Search Details" + data);
                        // Parsing would take place here

                        GeoSearch geoSearchObj = null;

                        try {
                            JSONObject responseObj = new JSONObject(geoSearch);
                            Gson gson = new Gson();
                            geoSearchObj = gson.fromJson(
                                    responseObj.toString(), GeoSearch.class);

                            Log.d("Got the geoSearch Objeect" + geoSearchObj);
                            Log.d("The size is "
                                    + geoSearchObj.getLocation().length);

                        } catch (JSONException e) {
                            Log.e("Excpetion in Json parsing of geo search"
                                    + e.getMessage());

                            ErrorResponse errorResponse = new ErrorResponse(
                                    Utils.getInternalErrorResponseObject(
                                            e.getMessage(), e));
                            errorResponse.setRootErrorMessage(e.getMessage());
                            requestObserver.onFailure(errorResponse);

                            return;

                        }


                        requestObserver.onSucess(geoSearchObj);
                    }

                    @Override
                    public void onRequestStart() {
                        Log.d("Geo Search request has been started");
                        requestObserver.onRequestStart();
                    }

                    @Override
                    public void onFailure(ErrorResponse errorResponse) {
                        Log.d("Oops Retrieval of Geo Search failes");
                        
                        requestObserver.onFailure(errorResponse);
                    	

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
