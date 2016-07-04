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

import android.content.Context;

import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.utils.Log;

public class OAuthService implements BaseOAuthService{

    private static AuthToken authToken;
    
    public void getAuthenticationToken(Context context, final RequestObserver<AuthToken> requestObserver) {
    	if (authToken != null) {
            Log.d("Token is already generated");
            requestObserver.onSucess(authToken);
        }
    	else{
    	  OAuthFactory.getOAuthService().getAuthenticationToken(context, requestObserver);
    	}
    }

    public void invalidateAuthenticationToken(Context context) {
        if (authToken != null) {
            authToken = null;
            Log.d("Token has been deleted");
        }
    }
    
    protected void setAuthToken(AuthToken token){
    	authToken = token;
    }
    
    public boolean isTokenAvailable(){
    	return authToken!=null && !authToken.getAuthToken().equals("");
    			}
    
    public AuthToken getToken(){
    	if(authToken!=null){
    		return authToken;
    	}
    	return null;
    }
    
}
