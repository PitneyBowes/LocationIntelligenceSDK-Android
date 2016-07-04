
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

package com.pb.locationintelligence.app;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;


public class PitneyBowesApplication extends Application {

    public static String DEFAULT_LOG_TAG = "PB_LIS";
    public static final boolean ENABLE_DEBUG = true;

    private static Context sAppContext;

    @Override
    public void onCreate() {

        sAppContext = this.getApplicationContext();

        if (ENABLE_DEBUG) {
            Log.i(DEFAULT_LOG_TAG, "PitneyBowesApplication.onCreate() uptime: "
                    + SystemClock.uptimeMillis() + " elapsedRealtime: "
                    + SystemClock.elapsedRealtime());
        }
        super.onCreate();
    }

    public static Context getAppContext() {
        return sAppContext;
    }

}
