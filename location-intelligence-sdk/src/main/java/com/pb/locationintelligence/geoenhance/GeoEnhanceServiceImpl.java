
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

package com.pb.locationintelligence.geoenhance;

import android.content.Context;

import com.google.gson.Gson;
import com.pb.locationintelligence.OAuth.AuthToken;
import com.pb.locationintelligence.OAuth.OAuthService;
import com.pb.locationintelligence.geoenhance.model.GeoEnhanceResponse;
import com.pb.locationintelligence.geoenhance.model.TimezoneResponse;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.network.ErrorResponse;
import com.pb.locationintelligence.network.GetRestService;
import com.pb.locationintelligence.utils.Log;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utils;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

public class GeoEnhanceServiceImpl extends OAuthService implements
        GeoEnhanceService {

    private GetRestService _GetRestService = null;
    private String geoEnhanceUrl = "/geoenhance/v1";
    private UrlMaker urlMaker;

    @Override
    public void getAddress(final Context context, final Double latitude,
            final Double longitude, final Float searchRadius,
            final String searchRadiusUnit,
            final RequestObserver<GeoEnhanceResponse> requestObserver) {

        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is sucessfull, It's time to call GeoEnhance API getAddress");
                urlMaker = UrlMaker.getInstance();
                StringBuilder urlBuilder = new StringBuilder(urlMaker
                        .getAbsoluteUrl(geoEnhanceUrl));
                urlBuilder.append("/address/bylocation?").append("latitude=")
                        .append(urlMaker.getEncodedURL(latitude.toString())).append("&longitude=")
                        .append(urlMaker.getEncodedURL(longitude.toString()));
                if (searchRadius != null) {
                    urlBuilder.append("&searchRadius=").append(urlMaker.getEncodedURL(searchRadius.toString()));
                }
                
                if (searchRadiusUnit != null) {
                    urlBuilder.append("&searchRadiusUnit=").append(urlMaker.getEncodedURL(searchRadiusUnit.toString()));
                }
                
                getGeoEnhanceResponse(context, urlBuilder.toString(), null,
                        "getAddress", requestObserver);
            }

            @Override
            public void onRequestStart() {
                Log.d("Authentication request has been started for GeoEnhance getAddress ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });

    }

    @Override
    public void getPlace(final Context context, final Double latitude,
            final Double longitude, final Integer levelHint,
            final RequestObserver<GeoEnhanceResponse> requestObserver) {

        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is sucessfull, It's time to call GeoEnhance getPlace ");
                urlMaker = UrlMaker.getInstance();
                StringBuilder urlBuilder = new StringBuilder(urlMaker
                        .getAbsoluteUrl(geoEnhanceUrl));
                urlBuilder.append("/place/bylocation?").append("latitude=")
                        .append(urlMaker.getEncodedURL(getString(latitude))).append("&longitude=")
                        .append(urlMaker.getEncodedURL(getString(longitude)));
                if (levelHint != null) {
                    urlBuilder.append("&levelHint=").append(urlMaker.getEncodedURL(getString(levelHint)));
                }
                getGeoEnhanceResponse(context, urlBuilder.toString(), null,
                        "getPlace", requestObserver);
            }

            @Override
            public void onRequestStart() {
                Log.d("Authentication request has been started for GeoEnhance getPlace ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });

    }

    @Override
    public void getPOI(final Context context, final Double latitude,
            final Double longitude, final String category,
            final Integer maxCandidates, final Float searchRadius,
            final String searchRadiusUnit, final String searchDataset,
            final String searchByPriority,
            final RequestObserver<GeoEnhanceResponse> requestObserver) {

        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is sucessfull, It's time to call GeoEnhance getPOI ");
                urlMaker = UrlMaker.getInstance();
                StringBuilder urlBuilder = new StringBuilder(urlMaker
                        .getAbsoluteUrl(geoEnhanceUrl));
                urlBuilder.append("/poi/bylocation?").append("latitude=").append(urlMaker.getEncodedURL(getString(latitude)))
                        .append("&longitude=").append(urlMaker.getEncodedURL(getString(longitude)));
                if (category != null) {
                    urlBuilder.append("&category=").append(urlMaker.getEncodedURL(getString(category)));
                }
                if (maxCandidates != null) {
                    urlBuilder.append("&maxCandidates=").append(urlMaker.getEncodedURL(getString(maxCandidates)));
                }
                if (searchRadius != null) {
                    urlBuilder.append("&searchRadius=").append(urlMaker.getEncodedURL(getString(searchRadius)));
                }
                if (searchRadiusUnit != null) {
                    urlBuilder.append("&searchRadiusUnit=").append
                    		(urlMaker.getEncodedURL(getString(searchRadiusUnit)));
                }
                if (searchByPriority != null) {
                    urlBuilder.append("&searchPriority=").append(
                    		urlMaker.getEncodedURL(getString(searchByPriority)));
                }
                if (searchDataset != null) {
                    urlBuilder.append("&searchDataset=").append(urlMaker.getEncodedURL(getString(searchDataset)));
                }
                getGeoEnhanceResponse(context, urlBuilder.toString(), null,
                        "getPOI", requestObserver);
            }

            @Override
            public void onRequestStart() {
                Log.d("Authentication request has been started for GeoEnhance getPOI ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });

    }

    /**
     * 
     * @param context
     * @param url
     * @param methodName
     * @param requestObserver
     */
    private void getGeoEnhanceResponse(final Context context, final String url,
            final Map<String, String> header, final String methodName,
            final RequestObserver<GeoEnhanceResponse> requestObserver) {

        Log.d("Calling GeoEnhance Service to retrieve Locations List "
                + methodName);
        _GetRestService = new GetRestService(context, url, header, this,
                new RequestObserver<String>() {

                    @Override
                    public void onSucess(String data) {
                        Log.d("Location List By " + methodName + " received");
                        GeoEnhanceResponse response = null;
                        try {
                            JSONObject jsonResponse = new JSONObject(data);
                            Gson gson = new Gson();
                            response = gson.fromJson(jsonResponse.toString(),
                                    GeoEnhanceResponse.class);

                            Log.d("Got the GeoEnhance Response " + response);

                        } catch (JSONException e) {
                            Log.e("Excpetion in Json parsing of geoenhance reponse : "
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
                        Log.d("Locations By " + methodName
                                + "request has been started");
                        requestObserver.onRequestStart();
                    }

                    @Override
                    public void onFailure(ErrorResponse errorData) {
                        Log.d("Oops Retrieval of Location List By "
                                + methodName + "failed");
                        requestObserver.onFailure(errorData);
                    }
                });
        _GetRestService.execute();
    }
    
    /**
     * 
     * @param context
     * @param url
     * @param methodName
     * @param requestObserver
     */
    private void getTimezoneResponse(final Context context, final String url,
            final Map<String, String> header,
            final RequestObserver<TimezoneResponse> requestObserver) {

        Log.d("Calling GeoEnhance Service to retrieve timezone");
        _GetRestService = new GetRestService(context, url, header, this,
                new RequestObserver<String>() {

                    @Override
                    public void onSucess(String data) {
                        Log.d("Timezone by location received");
                        TimezoneResponse response = null;
                        try {
                            JSONObject jsonResponse = new JSONObject(data);
                            Gson gson = new Gson();
                            response = gson.fromJson(jsonResponse.toString(),
                            		TimezoneResponse.class);

                            Log.d("Got the timezone Response " + response);

                        } catch (JSONException e) {
                            Log.e("Excpetion in Json parsing of timezone reponse : "
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
                        Log.d("Timezone by location request has been started");
                        requestObserver.onRequestStart();
                    }

                    @Override
                    public void onFailure(ErrorResponse errorData) {
                        Log.d("Oops Retrieval of Timezone By location failed");
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

	@Override
	public void getTimezone(final Context context, final String timestamp, final Double latitude, final Double longitude, final RequestObserver<TimezoneResponse> requestObserver) {
		super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is successfull, It's time to call GeoEnhance getTimezone ");
                urlMaker = UrlMaker.getInstance();
                StringBuilder urlBuilder = new StringBuilder(urlMaker
                        .getAbsoluteUrl(geoEnhanceUrl));
                urlBuilder.append("/timezone/bylocation?").append("timestamp=").append(urlMaker.getEncodedURL(getString(timestamp))).
                append("&latitude=").append(urlMaker.getEncodedURL(getString(latitude)))
                        .append("&longitude=").append(urlMaker.getEncodedURL(getString(longitude)));
                
                getTimezoneResponse(context, urlBuilder.toString(), null,
                         requestObserver);
            }

            @Override
            public void onRequestStart() {
                Log.d("Authentication request has been started for GeoEnhance getTimezone ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });
		
	}

	
}
