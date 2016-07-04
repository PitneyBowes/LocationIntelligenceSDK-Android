
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
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.pb.locationintelligence.interfaces.RequestExecutor;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.network.LIError.Errors;
import com.pb.locationintelligence.utils.Log;

/**
 * Abstract class for executing rest network calss and handling all kind of
 * network exceptions
 * 
 * @author ga007ja
 * 
 */
public abstract class RestService implements RequestExecutor {

    protected RequestQueue _RequestQueue = null;

    protected RequestObserver<String> _RequestObserver = null;

    protected JsonObjectRequest _Request = null;

    protected String _ApiKey = null;
    protected String _Secret = null;

    public RestService(Context context,
            RequestObserver<String> _DownloadObserver) {

        this._RequestObserver = _DownloadObserver;
        this._RequestQueue = Volley.newRequestQueue(context);
    }

    protected Response.Listener<JSONObject> reponseListener = new Listener<JSONObject>() {

        @Override
        public void onResponse(JSONObject response) {

            Log.d("Http response got " + response);
            _RequestObserver.onSucess(response.toString());
        }
    };

    protected Response.ErrorListener errorListener = new ErrorListener() {

        @Override
        public void onErrorResponse(VolleyError vollyError) {

            NetworkResponse response = vollyError.networkResponse;
            if (response != null && response.data != null) {
                VolleyError error = new VolleyError(new String(
                        vollyError.networkResponse.data));

                Log.d("Http error response got "
                        + vollyError.networkResponse.statusCode + " "
                        + error.getMessage());

                String json = null;

                json = new String(response.data);

                ErrorResponse errorResponse;
                LIError sesErRs = new LIError();

                try {
                    JSONObject responseObj = new JSONObject(json);

                    if (!responseObj.isNull("error")) {
                        // Authentication specific exception
                        String erMsg = responseObj.getString("error");

                        Log.d("Got the Authentication Response Object" + erMsg);

                        LIErrorResponse sesErrorResponse = new LIErrorResponse();
                        Errors[] erArray = null;
                        erArray = new Errors[1];
                        Errors errors = sesErRs.new Errors();
                        erArray[0] = errors;
                        erArray[0].setErrorDescription(erMsg);
                        sesErRs.setErrors(erArray);
                        sesErrorResponse.setLIError(sesErRs);

                        if (vollyError.networkResponse != null)
                            sesErrorResponse
                                    .setHttpStatusCode(vollyError.networkResponse.statusCode);
                        errorResponse = new ErrorResponse(sesErrorResponse);
                        errorResponse.setRootErrorMessage(erMsg);

                    } else {
                        // LI specific exceptions handling

                        Gson gson = new Gson();
                        sesErRs = gson.fromJson(responseObj.toString(),
                                LIError.class);

                        Log.d("Got the LIError Response Object" + sesErRs);

                        LIErrorResponse sesErrorResponse = new LIErrorResponse();
                        sesErrorResponse.setLIError(sesErRs);
                        if (vollyError.networkResponse != null)
                            sesErrorResponse
                                    .setHttpStatusCode(vollyError.networkResponse.statusCode);
                        errorResponse = new ErrorResponse(sesErrorResponse);
                        errorResponse.setRootErrorMessage(error.getMessage());

                    }

                } catch (JSONException e) {
                    Log.e("Excpetion in Json parsing" + e.getMessage());

                    InternalErrorResponse internalErrorResponse = new InternalErrorResponse();
                    internalErrorResponse.setException(e);
                    internalErrorResponse
                            .setGenericErrorMessage(e.getMessage());

                    errorResponse = new ErrorResponse(internalErrorResponse);
                    errorResponse.setRootErrorMessage(e.getMessage());

                }
                _RequestObserver.onFailure(errorResponse);
            } else {

                Log.d("There is some problem in rest get apis calls, "
                        + "got some exception from server " + vollyError);
                // If there is something else

                InternalErrorResponse internalErrorResponse = new InternalErrorResponse();
                ErrorResponse er = new ErrorResponse(internalErrorResponse);

                er.setRootErrorMessage(vollyError.getLocalizedMessage());
                internalErrorResponse.setGenericErrorMessage(vollyError
                        .toString());

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
