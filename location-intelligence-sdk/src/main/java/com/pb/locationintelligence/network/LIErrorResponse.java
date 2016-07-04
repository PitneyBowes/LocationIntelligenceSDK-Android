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

package com.pb.locationintelligence.network;

/**
 * Class to handle LI specific exceptions from Network
 * 
 * @author ga007ja
 * 
 */
public class LIErrorResponse {

    // LI specific exceptions from Network
    private LIError error;
    // Network failure status like 400 Not Found
    private int httpStatusCode;

    public LIError getLIError() {
        return error;
    }

    public void setLIError(LIError error) {
        this.error = error;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

}
