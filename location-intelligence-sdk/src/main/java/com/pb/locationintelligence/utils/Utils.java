
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

package com.pb.locationintelligence.utils;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.pb.locationintelligence.app.PitneyBowesApplication;
import com.pb.locationintelligence.network.InternalErrorResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {


    private static final Logger _LOG = LoggerFactory.getLogger(Utils.class);
	
    public static InternalErrorResponse getInternalErrorResponseObject(
            String erMessage, Exception e) {
        InternalErrorResponse irErrorResponse = new InternalErrorResponse();
        irErrorResponse.setGenericErrorMessage(erMessage);
        irErrorResponse.setException(e);
        return irErrorResponse;
    }

    public static String decoratedURL(String url,String bundleName,String suffix ){
        return url.replace("{bundleName}",bundleName).concat(suffix);
    }

    public static String getEncodedParam(String param) {
        String encodedParam = null;
        try {
            encodedParam = URLEncoder.encode(param, "UTF-8");
        } catch (Exception e) {
            _LOG.error("Unsupported Encoding Exception " + e.getMessage());
        }
        return encodedParam;
    }

    public static void CopyStream(InputStream is, OutputStream os) {
        final int buffer_size = 1024;
        try {
            byte[] bytes = new byte[buffer_size];
            for (;;) {
                int count = is.read(bytes, 0, buffer_size);
                if (count == -1)
                    break;
                os.write(bytes, 0, count);
            }
        } catch (Exception ex) {
            Log.d("Utils " + "Got exception" + ex.getMessage());
        }
    }

    public static boolean isNetworkAvailable() {
        ConnectivityManager cm = (ConnectivityManager) PitneyBowesApplication
                .getAppContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        }
        Log.v("network not available!");
        return false;
    }
    
    public static void appendIfNotNull(StringBuilder urlToAppendTo, Map<String, Object> queryParametersMap) {
        if (urlToAppendTo == null || queryParametersMap == null || queryParametersMap.size() < 1) return;

        boolean firstParam = true;

        for (String key : queryParametersMap.keySet()) {
            Object value = queryParametersMap.get(key);

            if (value != null) {
                String separator;
                if (firstParam) {
                    separator = "?";
                } else {
                    separator = "&";
                }
                String encodedParam = UrlMaker.getInstance().getEncodedURL(value.toString());
                if (encodedParam != null) {
                    urlToAppendTo.append(separator).append(key).append("=").append(encodedParam);
                    firstParam = false;
                }
            }
        }

    }

}