
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

package com.pb.locationintelligence.interfaces;

import android.content.Context;

import com.pb.locationintelligence.OAuth.BaseOAuthService;
import com.pb.locationintelligence.OAuth.BaseOAuthServiceImpl;
import com.pb.locationintelligence.OAuth.OAuthFactory;
import com.pb.locationintelligence.OAuth.OAuthService;
import com.pb.locationintelligence.geo911.Geo911Service;
import com.pb.locationintelligence.geo911.Geo911ServiceImpl;
import com.pb.locationintelligence.geocode.GeocodeService;
import com.pb.locationintelligence.geocode.GeocodeServiceImpl;
import com.pb.locationintelligence.geoenhance.GeoEnhanceService;
import com.pb.locationintelligence.geoenhance.GeoEnhanceServiceImpl;
import com.pb.locationintelligence.geolife.GeoLifeService;
import com.pb.locationintelligence.geolife.GeoLifeServiceImpl;
import com.pb.locationintelligence.geosearch.GeoSearchService;
import com.pb.locationintelligence.geosearch.GeoSearchServiceImpl;
import com.pb.locationintelligence.geotax.GeoTaxService;
import com.pb.locationintelligence.geotax.GeoTaxServiceImpl;
import com.pb.locationintelligence.utils.Log;
import com.pb.locationintelligence.geocomm.GeocommService;
import com.pb.locationintelligence.geocomm.GeocommServiceImpl;

/**
 * LIServiceManager class is responsible for providing entry point all LI specific
 * interfaces.It provides singleton object for this class
 * 
 * @author ga007ja
 * 
 */
public class LIServiceManager {

	private static LIServiceManager _LIServiceManager = null;

	private LIServiceManager() {

	}
	
	/**
	 * @param context
	 * @param baseOAuthService
	 * @return {@link LIServiceManager}
	 */
	public static final LIServiceManager getInstance(Context context, BaseOAuthService baseOAuthService) {
		if (_LIServiceManager == null) {
			 OAuthFactory.setInstance(baseOAuthService);
			_LIServiceManager = new LIServiceManager();
			Log.d("LI Service instance has been created");
		}
		Log.d("LI Service instance has been already created");
		return _LIServiceManager;
	}
	
	/**
	 * Method to initialize LI interfaces with user login credentials.
	 * @param context
	 * @param consumerKey
	 * @param consumerSecretKey
	 * @return {@link LIServiceManager}
	 */
	public static final LIServiceManager getInstance(Context context, String consumerKey, String consumerSecretKey ) {
		if (_LIServiceManager == null) {
			 OAuthFactory.setInstance(new BaseOAuthServiceImpl(consumerKey, consumerSecretKey));
			_LIServiceManager = new LIServiceManager();
			Log.d("LI Service instance has been created");
		}
		Log.d("LI Service instance has been already created");
		return _LIServiceManager;

	}
	
	/**
	 * Method to initialize LI services with a user supplied token.
	 * @param context
	 * @param token
	 * @return {@link LIServiceManager}
	 */
	public static final LIServiceManager getInstance(Context context, String token) {
		if (_LIServiceManager == null) {
			 OAuthFactory.setInstance(new BaseOAuthServiceImpl(token));
			_LIServiceManager = new LIServiceManager();
			Log.d("LI Service instance has been created");
		}
		Log.d("LI Service instance has been already created");
		return _LIServiceManager;

	}

	/**
	 * OAuth Service APIs Handler
	 * 
	 * @return an instance of BaseOAuthService
	 */
	public BaseOAuthService getBaseAuthService() {
		return new OAuthService();
	}

	/**
	 * Geo911 Service Handler
	 * 
	 * @return an instance of Geo911Service
	 */
	public Geo911Service getGeo911Service() {
		return new Geo911ServiceImpl();
	}

	/**
	 * GeoSearchService Handler
	 * 
	 * @return an instance of GeoSearchService
	 */
	public GeoSearchService getGeoSearchService() {
		return new GeoSearchServiceImpl();
	}

	/**
	 * GeoEnhance Service Handler
	 * 
	 * @return an instance of GeoEnhanceService
	 */
	public GeoEnhanceService getGeoEnhanceService() {
		return new GeoEnhanceServiceImpl();
	}

	/**
	 * GeoLife Service Handler
	 * 
	 * @return an instance of GeoLifeService
	 */
	public GeoLifeService getGeoLifeService() {
		return new GeoLifeServiceImpl();
	}
	
	
	
	/**
	 * GeoTax Service Handler
	 * 
	 * @return an instance of GeoLifeService
	 */
	public GeoTaxService getGeoTaxService() {
		return new GeoTaxServiceImpl();
	}

	
	/**
	 * Geocode Service Handler
	 * 
	 * @return an instance of GeocodeService
	 */
	public GeocodeService getGeocodeService() {
		return new GeocodeServiceImpl();
	}
	
	/**
	 * Geocomm Service Handler
	 * 
	 * @return an instance of GeocommService
	 */
	public GeocommService getGeocommService() {
		return new GeocommServiceImpl();
	}
	
	/**
	 * To invalidate the LI static reference
	 */
	public void invalidateLIServiceManagerInstance() {
		if (_LIServiceManager != null) {
			_LIServiceManager = null;
		
			Log.d("LI instance has been invalidated");

		}

	}

}
