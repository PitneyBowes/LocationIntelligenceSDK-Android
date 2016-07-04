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

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.pb.locationintelligence.interfaces.RequestExecutor;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.network.LIError.Errors;
import com.pb.locationintelligence.utils.Log;
import com.pb.locationintelligence.utils.Utils;

public class RestStringService implements RequestExecutor {

    protected RequestQueue _RequestQueue = null;

    protected RequestObserver<String> _RequestObserver = null;

    protected StringRequest _Request = null;

    protected String _ApiKey = null;
    protected String _Secret = null;

    public RestStringService(Context context,
            RequestObserver<String> _DownloadObserver) {

        this._RequestObserver = _DownloadObserver;
        this._RequestQueue = Volley.newRequestQueue(context);
    }

    protected Response.Listener<String> reponseListener = new Listener<String>() {

        @Override
        public void onResponse(String response) {

            Log.d("Http response got " + response);
            _RequestObserver.onSucess(response);
        }

    };

    protected Response.ErrorListener errorListener = new ErrorListener() {

        @SuppressWarnings("unused")
        @Override
        public void onErrorResponse(VolleyError volleyError) {

            NetworkResponse response = volleyError.networkResponse;
            if (response != null && response.data != null) {
                VolleyError error = new VolleyError(new String(
                        volleyError.networkResponse.data));

                Log.d("Http error response got "
                        + volleyError.networkResponse.statusCode + " "
                        + error.getMessage());

                String json = null;
                ErrorResponse errorResponse;

                json = new String(response.data);

                LIError sesErRs = new LIError();

                // Right now there is not as such post methods by LI services
                // So, only giving support to APIM OAuth ( that is POST only )
                try {
                    JSONObject responseObj = new JSONObject(json);

                    LIErrorResponse sesErrorResponse = new LIErrorResponse();
                    Errors[] erArray = null;

                    if (!responseObj.isNull("error")) {
                        // Authentication specific exception
                        String erMsg = responseObj.getString("error");

                        Log.d("Got the Authentication Response Object" + erMsg);
                        erArray = new Errors[1];
                        Errors errors = sesErRs.new Errors();
                        erArray[0] = errors;
                        erArray[0].setErrorDescription(erMsg);

                    } else {
                        erArray = new Errors[1];
                        Errors errors = sesErRs.new Errors();
                        erArray[0] = errors;
                        erArray[0].setErrorDescription(error.getMessage());
                    }

                    sesErRs.setErrors(erArray);
                    sesErrorResponse.setLIError(sesErRs);
                    if (volleyError.networkResponse != null)
                        sesErrorResponse
                                .setHttpStatusCode(volleyError.networkResponse.statusCode);
                    errorResponse = new ErrorResponse(sesErrorResponse);
                    errorResponse.setRootErrorMessage(error.getMessage());

                } catch (JSONException e) {
                    Log.e("Excpetion in Json parsing" + e.getMessage());

                    errorResponse = new ErrorResponse(
                            Utils.getInternalErrorResponseObject(
                                    e.getMessage(), e));
                    errorResponse.setRootErrorMessage(e.getMessage());
                }

                _RequestObserver.onFailure(errorResponse);

            } else {

                // If there is something else
                ErrorResponse er = new ErrorResponse();
                if (volleyError == null) {
                    er.setRootErrorMessage("Something wrong, Please try after some time");
                } else {
                    er.setRootErrorMessage(volleyError.getMessage());
                }

                _RequestObserver.onFailure(er);
            }
        }

    };

    @Override
    public void execute() {

        _RequestQueue.add(_Request);
        _RequestObserver.onRequestStart();

    }

}
