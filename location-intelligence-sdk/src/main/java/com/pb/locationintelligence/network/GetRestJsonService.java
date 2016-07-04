
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

import java.util.Map;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.toolbox.JsonObjectRequest;
import com.pb.locationintelligence.interfaces.RequestObserver;

/**
 * Dedicated class to call Rest services and obtaining JSON response
 * 
 * @author ga007ja
 * 
 */
public class GetRestJsonService extends RestService {

    public GetRestJsonService(Context context, String url,
            RequestObserver requestObserver) {

        super(context, requestObserver);
        _Request = new JsonObjectRequest(Request.Method.GET, url, null,
                reponseListener, errorListener);
    }

    public GetRestJsonService(Context context, String url,
            final Map<String, String> header, RequestObserver requestObserver,
            final String token) {

        super(context, requestObserver);
        _Request = new JsonObjectRequest(Request.Method.GET, url, null,
                reponseListener, errorListener) {

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                header.put("Content-Type", "application/json");
                header.put("Accept", "application/json");
                header.put("Authorization", "Bearer " + token);
                return header;
            }

        };

    }

}
