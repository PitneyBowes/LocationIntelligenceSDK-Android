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

package com.pb.locationintelligence.geo911.model;

/**
 * This class represents the Authority Having Jurisdiction (AHJ) and Public Safety Answering Points (PSAP) object.
 */
public class AHJPlusPSAPResponse
{
    private AHJList ahjs;
    private PsapResponse psap;

	public AHJList getAhjs() {
		return ahjs;
	}

	public void setAhjs(AHJList ahjs) {
		this.ahjs = ahjs;
	}

	public PsapResponse getPsap() {
		return psap;
	}

	public void setPsap(PsapResponse psap) {
		this.psap = psap;
	}

}
