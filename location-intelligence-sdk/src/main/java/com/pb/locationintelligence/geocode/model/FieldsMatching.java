
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

package com.pb.locationintelligence.geocode.model;

public class FieldsMatching {

	private boolean matchOnAddressNumber;
	private boolean matchOnPostCode1;
	private boolean matchOnPostCode2;
	private boolean matchOnAreaName1;
	private boolean matchOnAreaName2;
	private boolean matchOnAreaName3;
	private boolean matchOnAreaName4;
	private boolean matchOnAllStreetFields;
	private boolean matchOnStreetName;
	private boolean matchOnStreetType;
	private boolean matchOnStreetDirectional;
	private boolean matchOnPlaceName;
	private boolean matchOnInputFields;

	public boolean isMatchOnAddressNumber() {
		return matchOnAddressNumber;
	}

	public void setMatchOnAddressNumber(boolean matchOnAddressNumber) {
		this.matchOnAddressNumber = matchOnAddressNumber;
	}

	public boolean isMatchOnPostCode1() {
		return matchOnPostCode1;
	}

	public void setMatchOnPostCode1(boolean matchOnPostCode1) {
		this.matchOnPostCode1 = matchOnPostCode1;
	}

	public boolean isMatchOnPostCode2() {
		return matchOnPostCode2;
	}

	public void setMatchOnPostCode2(boolean matchOnPostCode2) {
		this.matchOnPostCode2 = matchOnPostCode2;
	}

	public boolean isMatchOnAreaName1() {
		return matchOnAreaName1;
	}

	public void setMatchOnAreaName1(boolean matchOnAreaName1) {
		this.matchOnAreaName1 = matchOnAreaName1;
	}

	public boolean isMatchOnAreaName2() {
		return matchOnAreaName2;
	}

	public void setMatchOnAreaName2(boolean matchOnAreaName2) {
		this.matchOnAreaName2 = matchOnAreaName2;
	}

	public boolean isMatchOnAreaName3() {
		return matchOnAreaName3;
	}

	public void setMatchOnAreaName3(boolean matchOnAreaName3) {
		this.matchOnAreaName3 = matchOnAreaName3;
	}

	public boolean isMatchOnAreaName4() {
		return matchOnAreaName4;
	}

	public void setMatchOnAreaName4(boolean matchOnAreaName4) {
		this.matchOnAreaName4 = matchOnAreaName4;
	}

	public boolean isMatchOnAllStreetFields() {
		return matchOnAllStreetFields;
	}

	public void setMatchOnAllStreetFields(boolean matchOnAllStreetFields) {
		this.matchOnAllStreetFields = matchOnAllStreetFields;
	}

	public boolean isMatchOnStreetName() {
		return matchOnStreetName;
	}

	public void setMatchOnStreetName(boolean matchOnStreetName) {
		this.matchOnStreetName = matchOnStreetName;
	}

	public boolean isMatchOnStreetType() {
		return matchOnStreetType;
	}

	public void setMatchOnStreetType(boolean matchOnStreetType) {
		this.matchOnStreetType = matchOnStreetType;
	}

	public boolean isMatchOnStreetDirectional() {
		return matchOnStreetDirectional;
	}

	public void setMatchOnStreetDirectional(boolean matchOnStreetDirectional) {
		this.matchOnStreetDirectional = matchOnStreetDirectional;
	}

	public boolean isMatchOnPlaceName() {
		return matchOnPlaceName;
	}

	public void setMatchOnPlaceName(boolean matchOnPlaceName) {
		this.matchOnPlaceName = matchOnPlaceName;
	}

	public boolean isMatchOnInputFields() {
		return matchOnInputFields;
	}

	public void setMatchOnInputFields(boolean matchOnInputFields) {
		this.matchOnInputFields = matchOnInputFields;
	}

}