
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

/**
 * Interface for Basic OAuth authentication in order to access all kinds of LI
 * services
 * 
 * @author ga007ja
 * 
 */
public interface BaseOAuthService {

    /**
     * 
     * @param context	
     * 				- Activity context
     * @param requestObserver
     * 				- request observer to delegate success, failure methods
     */
    public void getAuthenticationToken(Context context,
            RequestObserver<AuthToken> requestObserver);

    /**
     * To invalidate the access token
     * 
     * @param context
     */
    public void invalidateAuthenticationToken(Context context);

}
