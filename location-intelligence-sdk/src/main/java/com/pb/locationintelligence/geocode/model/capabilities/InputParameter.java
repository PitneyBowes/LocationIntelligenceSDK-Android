
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

import java.util.Map;

public class InputParameter 
{

	/**
	 * optionalInputs	InputParameter
	 * Lists the optional input fields for the operation. Includes the following elements:
	 name (String)
	 description (String)
	 type (String)
	 defaultValue (String)
	 lowBoundary (String)
	 highBoundary (String)
	 allowedValuesWithDescriptions (Map)
	 */
    private String name;
    private String description;
    private String type;
    private String defaultValue;
    private String lowBoundary;
    private String highBoundary;
    private Map allowedValuesWithDescriptions;
    
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String getDefaultValue() 
	{
		return defaultValue;
	}
	
	public void setDefaultValue(String defaultValue) 
	{
		this.defaultValue = defaultValue;
	}
	
	public String getLowBoundary() 
	{
		return lowBoundary;
	}
	
	public void setLowBoundary(String lowBoundary) 
	{
		this.lowBoundary = lowBoundary;
	}
	
	public String getHighBoundary() 
	{
		return highBoundary;
	}
	
	public void setHighBoundary(String highBoundary) 
	{
		this.highBoundary = highBoundary;
	}
	
	public Map getAllowedValuesWithDescriptions() 
	{
		return allowedValuesWithDescriptions;
	}
	
	public void setAllowedValuesWithDescriptions(Map allowedValuesWithDescriptions) 
	{
		this.allowedValuesWithDescriptions = allowedValuesWithDescriptions;
	}

}
