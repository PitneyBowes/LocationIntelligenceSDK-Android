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

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


import android.content.Context;

import com.google.gson.Gson;
import com.pb.locationintelligence.OAuth.AuthToken;
import com.pb.locationintelligence.OAuth.OAuthService;
import com.pb.locationintelligence.geo911.model.PsapResponse;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.network.ErrorResponse;
import com.pb.locationintelligence.network.GetRestService;
import com.pb.locationintelligence.utils.Log;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utils;

public class Geo911ServiceImpl extends OAuthService implements
        Geo911Service {

    private GetRestService _GetRestService = null;
    private String geo911Url = "/geo911/v1/psap/";
    private UrlMaker urlMaker;

    @Override
    public void getPSAPByAddress(final Context context, final String address,
            final RequestObserver<PsapResponse> requestObserver) {

        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is sucessfull, It's time to call Geo911 API ");
                urlMaker = UrlMaker.getInstance();
                String url = urlMaker.getAbsoluteUrl(geo911Url) + "byaddress?"
                        + "address=" + urlMaker.getEncodedURL(getString(address));
                getGeo911Response(context, url, true, requestObserver);
            }

            @Override
            public void onRequestStart() {
                Log.d("Authentication request has been started for Geo911 ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });

    }

    @Override
    public void getPSAPByLocation(final Context context, final Double latitude,
            final Double longitude,
            final RequestObserver<PsapResponse> requestObserver) {

        super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

            @Override
            public void onSucess(AuthToken data) {
                Log.d("Authentication is sucessfull, It's time to call Geo911 API ");
                urlMaker = UrlMaker.getInstance();
                String url = urlMaker.getAbsoluteUrl(geo911Url) + "bylocation?"
                        + "latitude=" + urlMaker.getEncodedURL(getString(latitude)) + "&longitude=" + urlMaker.getEncodedURL(getString(longitude));
                getGeo911Response(context, url, false, requestObserver);
            }

            @Override
            public void onRequestStart() {
                Log.d("Authentication request has been started for Geo911 ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });
    }
    
	private String getString(Object value) {
		if (value == null) {
			return "";
		}
		return value.toString();
	}
	
    /**
     * 
     * @param context
     * @param url
     *            - Geo911 API Service URL
     * @param byAddress
     *            - Flag that will idetify the method and log accordingly
     * @param requestObserver
     */
    private void getGeo911Response(final Context context, final String url,
            final boolean byAddress,
            final RequestObserver<PsapResponse> requestObserver) {

        final String method = (byAddress) ? "Address " : "Location ";
        Log.d("Calling Geo911 Service to retrieve PSAP details by " + method);
        _GetRestService = new GetRestService(context, url, null,
                this, new RequestObserver<String>() {

                    @Override
                    public void onSucess(String data) {
                        Log.d("PSAP Details By " + method);
                        PsapResponse response = null;
                        try {
                            JSONObject jsonResponse = new JSONObject(data);
                            Gson gson = new Gson();
                            response = gson.fromJson(jsonResponse.toString(),
                                    PsapResponse.class);

                            Log.d("Got the PSAP Response " + response);

                        } catch (JSONException e) {
                            // @TODO: Exception Handling required.
                            Log.e("Excpetion in Json parsing of geo911 Psap reponse : "
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
                        Log.d("PSAP Details By " + method
                                + "request has been started");
                        requestObserver.onRequestStart();
                    }

                    @Override
                    public void onFailure(ErrorResponse errorData) {
                        Log.d("Oops Retrieval of PSAP Details By " + method
                                + "failed");
                        requestObserver.onFailure(errorData);
                    }
                });
        _GetRestService.execute();
    }
}
