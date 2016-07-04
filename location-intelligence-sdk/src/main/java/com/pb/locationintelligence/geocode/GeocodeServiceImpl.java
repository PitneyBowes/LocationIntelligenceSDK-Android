
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

package com.pb.locationintelligence.geocode;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.pb.locationintelligence.OAuth.AuthToken;
import com.pb.locationintelligence.OAuth.OAuthService;
import com.pb.locationintelligence.geocode.custompreferences.ICustomPreference;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceAUS;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceCAN;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceDEU;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceFRA;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceGBR;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceNZL;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferencePRT;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceSGP;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceSWE;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceUSA;
import com.pb.locationintelligence.geocode.model.BundleType;
import com.pb.locationintelligence.geocode.model.Countries;
import com.pb.locationintelligence.geocode.model.GeocodeServiceRequest;
import com.pb.locationintelligence.geocode.model.GeocodeServiceResponseList;
import com.pb.locationintelligence.geocode.model.OperationType;
import com.pb.locationintelligence.geocode.model.Reverse.Point;
import com.pb.locationintelligence.geocode.model.Reverse.ReverseGeocodeRequest;
import com.pb.locationintelligence.geocode.model.capabilities.GeocodeCapabilitiesResponse;
import com.pb.locationintelligence.geocode.model.dictionaries.ConfiguredDictionaryResponse;
import com.pb.locationintelligence.geocode.model.forward.Address;
import com.pb.locationintelligence.geocode.preferences.GeocodePreferenceBuilder;
import com.pb.locationintelligence.interfaces.RequestObserver;
import com.pb.locationintelligence.network.ErrorResponse;
import com.pb.locationintelligence.network.GetRestService;
import com.pb.locationintelligence.network.LIErrorResponse;
import com.pb.locationintelligence.network.PostRestService;
import com.pb.locationintelligence.utils.Log;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utils;

import android.content.Context;

public class GeocodeServiceImpl extends OAuthService implements GeocodeService{
	
	private static final String geocodeURL = "/geocode-service/v1/transient/{bundleName}/";

	private static final String dictionaryURL = "dictionaries";

	private static final String capabilityURL = "capabilities";

	private static final String forwardGeocodeURL = "geocode";

	private static final String reverseGeocodeURL = "reverseGeocode";
	
	private static final String COUNTRY_FIELD = "Country";
	private static final String COUNTRY_ISO_NAME_FIELD = "countryISO";
	private static final String DOT = ".";
	private static final String RETURNED_CUSTOM_FIELD_KEYS = "returnedCustomFieldKeys";
	private static final String BLANK = "";
	private static final String SPACE = " ";
	
	private static final String ERROR_MSG = "Please provide valid values for method parameters";
	
	private GetRestService _GetRestService = null;
	private PostRestService _PostRestService = null;
	
	UrlMaker urlMaker = null;

