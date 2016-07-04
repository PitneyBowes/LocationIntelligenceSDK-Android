
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

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.pb.locationintelligence.OAuth.AuthToken;
import com.pb.locationintelligence.OAuth.OAuthService;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.utils.Log;

import android.content.Context;

public class PostRestService extends RestService {

    private JSONObject _Data = null;

    public PostRestService(Context context, String url, JSONObject data, final OAuthService service,
            RequestObserver<String> requestObserver) {

        super(context, requestObserver);
        this._RequestObserver = new AuthObserverProxy(context, service, requestObserver);
     
        Log.d("HTTP Post connection to " + url);
        _Data = data;
        
                _Request = new JsonObjectRequest(Request.Method.POST, url, _Data,
                        reponseListener, errorListener) {

                    @Override
                    public Map<String, String> getHeaders() throws AuthFailureError {
                        Map<String, String> header = new HashMap<String, String>();
                        //header.put("Content-Type", "application/json");
                        header.put("Accept", "application/json");
                        if(service.isTokenAvailable()){
                        	header.put("Authorization",service.getToken().toString());
                        }
                        return header;
                    }

                    @Override
                    protected VolleyError parseNetworkError(VolleyError volleyError) {
                        if (volleyError.networkResponse != null
                                && volleyError.networkResponse.data != null) {
                            VolleyError error = new VolleyError(
                                    volleyError.networkResponse);
                            Log.d("The volley error network data is "
                                    + volleyError.networkResponse.statusCode);
                            volleyError = error;
                        } else {

                            Log.d(" Get : The volley error network data is null");
                        }

                        return volleyError;
                    }

                    @Override
                    protected Response<JSONObject> parseNetworkResponse(
                            NetworkResponse response) {
                        Log.d("The response status is " + response.statusCode);
                        return super.parseNetworkResponse(response);
                    }

                };
    }
    
    private class AuthObserverProxy implements RequestObserver<String>{

    	private RequestObserver<String> target;
    	private OAuthService service;
    	private Context context;
    	public AuthObserverProxy(Context context,OAuthService service, RequestObserver<String> observer) {
    		this.target = observer;
    		this.service = service;
    		this.context = context;
    	}
    	


		@Override
		public void onRequestStart() {

			target.onRequestStart();
		}

		@Override
		public void onSucess(String response) {
			target.onSucess(response);
		}

		@Override
		public void onFailure(ErrorResponse errorResponse) {
			if(isAuthorizationFailure(errorResponse)){
				service.invalidateAuthenticationToken(context);
				service.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

					@Override
					public void onRequestStart() {
						
					}

					@Override
					public void onSucess(AuthToken response) {
						PostRestService.this.execute();						
					}

					@Override
					public void onFailure(ErrorResponse authResponse) {
						
						target.onFailure(authResponse);
						
					}
				});
				return;
			
			}
			target.onFailure(errorResponse);
			
		}
		
		private boolean isAuthorizationFailure(ErrorResponse errorResponse){
			if(service.getToken()!=null &&  errorResponse.getLIErrorResponse() !=null && errorResponse.getLIErrorResponse().getHttpStatusCode()==401){
			  Log.d("Hey it seems oauth token is expired");
				return true;
			}
			return false;
		}
    	
    }
}
