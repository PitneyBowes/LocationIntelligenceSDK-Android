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

package com.pb.locationintelligence.geocomm;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.pb.locationintelligence.OAuth.AuthToken;
import com.pb.locationintelligence.OAuth.OAuthService;
import com.pb.locationintelligence.geocomm.model.RateCenterResponse;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.network.ErrorResponse;
import com.pb.locationintelligence.network.GetRestService;
import com.pb.locationintelligence.utils.Log;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utils;

import android.content.Context;

public class GeocommServiceImpl extends OAuthService implements  GeocommService 
{
	
	private GetRestService _GetRestService = null;
	private String geocommUrl = "/geocomm/v1/ratecenter/";
	private UrlMaker urlMaker;
	
	@Override
	public void getRateCenterByAddress(Context context, String address, RequestObserver<RateCenterResponse> requestObserver) 
	{
		
		processGeocommAddressRequest(context, address, null, false, null, requestObserver);
	}

	@Override
	public void getRateCenterByAddress(Context context, String address, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver)
	{
		
		processGeocommAddressRequest(context, address, null, areaCodeInfo, null, requestObserver);
	}

	@Override
	public void getRateCenterByAddress(Context context, String address, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver)
	{
		
		processGeocommAddressRequest(context, address, null, areaCodeInfo, level, requestObserver);
	}

	@Override
	public void getRateCenterByAddress(Context context, String address, String country,	RequestObserver<RateCenterResponse> requestObserver) 
	{
		
		processGeocommAddressRequest(context, address, country, false, null, requestObserver);
	}

	@Override
	public void getRateCenterByAddress(Context context, String address, String country, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver)
	{
		
		processGeocommAddressRequest(context, address, country, areaCodeInfo, null, requestObserver);
	}

	@Override
	public void getRateCenterByAddress(Context context, String address, String country, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver)
	{
		
		processGeocommAddressRequest(context, address, country, areaCodeInfo, level, requestObserver);
	}

	@Override
	public void getRateCenterByLocation(Context context, Double longitude, Double latitude,	RequestObserver<RateCenterResponse> requestObserver) 
	{
		
		processGeocommLocationRequest(context, longitude, latitude, false, null, requestObserver);
	}

	@Override
	public void getRateCenterByLocation(Context context, Double longitude, Double latitude, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver)
	{
		
		processGeocommLocationRequest(context, longitude, latitude, areaCodeInfo, null, requestObserver);
	}

	@Override
	public void getRateCenterByLocation(Context context, Double longitude, Double latitude, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver)
	{
		
		processGeocommLocationRequest(context, longitude, latitude, areaCodeInfo, level, requestObserver);
	}

	private void processGeocommAddressRequest(final Context context, final String address, final String country, final boolean isAreaCodeInfoRequested, final String level, final RequestObserver<RateCenterResponse> requestObserver) 
	{
		super.getAuthenticationToken(context, new RequestObserver<AuthToken>() 
		{
            @Override
            public void onSucess(AuthToken data) 
            {
                Log.d("Authentication is sucessfull, It's time to call Geocomm Rate Center API ");
                urlMaker = UrlMaker.getInstance();
                String url = urlMaker.getAbsoluteUrl(geocommUrl) + "byaddress?address=" + urlMaker.getEncodedURL(getString(address));
                
                StringBuffer geocommURL = new StringBuffer(url);
                if(country != null)
                {
                	geocommURL.append("&country="+country);
                }
                
                if(isAreaCodeInfoRequested)
                {
                	geocommURL.append("&areaCodeInfo=true");
                	
                	if(level != null)
                	{
                		geocommURL.append("&level="+level);
                	}
                }
                
                getGeoCommResponse(context, geocommURL.toString(), true, requestObserver);
            }

            @Override
            public void onRequestStart() 
            {
                Log.d("Authentication request has been started for Geocomm Rate Center ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) 
            {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });
		
	}
	
	private void processGeocommLocationRequest(final Context context, final Double longitude, final Double latitude, final boolean isAreaCodeInfoRequested, final String level, final RequestObserver<RateCenterResponse> requestObserver) 
	{
		super.getAuthenticationToken(context, new RequestObserver<AuthToken>() 
		{
            @Override
            public void onSucess(AuthToken data) 
            {
                Log.d("Authentication is sucessfull, It's time to call Geocomm Rate Center API ");
                urlMaker = UrlMaker.getInstance();
                String url = urlMaker.getAbsoluteUrl(geocommUrl) + "bylocation?latitude=" + urlMaker.getEncodedURL(getString(latitude)) + "&longitude=" + urlMaker.getEncodedURL(getString(longitude));
                
                StringBuffer geocommURL = new StringBuffer(url);
                
                if(isAreaCodeInfoRequested)
                {
                	geocommURL.append("&areaCodeInfo=true");
                	
                	if(level != null)
                	{
                		geocommURL.append("&level="+level);
                	}
                }
                
                getGeoCommResponse(context, geocommURL.toString(), false, requestObserver);
            }

            @Override
            public void onRequestStart() 
            {
                Log.d("Authentication request has been started for Geocomm Rate Center ");

            }

            @Override
            public void onFailure(ErrorResponse errorData) 
            {
                Log.e("Authentication request has been failed" + errorData);
                requestObserver.onFailure(errorData);
            }
        });
		
	}
	
	private void getGeoCommResponse(final Context context, final String url, final boolean byAddress, final RequestObserver<RateCenterResponse> requestObserver) 
	{
        final String method = (byAddress) ? "Address " : "Location ";
        Log.d("Calling Geocomm Service to retrieve Rate Center Details by " + method);
        _GetRestService = new GetRestService(context, url, null, this, new RequestObserver<String>() 
        {
        	 @Override
             public void onSucess(String data) 
        	 {
                 Log.d("Rate Center Details By " + method);
                 RateCenterResponse response = null;
                 try 
                 {
                     JSONObject jsonResponse = new JSONObject(data);
                     Gson gson = new Gson();
                     response = gson.fromJson(jsonResponse.toString(), RateCenterResponse.class);

                     Log.d("Got the Rate Center Response " + response);

                 }
                 catch (JSONException e) 
                 {
                     Log.e("Excpetion in Json parsing of Geocomm Rate Center reponse : " + e.getMessage());
                     ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(e.getMessage(), e));
                     errorResponse.setRootErrorMessage(e.getMessage());

                     requestObserver.onFailure(errorResponse);
                     return;
                 }
                 requestObserver.onSucess(response);
             }
        	 
        	 @Override
             public void onRequestStart() 
        	 {
                 Log.d("Rate Center Details By " + method + "request has been started");
                 requestObserver.onRequestStart();
             }

             @Override
             public void onFailure(ErrorResponse errorData) 
             {
                 Log.d("Oops Retrieval of Rate Center Details By " + method + "failed");
                 requestObserver.onFailure(errorData);
             }
        });
        _GetRestService.execute();
    }
    
	private String getString(Object value) 
	{
		if (value == null) {
			return "";
		}
		return value.toString();
	}
}