	@Override
	public void getConfiguredDictionaries(final Context context, final BundleType bundleType, final RequestObserver<ConfiguredDictionaryResponse> requestObserver) {
		
		if(context == null || bundleType == null)
		{
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
		}
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Dictionary API ");
	               
	                String bundle = bundleType.value();
	                
	                processDictionary(context, null, bundle, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Dictionary ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}

	@Override
	public void getConfiguredDictionaries(final Context context, final Countries countryName, final BundleType bundleType, final RequestObserver<ConfiguredDictionaryResponse> requestObserver) {
		if(context == null || countryName == null || bundleType == null)
		{
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
		}
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Dictionary API ");
	               
	                String country = countryName.value();
	                
	                String bundle = bundleType.value();
	                
	                processDictionary(context, country, bundle, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Dictionary ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}

	@Override
	public void getCapabilities(final Context context, final BundleType bundleType, final RequestObserver<GeocodeCapabilitiesResponse> requestObserver) {
		if(context == null || bundleType == null)
		{
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
		}
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	            	Log.d("Authentication is sucessfull, It's time to call Capability API ");
	               
	                String bundle = bundleType.value();
	                
	                processCapabilities(context, null, null, bundle, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	            	Log.d("Authentication request has been started for Capability ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	            	Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}

	@Override
	public void getCapabilities(final Context context, final Countries countryName, final BundleType bundleType, final RequestObserver<GeocodeCapabilitiesResponse> requestObserver) {
		if(context == null || countryName == null || bundleType == null)
		{
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
		}
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Capability API ");
	                
	                String country = countryName.value();
	                String bundle = bundleType.value();
	                
	                processCapabilities(context, country, null, bundle, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Capability ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}

	@Override
	public void getCapabilities(final Context context, final OperationType operationName, final BundleType bundleType, final RequestObserver<GeocodeCapabilitiesResponse> requestObserver) {
		if(context == null || operationName == null || bundleType == null)
		{
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
		}
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Capability API ");
	                
	                String operation = operationName.value();
	                String bundle = bundleType.value();
	                
	                processCapabilities(context, null, operation, bundle, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Capability ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}

	@Override
	public void getCapabilities(final Context context, final Countries countryName, final OperationType operationName, final BundleType bundleType, final
			RequestObserver<GeocodeCapabilitiesResponse> requestObserver) {
		if(context == null || countryName == null || operationName == null || bundleType == null)
		{
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
		}
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Capability API ");
	                
	                String country = countryName.value();
	                String operation = operationName.value();
	                String bundle = bundleType.value();
	                
	                processCapabilities(context, country, operation, bundle, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Capability ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}

	@Override
	public void getGeocode(final Context context, final Address address, final BundleType bundleType,
			final RequestObserver<GeocodeServiceResponseList> requestObserver) {
		
		if( address == null || bundleType == null)
        {
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
        }
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Geocode API ");
	                
	                
	                String bundle = bundleType.value();
	                List<Address> addresses = new ArrayList<Address>();
	                addresses.add(address);
	                processGeocode(context, addresses, bundle, null, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Geocode ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}
	
	@Override
	public void getGeocodeBatch(final Context context, final List<Address> addresses, final BundleType bundleType,
			final RequestObserver<GeocodeServiceResponseList> requestObserver) {
		
		if(context == null || addresses == null || addresses.isEmpty() || bundleType == null)
        {
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
        }
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Geocode API ");
	                
	                
	                String bundle = bundleType.value();
	                processGeocode(context, addresses, bundle, null, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Geocode ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}
	
	@Override
	public void getGeocodeAdvancedBatch(final Context context, final List<Address> addresses, final BundleType bundleType,
			final GeocodePreferenceBuilder preferenceBuilder,
			final RequestObserver<GeocodeServiceResponseList> requestObserver) {
		if(context == null || addresses == null || addresses.isEmpty() || bundleType == null || preferenceBuilder == null)
        {
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
        }
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Geocode API ");
	                
	                String bundle = bundleType.value();
	                
	                processGeocode(context, addresses, bundle, preferenceBuilder, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Geocode ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}

	@Override
	public void getReverseGeocode(final Context context, final Point point, final BundleType bundleType,
			final RequestObserver<GeocodeServiceResponseList> requestObserver) {
		if(context == null || point == null || bundleType == null)
        {
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
        }
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Reverse Geocode API ");
	                
	                String bundle = bundleType.value();
	                List<Point> points = new ArrayList<Point>();
	                points.add(point);
	                processReverseGeocode(context, points, bundle, null, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Reverse Geocode ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}
	
	@Override
	public void getReverseGeocodeBatch(final Context context, final List<Point> points, final BundleType bundleType,
			final RequestObserver<GeocodeServiceResponseList> requestObserver) {
		if(context == null || points == null || points.isEmpty() || bundleType == null)
        {
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
        }
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Reverse Geocode API ");
	                
	                String bundle = bundleType.value();
	                processReverseGeocode(context, points, bundle, null, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Reverse Geocode ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}
	
	@Override
	public void getReverseGeocodeAdvancedBatch(final Context context, final List<Point> points, final BundleType bundleType,
			final GeocodePreferenceBuilder preferenceBuilder,
			final RequestObserver<GeocodeServiceResponseList> requestObserver) {
		
		if(context == null || points == null || points.isEmpty() || bundleType == null || preferenceBuilder == null)
        {
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException(ERROR_MSG);
			
			ErrorResponse errorResponse = new ErrorResponse(Utils.getInternalErrorResponseObject(illegalArgumentException.getMessage(), illegalArgumentException));
			errorResponse.setRootErrorMessage(illegalArgumentException.getMessage());
			
			LIErrorResponse liErrorResponse = new LIErrorResponse();			
			errorResponse.setLIErrorResponse(liErrorResponse);
			
			requestObserver.onFailure(errorResponse);
			return;
        }
		 super.getAuthenticationToken(context, new RequestObserver<AuthToken>() {

	            @Override
	            public void onSucess(AuthToken data) {
	                Log.d("Authentication is sucessfull, It's time to call Reverse Geocode API ");
	                
	                String bundle = bundleType.value();
	                
	                processReverseGeocode(context, points, bundle, preferenceBuilder, requestObserver);
	            }

	            @Override
	            public void onRequestStart() {
	                Log.d("Authentication request has been started for Reverse Geocode ");

	            }

	            @Override
	            public void onFailure(ErrorResponse errorData) {
	                Log.e("Authentication request has been failed" + errorData);
	                requestObserver.onFailure(errorData);
	            }
	        });
		
	}
	
	private void processDictionary(final Context context, final String country, final String bundle, final RequestObserver<ConfiguredDictionaryResponse> requestObserver)
	{
		urlMaker = UrlMaker.getInstance();
		String url = geocodeURL.replace("{bundleName}",bundle).concat(dictionaryURL);
		//String url = geocodeURL.replace("/transient","").replace("/{bundleName}", "").concat(dictionaryURL);
		
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(url));

		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("country", country);

		Utils.appendIfNotNull(urlBuilder, keyValueMap);

		Log.d("URL : "+urlBuilder);
		
        Log.d("Calling Dictionary Service to retrieve dictionary details");
        _GetRestService = new GetRestService(context, urlBuilder.toString(), null,
                this, new RequestObserver<String>() {

                    @Override
                    public void onSucess(String data) {
                       
                    	ConfiguredDictionaryResponse response = null;
                        try {
                            JSONObject jsonResponse = new JSONObject(data);
                            Gson gson = new Gson();
                            response = gson.fromJson(jsonResponse.toString(),
                            		ConfiguredDictionaryResponse.class);

                            Log.d("Got the Dictionary Response " + response);

                        } catch (JSONException e) {
                            Log.e("Excpetion in Json parsing of Dictionary reponse : "
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
                        Log.d("Dictionary request has been started");
                        requestObserver.onRequestStart();
                    }

                    @Override
                    public void onFailure(ErrorResponse errorData) {
                        Log.e("Oops Retrieval of Dictionary Details failed");
                        requestObserver.onFailure(errorData);
                    }
                });
        _GetRestService.execute();
	}
	
	private void processCapabilities(final Context context, final String country, final String operation, final String bundle, final RequestObserver<GeocodeCapabilitiesResponse> requestObserver)
	{
		urlMaker = UrlMaker.getInstance();
		String url = geocodeURL.replace("{bundleName}",bundle).concat(capabilityURL);
		//String url = geocodeURL.replace("/transient","").replace("/{bundleName}","").concat(capabilityURL);
		
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(url));
		
		if(country != null)
		{
			urlBuilder.append("?country="+country);
		}
		
		if(operation != null)
		{
			if(country == null)
			{
				urlBuilder.append("?operation="+operation);
			}
			else
			{
				urlBuilder.append("&operation="+operation);
			}
		}

		/*Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("country", country);
		keyValueMap.put("operation", operation);
		

		Utils.appendIfNotNull(urlBuilder, keyValueMap);*/

		Log.d("URL : "+urlBuilder);
		
		Log.d("Calling Capabilities Service to retrieve Capability details");
        _GetRestService = new GetRestService(context, urlBuilder.toString(), null,
                this, new RequestObserver<String>() {

                    @Override
                    public void onSucess(String data) {
                       
                    	GeocodeCapabilitiesResponse response = null;
                        try {
                            JSONObject jsonResponse = new JSONObject(data);
                            Gson gson = new Gson();
                            response = gson.fromJson(jsonResponse.toString(),
                            		GeocodeCapabilitiesResponse.class);

                            Log.d("Got the Capabilities Response " + response);

                        } catch (JSONException e) {
                        	Log.e("Excpetion in Json parsing of Capabilities reponse : "
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
                    	Log.d("Capability request has been started");
                        requestObserver.onRequestStart();
                    }

                    @Override
                    public void onFailure(ErrorResponse errorData) {
                    	Log.e("Oops Retrieval of Capabilities Details failed");
                        requestObserver.onFailure(errorData);
                    }
                });
        _GetRestService.execute();
	}
	
	
	private void processGeocode(final Context context, final List<Address> addresses, String bundle, GeocodePreferenceBuilder preferenceBuilder, final RequestObserver<GeocodeServiceResponseList> requestObserver)
	{
		urlMaker = UrlMaker.getInstance();
		String url = geocodeURL.replace("{bundleName}",bundle).concat(forwardGeocodeURL);
		
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(url));
		
		Log.d("URL : "+urlBuilder);
		
		GeocodeServiceRequest request = new GeocodeServiceRequest();
		request.getAddresses().addAll(addresses);
		
		if(preferenceBuilder != null)
		{
			request.setPreferences(preferenceBuilder.getGeocodePreference());
			buildGeocodeCustomPreferences(preferenceBuilder.getCustomPreferences(), preferenceBuilder);
			request.getPreferences().setCustomPreferences(preferenceBuilder.getGeocodePreference().getCustomPreferences());
		}
		
		Gson gson = new Gson();
		
		JSONObject jsonObject = null;
		
		try 
		{
			String json = gson.toJson(request);
			Log.d("gson geocode request : "+json);
			jsonObject = new JSONObject(json);
		} 
		catch (JSONException e1) 
		{
			Log.e("Excpetion in Json parsing of Geocode request : "+ e1.getMessage());
		}
		
        _PostRestService = new PostRestService(context, urlBuilder.toString(), jsonObject, this, new RequestObserver<String>() {

                    @Override
                    public void onSucess(String data) {
                       
                    	GeocodeServiceResponseList response = null;
                        try {
                            JSONObject jsonResponse = new JSONObject(data);
                            Gson gson = new Gson();
                            response = gson.fromJson(jsonResponse.toString(),
                            		GeocodeServiceResponseList.class);

                            Log.d("Got the Geocode Response " + response);

                        } catch (JSONException e) {
                            Log.e("Excpetion in Json parsing of Geocode reponse : "
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
                        Log.d("Geocode request has been started");
                        requestObserver.onRequestStart();
                    }

                    @Override
                    public void onFailure(ErrorResponse errorData) {
                        Log.e("Oops Retrieval of Geocode Details failed");
                        requestObserver.onFailure(errorData);
                    }
                });
        _PostRestService.execute();
	}
	
	private void processReverseGeocode(final Context context, final List<Point> points, String bundle, GeocodePreferenceBuilder preferenceBuilder, final RequestObserver<GeocodeServiceResponseList> requestObserver)
	{
		urlMaker = UrlMaker.getInstance();
		String url = geocodeURL.replace("{bundleName}",bundle).concat(reverseGeocodeURL);
		
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(url));
		
		Log.d("URL : "+urlBuilder);

		ReverseGeocodeRequest request = new ReverseGeocodeRequest();
		request.getPoints().addAll(points);
		
		if(preferenceBuilder != null)
		{
			request.setPreferences(preferenceBuilder.getGeocodePreference());
			buildGeocodeCustomPreferences(preferenceBuilder.getCustomPreferences(), preferenceBuilder);
			request.getPreferences().setCustomPreferences(preferenceBuilder.getGeocodePreference().getCustomPreferences());
		}
		
		Gson gson = new Gson();
		JSONObject jsonObject = null;
		
		try 
		{
			String json = gson.toJson(request);
			Log.d("gson reverse geocode request : "+json);
			jsonObject = new JSONObject(json);
		} 
		catch (JSONException e1) 
		{
			Log.e("Excpetion in Json parsing of Reverse Geocode request"+ e1.getMessage());
		}
		
        _PostRestService = new PostRestService(context, urlBuilder.toString(), jsonObject, this, new RequestObserver<String>() {

                    @Override
                    public void onSucess(String data) {
                       
                    	GeocodeServiceResponseList response = null;
                        try {
                            JSONObject jsonResponse = new JSONObject(data);
                            Gson gson = new Gson();
                            response = gson.fromJson(jsonResponse.toString(),
                            		GeocodeServiceResponseList.class);

                            Log.d("Got the Reverse Geocode Response " + response);

                        } catch (JSONException e) {
                            Log.e("Excpetion in Json parsing of Reverse Geocode reponse : "
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
                        Log.d("Reverse Geocode request has been started");
                        requestObserver.onRequestStart();
                    }

                    @Override
                    public void onFailure(ErrorResponse errorData) {
                        Log.e("Oops Retrieval of Reverse Geocode Details failed");
                        requestObserver.onFailure(errorData);
                    }
                });
        _PostRestService.execute();
	}
	
	private void buildGeocodeCustomPreferences(List<ICustomPreference> customPreferences,
			GeocodePreferenceBuilder preferenceBuilder) {

		try {

			if (customPreferences != null && !customPreferences.isEmpty()) {

				Map customPreferenceMap = new LinkedHashMap();
				for (ICustomPreference customPreference : customPreferences) {
					processCustomPreferencesForDefinedCountries(customPreferenceMap, customPreference);
					processCustomPreferencesForUnDefinedCountries(customPreferenceMap, customPreference);

					processReturnedCustomFieldKeysPreference(customPreferenceMap, customPreference);

				}

				preferenceBuilder.getGeocodePreference().setCustomPreferences(customPreferenceMap);

			}

		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void processCustomPreferencesForDefinedCountries(Map customPreferenceMap,
			ICustomPreference customPreference)
					throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {

		if (customPreference != null && isCustomPreferenceOfDefinedCountries(customPreference)) {

			Field[] fields = customPreference.getClass().getFields();
			Field countryIsoCodeField = customPreference.getClass().getField(COUNTRY_ISO_NAME_FIELD);
			String countryIsoCode;

			countryIsoCode = countryIsoCodeField.get(customPreference).toString();

			for (Field field : fields) {
				field.setAccessible(true);

				if (field.get(customPreference) != null) {
					System.out.println("Not Null fields ARE : : " + field.getName());
					String fieldValue = field.get(customPreference).toString();
					String fieldName = field.getName();
					String preferenceKEY = countryIsoCode + DOT + fieldName;
					customPreferenceMap.put(preferenceKEY, fieldValue);

				}

			}

		}

	}

	private void processCustomPreferencesForUnDefinedCountries(Map customPreferenceMap,
			ICustomPreference customPreference)
					throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {

		if (customPreference != null && !isCustomPreferenceOfDefinedCountries(customPreference)) {

			Field[] fields = customPreference.getClass().getFields();

			for (Field field : fields) {
				field.setAccessible(true);

				if (field.get(customPreference) != null) {
					System.out.println("Not Null fields ARE : : " + field.getName());
					String fieldValue = field.get(customPreference).toString();
					String fieldName = field.getName();
					customPreferenceMap.put(fieldName, fieldValue);

				}

			}

		}

	}

	private void processReturnedCustomFieldKeysPreference(Map customPreferenceMap, ICustomPreference customPreference)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		if (customPreference != null) {

			Field countryIsoCodeField = customPreference.getClass().getField(COUNTRY_FIELD);
			countryIsoCodeField.setAccessible(true);
			String countryIsoCode;

			if (countryIsoCodeField.get(customPreference) != null) {

				Countries countryName = (Countries) countryIsoCodeField.get(customPreference);

				countryIsoCode = countryName.value();

				Field returnedCustomFieldKeysField = customPreference.getClass().getField(RETURNED_CUSTOM_FIELD_KEYS);
				returnedCustomFieldKeysField.setAccessible(true);

				if (returnedCustomFieldKeysField.get(customPreference) != null) {

					List<String> returnedCustomFieldKeys = (ArrayList) returnedCustomFieldKeysField
							.get(customPreference);

					Iterator<String> itr = returnedCustomFieldKeys.iterator();
					String preferenceValue = BLANK;

					while (itr.hasNext()) {
						preferenceValue = preferenceValue + itr.next() + ((itr.hasNext()) ? SPACE : BLANK);
					}

					String preferenceKEY = countryIsoCode + DOT + RETURNED_CUSTOM_FIELD_KEYS;
					customPreferenceMap.put(preferenceKEY, preferenceValue);
					customPreferenceMap.values();

				}

			}

		}

	}

	private boolean isCustomPreferenceOfDefinedCountries(ICustomPreference customPreference) {

		if (customPreference instanceof CustomPreferenceAUS || customPreference instanceof CustomPreferenceCAN
				|| customPreference instanceof CustomPreferenceDEU || customPreference instanceof CustomPreferenceFRA
				|| customPreference instanceof CustomPreferenceGBR || customPreference instanceof CustomPreferenceNZL
				|| customPreference instanceof CustomPreferencePRT || customPreference instanceof CustomPreferenceSGP
				|| customPreference instanceof CustomPreferenceSWE || customPreference instanceof CustomPreferenceUSA) {
			return true;
		}

		return false;
	}

}
