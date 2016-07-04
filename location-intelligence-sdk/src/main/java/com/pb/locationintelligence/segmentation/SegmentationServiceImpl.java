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

package com.pb.locationintelligence.segmentation;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.google.gson.Gson;
import com.pb.locationintelligence.OAuth.AuthToken;
import com.pb.locationintelligence.OAuth.OAuthService;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.network.ErrorResponse;
import com.pb.locationintelligence.network.GetRestService;
import com.pb.locationintelligence.segmentation.model.Segmentation;
import com.pb.locationintelligence.utils.Log;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utils;

/**
 * SegmentationService Implementation Class
 *
 */
public class SegmentationServiceImpl extends OAuthService implements SegmentationService {

    private GetRestService _GetRestService = null;
    private static final String geoLifeSegmentationUrl = "/geolife/v1/segmentation/";
    private UrlMaker urlMaker;

	@Override
	public void getSegmentationByAddress(final Context context, final String address, final String country,
                                         final RequestObserver<Segmentation> requestObserver) {
        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is successful, It's time to call GeoLife Segmentation API ");
                urlMaker = UrlMaker.getInstance();
                StringBuilder urlBuilder = new StringBuilder(urlMaker
                        .getAbsoluteUrl(geoLifeSegmentationUrl));
                urlBuilder.append("byaddress?").append("address=")
                        .append(urlMaker.getEncodedURL(getString(address)));
                if (country != null) {
                    urlBuilder.append("&country=").append(urlMaker.getEncodedURL(getString(country)));
                }

                getGeoLifeSegmentationResponse(context, urlBuilder.toString(), true,
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
	public void getSegmentationByLocation(final Context context, final Double longitude, final Double latitude,
                                          final RequestObserver<Segmentation> requestObserver) {
        {
            super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

                @Override
                public void onSucess(AuthToken data) {
                    Log.d("Authentication is successful, It's time to call GeoLife Segmentation API ");
                    urlMaker = UrlMaker.getInstance();
                    StringBuilder urlBuilder = new StringBuilder(urlMaker
                            .getAbsoluteUrl(geoLifeSegmentationUrl));
                    urlBuilder.append("bylocation?").append("latitude=")
                            .append(urlMaker.getEncodedURL(getString(latitude))).append("&longitude=")
                            .append(urlMaker.getEncodedURL(getString(longitude)));
                    getGeoLifeSegmentationResponse(context, urlBuilder.toString(), false,
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
	}

    private void getGeoLifeSegmentationResponse(final Context context, final String url,
                                    final boolean byAddress,
                                    final RequestObserver<Segmentation> requestObserver) {

        final String method = (byAddress) ? "Address " : "Location ";
        Log.d("Calling GeoLife Service to retrieve Segmentation details by "
                + method);
        _GetRestService = new GetRestService(context, url, null, this,
                new RequestObserver<String>() {

                    @Override
                    public void onSucess(String data) {
                        Log.d("Segmentation Details By " + method);
                        Segmentation response = null;
                        try {
                            JSONObject jsonResponse = new JSONObject(data);
                            Gson gson = new Gson();
                            response = gson.fromJson(jsonResponse.toString(),
                                    Segmentation.class);

                            Log.d("Got the Segmentation Response " + response);

                        } catch (JSONException e) {
                            Log.e("Excpetion in Json parsing of geoLife Segmentation reponse : "
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
                        Log.d("Segmentation Details By " + method
                                + "request has been started");
                        requestObserver.onRequestStart();
                    }

                    @Override
                    public void onFailure(ErrorResponse errorData) {
                        Log.d("Oops Retrieval of Segmentation Details By "
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
