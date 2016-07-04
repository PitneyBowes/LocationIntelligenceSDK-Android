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

/**
 * This Singleton factory class returns the specific Auth Service. 
 * 
 * @author AS007KH
 * 
 */

public class OAuthFactory {
	
	private static OAuthFactory INSTANCE;
	private BaseOAuthService authService ;
	private OAuthFactory(BaseOAuthService service){
		this.authService = service;
	}

	/**
	 * 
	 * @param service
	 */
	public static void setInstance(BaseOAuthService service){
		INSTANCE = new OAuthFactory(service);
		return;
	}
	
	/**
	 * @return {@link OAuthFactory}
	 */
	public static OAuthFactory getInstance(){
		if(INSTANCE==null)
			throw new IllegalStateException();
		return INSTANCE;
	}
	/**
	 * @return {@link BaseOAuthService}
	 */
	public static BaseOAuthService getOAuthService(){
		return INSTANCE.authService;
	}
	
}
