
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

package com.pb.locationintelligence.geocode.model.capabilities;

import java.util.List;

public class GeocodeCapabilitiesResponse 
{
	/**
	 * The name of a supported service.
	 */
	private String serviceName;

	/**
	 * A description of the service.
	 */
	private String serviceDescription;

	/**
	 * The core version of GeoCode API.
	 */
	private String coreVersion;

	/**
	 * The countries supported by each installed country geocoder engine.
	 */
	private List<String> supportedCountries;

	/**
	 * An array that defines the supported operations for the specified input country or for all countries.
	 */
	private List<Operation> supportedOperations;

	/**
	 * List of custom object
	 */
    private List<CustomObject> customObjects;
    
	public String getServiceName() 
	{
		return serviceName;
	}
	
	public void setServiceName(String serviceName) 
	{
		this.serviceName = serviceName;
	}
	
	public String getServiceDescription() 
	{
		return serviceDescription;
	}
	
	public void setServiceDescription(String serviceDescription) 
	{
		this.serviceDescription = serviceDescription;
	}
	
	public String getCoreVersion() 
	{
		return coreVersion;
	}
	
	public void setCoreVersion(String coreVersion) 
	{
		this.coreVersion = coreVersion;
	}
	
	public List<String> getSupportedCountries() 
	{
		return supportedCountries;
	}
	
	public void setSupportedCountries(List<String> supportedCountries) 
	{
		this.supportedCountries = supportedCountries;
	}
	
	public List<Operation> getSupportedOperations() 
	{
		return supportedOperations;
	}
	
	public void setSupportedOperations(List<Operation> supportedOperations) 
	{
		this.supportedOperations = supportedOperations;
	}
	
	public List<CustomObject> getCustomObjects() 
	{
		return customObjects;
	}
	
	public void setCustomObjects(List<CustomObject> customObjects) 
	{
		this.customObjects = customObjects;
	}
    
}
