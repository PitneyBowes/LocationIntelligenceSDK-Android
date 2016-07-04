
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

package com.pb.locationintelligence.OAuth;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.util.Base64;

import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.network.ErrorResponse;
import com.pb.locationintelligence.network.InternalErrorResponse;
import com.pb.locationintelligence.network.PostRestStringService;
import com.pb.locationintelligence.utils.Log;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utils;

/**
 * Implementation of BaseOAuthService interface. Provides implementation to get
 * the Access Token from APIM portal.
 * 
 * @author ga007ja
 * 
 */
public class BaseOAuthServiceImpl extends OAuthService implements BaseOAuthService {

    private PostRestStringService _PostRestService = null;
    private String OauthUrl = "oauth/token";
    private UrlMaker maker;
    private String consumerKey;
    private String consumerSecretKey;
    private boolean tokenRegeneration = true;
    
    public BaseOAuthServiceImpl(String consumerKey, String consumerSecretKey) {
		this.consumerKey = consumerKey;
		this.consumerSecretKey = consumerSecretKey;
	}
    
    public BaseOAuthServiceImpl(String token) {
    	this.tokenRegeneration = false;
    	setAuthToken(new AuthToken(token));
	} 

    @Override
    public void getAuthenticationToken(final Context context,
            final RequestObserver<AuthToken> requestObserver) {
    	
    	
    	
    
        // Token is not generated yet
        if (getToken() == null && tokenRegeneration) {

            Log.d("It seems token is not generated yet, Going for OAuth mechanism");
            maker = UrlMaker.getInstance();
            String url = maker.getAbsoluteUrl(OauthUrl);

            _PostRestService = new PostRestStringService(context, url, createHeader(),
                    new RequestObserver<String>() {
            	 AuthToken authToken = null;
                        @Override
                        public void onSucess(String data) {

                            String access_token;
                            // Need to handle data here
                            Log.d("Got the OAuth HTTP response data and that is "
                                    + data);
                            // try parse the string to a JSON object
                            try {
                                JSONObject jsonObject = new JSONObject(data
                                        .toString());
                                access_token = jsonObject
                                        .getString("access_token");
                                authToken = new AuthToken(access_token);
                               
                                Log.d("Sucessfully got access_token  "
                                        + access_token);

                            } catch (JSONException e) {
                                Log.e("Error parsing data " + e.toString());

                                ErrorResponse errorResponse = new ErrorResponse(
                                        Utils.getInternalErrorResponseObject(
                                                e.getMessage(), e));
                                errorResponse.setRootErrorMessage(e
                                        .getMessage());

                                requestObserver.onFailure(errorResponse);
                            }
                            setAuthToken(authToken);
                            requestObserver.onSucess(authToken);

                        }

                        @Override
                        public void onRequestStart() {
                            Log.d("OAuth request has been started");
                            requestObserver.onRequestStart();
                        }

                        @Override
                        public void onFailure(ErrorResponse errorData) {
                        	if(authToken != null && errorData.getLIErrorResponse().getHttpStatusCode() == 401){
                        		Log.d("Hey it seems oauth token is expired");
                        		invalidateAuthenticationToken(context);
                        		getAuthenticationToken(context, requestObserver);
                        	}
                            Log.d("Oops its OAuth failure");
                            requestObserver.onFailure(errorData);

                        }
                    });
            _PostRestService.execute();
        }
        else{
        	if(!tokenRegeneration){
        		InternalErrorResponse response = new InternalErrorResponse();
        		response.setGenericErrorMessage("Token is expired or not set.");
        		response.setException(new IllegalStateException("Token not available"));
        		requestObserver.onFailure(new ErrorResponse(response));
        		return;
        	}
        }
        
    }
    
    private Map<String, String> createHeader(){
    	  Map<String, String> header = new HashMap<String, String>();
          header.put("Accept", "application/json");
          header.put("grant_type", "client_credentials");
          String credentials = consumerKey + ":" + consumerSecretKey;
          String base64EncodedCredentials = Base64.encodeToString(
                  credentials.getBytes(), Base64.NO_WRAP);
          Log.d("The header is " + base64EncodedCredentials);
          header.put("Authorization", "Basic " + base64EncodedCredentials);
          Log.d("Header Authentication has been added");
          return header;
    }
    
    @Override
    public void invalidateAuthenticationToken(Context context) {

        if (getToken() != null) {
            setAuthToken(null);
            Log.d("Token has been deleted");
        }
    }

}
