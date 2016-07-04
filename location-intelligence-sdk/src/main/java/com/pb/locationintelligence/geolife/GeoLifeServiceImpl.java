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

import com.google.gson.Gson;
import com.pb.locationintelligence.OAuth.AuthToken;
import com.pb.locationintelligence.OAuth.OAuthService;
import com.pb.locationintelligence.geolife.model.GeoLifeResponse;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.network.ErrorResponse;
import com.pb.locationintelligence.network.GetRestService;
import com.pb.locationintelligence.utils.Log;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utils;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * GeoLifeService Implementation Class
 *
 */
public class GeoLifeServiceImpl extends OAuthService implements GeoLifeService {

    private GetRestService _GetRestService = null;
    private String geoLilfeUrl = "/geolife/v1/demographics/";
    private UrlMaker urlMaker;

    @Override
    public void getDemographicsByAddress(final Context context,
                                         final String address, final String country, final String profile,
                                         final String filter,
                                         final RequestObserver<GeoLifeResponse> requestObserver) {

        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is sucessfull, It's time to call GeoLife API ");
                urlMaker = UrlMaker.getInstance();
                StringBuilder urlBuilder = new StringBuilder(urlMaker
                        .getAbsoluteUrl(geoLilfeUrl));
                urlBuilder.append("byaddress?").append("address=")
                        .append(urlMaker.getEncodedURL(getString(address)));
                if (country != null) {
                    urlBuilder.append("&country=").append(urlMaker.getEncodedURL(getString(country)));
                }
                if (profile != null) {
                    urlBuilder.append("&profile=").append(urlMaker.getEncodedURL(getString(profile)));
                }
                if (filter != null) {
                    urlBuilder.append("&filter=").append(urlMaker.getEncodedURL(getString(filter)));
                }
                getGeoLifeResponse(context, urlBuilder.toString(), true,
                        requestObserver);
            }

            @Override
            public void onRequestStart() {
                Log.d("Authentication request has been started for GeoLife ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });

    }

    @Override
    public void getDemographicsByLocation(final Context context,
                                          final Double latitude, final Double longitude,
                                          final String profile, final String filter,
                                          final RequestObserver<GeoLifeResponse> requestObserver) {

        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is sucessfull, It's time to call GeoLife API ");
                urlMaker = UrlMaker.getInstance();
                StringBuilder urlBuilder = new StringBuilder(urlMaker
                        .getAbsoluteUrl(geoLilfeUrl));
                urlBuilder.append("bylocation?").append("latitude=")
                        .append(urlMaker.getEncodedURL(getString(latitude))).append("&longitude=")
                        .append(urlMaker.getEncodedURL(getString(longitude)));
                if (profile != null) {
                    urlBuilder.append("&profile=").append(urlMaker.getEncodedURL(getString(profile)));
                }
                if (filter != null) {
                    urlBuilder.append("&filter=").append(urlMaker.getEncodedURL(getString(filter)));
                }
                getGeoLifeResponse(context, urlBuilder.toString(), false,
                        requestObserver);
            }

            @Override
            public void onRequestStart() {
                Log.d("Authentication request has been started for GeoLife ");

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
     *            - GeoLife API Service URL
     * @param byAddress
     *            - Flag that will idetify the method and log accordingly
     * @param requestObserver
     */
    private void getGeoLifeResponse(final Context context, final String url,
                                    final boolean byAddress,
                                    final RequestObserver<GeoLifeResponse> requestObserver) {

        final String method = (byAddress) ? "Address " : "Location ";
        Log.d("Calling GeoLife Service to retrieve Demographics details by "
                + method);
        _GetRestService = new GetRestService(context, url, null, this,
                new RequestObserver<String>() {

                    @Override
                    public void onSucess(String data) {
                        Log.d("Demographics Details By " + method);
                        GeoLifeResponse response = null;
                        try {
                            JSONObject jsonResponse = new JSONObject(data);
                            Gson gson = new Gson();
                            response = gson.fromJson(jsonResponse.toString(),
                                    GeoLifeResponse.class);

                            Log.d("Got the Demographics Response " + response);

                        } catch (JSONException e) {
                            Log.e("Excpetion in Json parsing of geoLife reponse : "
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
                        Log.d("Demographics Details By " + method
                                + "request has been started");
                        requestObserver.onRequestStart();
                    }

                    @Override
                    public void onFailure(ErrorResponse errorData) {
                        Log.d("Oops Retrieval of Demographics Details By "
                                + method + "failed");
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
