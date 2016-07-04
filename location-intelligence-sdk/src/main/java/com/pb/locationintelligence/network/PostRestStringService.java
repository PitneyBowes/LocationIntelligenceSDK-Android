
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

package com.pb.locationintelligence.network;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.entity.StringEntity;
import org.json.JSONObject;

import android.content.Context;
import android.util.Base64;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.pb.locationintelligence.interfaces.LIServiceManager;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.utils.Log;

/**
 * Dedicated class for providing Post type Rest network calls and obtaining
 * response in string format
 * 
 * @author ga007ja
 * 
 */
public class PostRestStringService extends RestStringService {
    private StringEntity se = null;

    // Generic request
    public PostRestStringService(Context context, String url,
            RequestObserver<String> downloadObserver) {

        super(context, downloadObserver);
        String sendUrl = url.replaceAll(" ", "%20");

        _Request = new StringRequest(Request.Method.POST, sendUrl,
                reponseListener, errorListener);
    }

    // APIM specific request with customized header

    public PostRestStringService(Context context, String url,
            final Map<String, String> header,
            RequestObserver<String> downloadObserver) {

        super(context, downloadObserver);

        // APIM specific body
        try {
            se = new StringEntity("grant_type=client_credentials");
            se.setContentType("application/x-www-form-urlencoded");
            Log.d("SE content has been set");
        } catch (UnsupportedEncodingException e) {
            VolleyLog.e("UnsupportedEncodingException to setContentType");
        }

        String sendUrl = url.replaceAll(" ", "%20");

        Log.d("HTTP Post connection to " + sendUrl);

        _Request = new StringRequest(Request.Method.POST, sendUrl,
                reponseListener, errorListener) {

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Log.d("Inside PostRestStringService@getHeaders");
                return header;
                
            }

            @Override
            public byte[] getBody() {

                // APIM specific body

                String httpPostBody = "grant_type=client_credentials";

                Log.d("custom has been added as per APIM");

                return httpPostBody.getBytes();
            }

            @Override
            protected VolleyError parseNetworkError(VolleyError volleyError) {

                Log.d("The VolleyError is " + volleyError.getMessage());

                if (volleyError.networkResponse != null
                        && volleyError.networkResponse.data != null) {
                    VolleyError error = new VolleyError(
                            volleyError.networkResponse);
                    Log.d("The volley error network data is "
                            + volleyError.networkResponse.statusCode);
                    volleyError = error;
                } else {

                    Log.d("POST : The volley error network data is null");
                }

                return volleyError;
            }

            @Override
            protected Response<String> parseNetworkResponse(
                    NetworkResponse response) {
                return super.parseNetworkResponse(response);
            }

        };

    }

}
