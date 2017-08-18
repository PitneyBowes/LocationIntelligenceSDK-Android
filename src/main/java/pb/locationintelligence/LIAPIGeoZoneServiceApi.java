/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.6.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.locationintelligence;

import pb.ApiCallback;
import pb.ApiClient;
import pb.ApiException;
import pb.ApiResponse;
import pb.Configuration;
import pb.Pair;
import pb.ProgressRequestBody;
import pb.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import pb.locationintelligence.model.TravelBoundaries;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LIAPIGeoZoneServiceApi {
    private ApiClient apiClient;

    public LIAPIGeoZoneServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LIAPIGeoZoneServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getTravelBoundaryByDistance */
    private com.squareup.okhttp.Call getTravelBoundaryByDistanceCall(String costs, String point, String address, String costUnit, String db, String country, String maxOffroadDistance, String maxOffroadDistanceUnit, String destinationSrs, String majorRoads, String returnHoles, String returnIslands, String simplificationFactor, String bandingStyle, String historicTrafficTimeBucket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'costs' is set
        if (costs == null) {
            throw new ApiException("Missing the required parameter 'costs' when calling getTravelBoundaryByDistance(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geozone/v1/travelboundary/bydistance".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (point != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "point", point));
        if (address != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
        if (costs != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "costs", costs));
        if (costUnit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "costUnit", costUnit));
        if (db != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "db", db));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        if (maxOffroadDistance != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxOffroadDistance", maxOffroadDistance));
        if (maxOffroadDistanceUnit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxOffroadDistanceUnit", maxOffroadDistanceUnit));
        if (destinationSrs != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "destinationSrs", destinationSrs));
        if (majorRoads != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "majorRoads", majorRoads));
        if (returnHoles != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnHoles", returnHoles));
        if (returnIslands != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnIslands", returnIslands));
        if (simplificationFactor != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "simplificationFactor", simplificationFactor));
        if (bandingStyle != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bandingStyle", bandingStyle));
        if (historicTrafficTimeBucket != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "historicTrafficTimeBucket", historicTrafficTimeBucket));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Gets travel Boundary by Distance
     * Returns the travel boundary based on travel distance.
     * @param costs Travel distance(s) (required)
     * @param point Starting point from where the travel boundary is calculated. Point in &#39;Lat,Long,coordsys&#39; format (optional)
     * @param address Starting address from where the travel boundary is calculated. (optional)
     * @param costUnit Travel distance such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). (optional, default to m)
     * @param db Mode of commute. (optional, default to driving)
     * @param country Three digit ISO country code. (optional, default to USA)
     * @param maxOffroadDistance Maximum distance to allow travel off the road network. (optional)
     * @param maxOffroadDistanceUnit MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). (optional)
     * @param destinationSrs Desired coordinate system of the travel boundary. (optional)
     * @param majorRoads Whether to include all roads in the calculation or just major roads. (optional, default to false)
     * @param returnHoles Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired distance. (optional, default to false)
     * @param returnIslands Whether to return islands, which are small areas outside the main boundary that can be reached within the desired distance. (optional, default to false)
     * @param simplificationFactor Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex. (optional, default to 0.5)
     * @param bandingStyle Style of banding to be used in the result. (optional, default to Donut)
     * @param historicTrafficTimeBucket Whether routing calculation uses the historic traffic speeds. (optional, default to None)
     * @return TravelBoundaries
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TravelBoundaries getTravelBoundaryByDistance(String costs, String point, String address, String costUnit, String db, String country, String maxOffroadDistance, String maxOffroadDistanceUnit, String destinationSrs, String majorRoads, String returnHoles, String returnIslands, String simplificationFactor, String bandingStyle, String historicTrafficTimeBucket) throws ApiException {
        ApiResponse<TravelBoundaries> resp = getTravelBoundaryByDistanceWithHttpInfo(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket);
        return resp.getData();
    }

    /**
     * Gets travel Boundary by Distance
     * Returns the travel boundary based on travel distance.
     * @param costs Travel distance(s) (required)
     * @param point Starting point from where the travel boundary is calculated. Point in &#39;Lat,Long,coordsys&#39; format (optional)
     * @param address Starting address from where the travel boundary is calculated. (optional)
     * @param costUnit Travel distance such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). (optional, default to m)
     * @param db Mode of commute. (optional, default to driving)
     * @param country Three digit ISO country code. (optional, default to USA)
     * @param maxOffroadDistance Maximum distance to allow travel off the road network. (optional)
     * @param maxOffroadDistanceUnit MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). (optional)
     * @param destinationSrs Desired coordinate system of the travel boundary. (optional)
     * @param majorRoads Whether to include all roads in the calculation or just major roads. (optional, default to false)
     * @param returnHoles Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired distance. (optional, default to false)
     * @param returnIslands Whether to return islands, which are small areas outside the main boundary that can be reached within the desired distance. (optional, default to false)
     * @param simplificationFactor Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex. (optional, default to 0.5)
     * @param bandingStyle Style of banding to be used in the result. (optional, default to Donut)
     * @param historicTrafficTimeBucket Whether routing calculation uses the historic traffic speeds. (optional, default to None)
     * @return ApiResponse&lt;TravelBoundaries&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TravelBoundaries> getTravelBoundaryByDistanceWithHttpInfo(String costs, String point, String address, String costUnit, String db, String country, String maxOffroadDistance, String maxOffroadDistanceUnit, String destinationSrs, String majorRoads, String returnHoles, String returnIslands, String simplificationFactor, String bandingStyle, String historicTrafficTimeBucket) throws ApiException {
        com.squareup.okhttp.Call call = getTravelBoundaryByDistanceCall(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, null, null);
        Type localVarReturnType = new TypeToken<TravelBoundaries>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets travel Boundary by Distance (asynchronously)
     * Returns the travel boundary based on travel distance.
     * @param costs Travel distance(s) (required)
     * @param point Starting point from where the travel boundary is calculated. Point in &#39;Lat,Long,coordsys&#39; format (optional)
     * @param address Starting address from where the travel boundary is calculated. (optional)
     * @param costUnit Travel distance such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). (optional, default to m)
     * @param db Mode of commute. (optional, default to driving)
     * @param country Three digit ISO country code. (optional, default to USA)
     * @param maxOffroadDistance Maximum distance to allow travel off the road network. (optional)
     * @param maxOffroadDistanceUnit MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). (optional)
     * @param destinationSrs Desired coordinate system of the travel boundary. (optional)
     * @param majorRoads Whether to include all roads in the calculation or just major roads. (optional, default to false)
     * @param returnHoles Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired distance. (optional, default to false)
     * @param returnIslands Whether to return islands, which are small areas outside the main boundary that can be reached within the desired distance. (optional, default to false)
     * @param simplificationFactor Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex. (optional, default to 0.5)
     * @param bandingStyle Style of banding to be used in the result. (optional, default to Donut)
     * @param historicTrafficTimeBucket Whether routing calculation uses the historic traffic speeds. (optional, default to None)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTravelBoundaryByDistanceAsync(String costs, String point, String address, String costUnit, String db, String country, String maxOffroadDistance, String maxOffroadDistanceUnit, String destinationSrs, String majorRoads, String returnHoles, String returnIslands, String simplificationFactor, String bandingStyle, String historicTrafficTimeBucket, final ApiCallback<TravelBoundaries> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTravelBoundaryByDistanceCall(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TravelBoundaries>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTravelBoundaryByTime */
    private com.squareup.okhttp.Call getTravelBoundaryByTimeCall(String costs, String point, String address, String costUnit, String db, String country, String maxOffroadDistance, String maxOffroadDistanceUnit, String destinationSrs, String majorRoads, String returnHoles, String returnIslands, String simplificationFactor, String bandingStyle, String historicTrafficTimeBucket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'costs' is set
        if (costs == null) {
            throw new ApiException("Missing the required parameter 'costs' when calling getTravelBoundaryByTime(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geozone/v1/travelboundary/bytime".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (point != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "point", point));
        if (address != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
        if (costs != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "costs", costs));
        if (costUnit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "costUnit", costUnit));
        if (db != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "db", db));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        if (maxOffroadDistance != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxOffroadDistance", maxOffroadDistance));
        if (maxOffroadDistanceUnit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxOffroadDistanceUnit", maxOffroadDistanceUnit));
        if (destinationSrs != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "destinationSrs", destinationSrs));
        if (majorRoads != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "majorRoads", majorRoads));
        if (returnHoles != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnHoles", returnHoles));
        if (returnIslands != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnIslands", returnIslands));
        if (simplificationFactor != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "simplificationFactor", simplificationFactor));
        if (bandingStyle != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bandingStyle", bandingStyle));
        if (historicTrafficTimeBucket != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "historicTrafficTimeBucket", historicTrafficTimeBucket));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Gets travel Boundary by Time
     * Travel boundary based on travel time.
     * @param costs Travel time used to calculate the travel boundary. (required)
     * @param point Starting point from where the travel boundary is calculated. Point in Lat,Long,coordsys format (optional)
     * @param address Starting address from where the travel boundary is calculated. (optional)
     * @param costUnit Travel time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). (optional, default to min)
     * @param db Mode of commute. (optional, default to driving)
     * @param country 3 character ISO code or country name. (optional, default to USA)
     * @param maxOffroadDistance Maximum distance to allow travel off the road network. (optional)
     * @param maxOffroadDistanceUnit MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). (optional)
     * @param destinationSrs Desired coordinate system of the travel boundary. (optional)
     * @param majorRoads Whether to include all roads in the calculation or just major roads. (optional, default to false)
     * @param returnHoles Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired time. (optional, default to false)
     * @param returnIslands Whether to return islands, which are small areas outside the main boundary that can be reached within the desired time. (optional, default to false)
     * @param simplificationFactor Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex. (optional, default to 0.5)
     * @param bandingStyle Style of banding to be used in the result. (optional, default to Donut)
     * @param historicTrafficTimeBucket Whether routing calculation uses the historic traffic speeds. (optional, default to None)
     * @return TravelBoundaries
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TravelBoundaries getTravelBoundaryByTime(String costs, String point, String address, String costUnit, String db, String country, String maxOffroadDistance, String maxOffroadDistanceUnit, String destinationSrs, String majorRoads, String returnHoles, String returnIslands, String simplificationFactor, String bandingStyle, String historicTrafficTimeBucket) throws ApiException {
        ApiResponse<TravelBoundaries> resp = getTravelBoundaryByTimeWithHttpInfo(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket);
        return resp.getData();
    }

    /**
     * Gets travel Boundary by Time
     * Travel boundary based on travel time.
     * @param costs Travel time used to calculate the travel boundary. (required)
     * @param point Starting point from where the travel boundary is calculated. Point in Lat,Long,coordsys format (optional)
     * @param address Starting address from where the travel boundary is calculated. (optional)
     * @param costUnit Travel time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). (optional, default to min)
     * @param db Mode of commute. (optional, default to driving)
     * @param country 3 character ISO code or country name. (optional, default to USA)
     * @param maxOffroadDistance Maximum distance to allow travel off the road network. (optional)
     * @param maxOffroadDistanceUnit MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). (optional)
     * @param destinationSrs Desired coordinate system of the travel boundary. (optional)
     * @param majorRoads Whether to include all roads in the calculation or just major roads. (optional, default to false)
     * @param returnHoles Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired time. (optional, default to false)
     * @param returnIslands Whether to return islands, which are small areas outside the main boundary that can be reached within the desired time. (optional, default to false)
     * @param simplificationFactor Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex. (optional, default to 0.5)
     * @param bandingStyle Style of banding to be used in the result. (optional, default to Donut)
     * @param historicTrafficTimeBucket Whether routing calculation uses the historic traffic speeds. (optional, default to None)
     * @return ApiResponse&lt;TravelBoundaries&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TravelBoundaries> getTravelBoundaryByTimeWithHttpInfo(String costs, String point, String address, String costUnit, String db, String country, String maxOffroadDistance, String maxOffroadDistanceUnit, String destinationSrs, String majorRoads, String returnHoles, String returnIslands, String simplificationFactor, String bandingStyle, String historicTrafficTimeBucket) throws ApiException {
        com.squareup.okhttp.Call call = getTravelBoundaryByTimeCall(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, null, null);
        Type localVarReturnType = new TypeToken<TravelBoundaries>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets travel Boundary by Time (asynchronously)
     * Travel boundary based on travel time.
     * @param costs Travel time used to calculate the travel boundary. (required)
     * @param point Starting point from where the travel boundary is calculated. Point in Lat,Long,coordsys format (optional)
     * @param address Starting address from where the travel boundary is calculated. (optional)
     * @param costUnit Travel time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). (optional, default to min)
     * @param db Mode of commute. (optional, default to driving)
     * @param country 3 character ISO code or country name. (optional, default to USA)
     * @param maxOffroadDistance Maximum distance to allow travel off the road network. (optional)
     * @param maxOffroadDistanceUnit MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). (optional)
     * @param destinationSrs Desired coordinate system of the travel boundary. (optional)
     * @param majorRoads Whether to include all roads in the calculation or just major roads. (optional, default to false)
     * @param returnHoles Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired time. (optional, default to false)
     * @param returnIslands Whether to return islands, which are small areas outside the main boundary that can be reached within the desired time. (optional, default to false)
     * @param simplificationFactor Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex. (optional, default to 0.5)
     * @param bandingStyle Style of banding to be used in the result. (optional, default to Donut)
     * @param historicTrafficTimeBucket Whether routing calculation uses the historic traffic speeds. (optional, default to None)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTravelBoundaryByTimeAsync(String costs, String point, String address, String costUnit, String db, String country, String maxOffroadDistance, String maxOffroadDistanceUnit, String destinationSrs, String majorRoads, String returnHoles, String returnIslands, String simplificationFactor, String bandingStyle, String historicTrafficTimeBucket, final ApiCallback<TravelBoundaries> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTravelBoundaryByTimeCall(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TravelBoundaries>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
