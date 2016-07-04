
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

public class Log {

    public static String DEFAULT_LOG_TAG = "LI";
    public static final boolean ENABLE_DEBUG = true;

    private Log() {
    }

    public static void d(String msg) {
        if (ENABLE_DEBUG)
            android.util.Log.d(DEFAULT_LOG_TAG, msg);
    }

    public static void i(String msg) {
        if (ENABLE_DEBUG)
            android.util.Log.i(DEFAULT_LOG_TAG, msg);
    }

    public static void w(String msg) {
        if (ENABLE_DEBUG)
            android.util.Log.w(DEFAULT_LOG_TAG, msg);
    }

    public static void e(String msg) {
        if (ENABLE_DEBUG)
            android.util.Log.e(DEFAULT_LOG_TAG, msg);
    }

    public static void v(String msg) {
        if (ENABLE_DEBUG)
            android.util.Log.v(DEFAULT_LOG_TAG, msg);
    }

}
