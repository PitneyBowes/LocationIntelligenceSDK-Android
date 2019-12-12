/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 8.0.0
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

import pb.locationintelligence.model.RateCenterResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LIAPIGeoCommServiceApi {
    private ApiClient apiClient;

    public LIAPIGeoCommServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LIAPIGeoCommServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getRateCenterByAddress */
    private com.squareup.okhttp.Call getRateCenterByAddressCall(String address, String country, String areaCodeInfo, String level, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling getRateCenterByAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geocomm/v1/ratecenter/byaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (address != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        if (areaCodeInfo != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "AreaCodeInfo", areaCodeInfo));
        if (level != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "level", level));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
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
     * Rate Center By Address.
     * Accepts addresses as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param address The address to be searched. (required)
     * @param country 3 letter ISO code of the country to be searched. Allowed values USA,CAN (optional, default to USA)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False (optional, default to False)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional, default to basic)
     * @return RateCenterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RateCenterResponse getRateCenterByAddress(String address, String country, String areaCodeInfo, String level) throws ApiException {
        ApiResponse<RateCenterResponse> resp = getRateCenterByAddressWithHttpInfo(address, country, areaCodeInfo, level);
        return resp.getData();
    }

    /**
     * Rate Center By Address.
     * Accepts addresses as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param address The address to be searched. (required)
     * @param country 3 letter ISO code of the country to be searched. Allowed values USA,CAN (optional, default to USA)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False (optional, default to False)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional, default to basic)
     * @return ApiResponse&lt;RateCenterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RateCenterResponse> getRateCenterByAddressWithHttpInfo(String address, String country, String areaCodeInfo, String level) throws ApiException {
        com.squareup.okhttp.Call call = getRateCenterByAddressCall(address, country, areaCodeInfo, level, null, null);
        Type localVarReturnType = new TypeToken<RateCenterResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rate Center By Address. (asynchronously)
     * Accepts addresses as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param address The address to be searched. (required)
     * @param country 3 letter ISO code of the country to be searched. Allowed values USA,CAN (optional, default to USA)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False (optional, default to False)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional, default to basic)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRateCenterByAddressAsync(String address, String country, String areaCodeInfo, String level, final ApiCallback<RateCenterResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRateCenterByAddressCall(address, country, areaCodeInfo, level, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RateCenterResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getRateCenterByLocation */
    private com.squareup.okhttp.Call getRateCenterByLocationCall(String longitude, String latitude, String areaCodeInfo, String level, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'longitude' is set
        if (longitude == null) {
            throw new ApiException("Missing the required parameter 'longitude' when calling getRateCenterByLocation(Async)");
        }
        
        // verify the required parameter 'latitude' is set
        if (latitude == null) {
            throw new ApiException("Missing the required parameter 'latitude' when calling getRateCenterByLocation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geocomm/v1/ratecenter/bylocation".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (longitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
        if (latitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
        if (areaCodeInfo != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "AreaCodeInfo", areaCodeInfo));
        if (level != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "level", level));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
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
     * Rate Center By Location.
     * Accepts latitude &amp; longitude as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False. (optional, default to False)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional, default to basic)
     * @return RateCenterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RateCenterResponse getRateCenterByLocation(String longitude, String latitude, String areaCodeInfo, String level) throws ApiException {
        ApiResponse<RateCenterResponse> resp = getRateCenterByLocationWithHttpInfo(longitude, latitude, areaCodeInfo, level);
        return resp.getData();
    }

    /**
     * Rate Center By Location.
     * Accepts latitude &amp; longitude as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False. (optional, default to False)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional, default to basic)
     * @return ApiResponse&lt;RateCenterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RateCenterResponse> getRateCenterByLocationWithHttpInfo(String longitude, String latitude, String areaCodeInfo, String level) throws ApiException {
        com.squareup.okhttp.Call call = getRateCenterByLocationCall(longitude, latitude, areaCodeInfo, level, null, null);
        Type localVarReturnType = new TypeToken<RateCenterResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rate Center By Location. (asynchronously)
     * Accepts latitude &amp; longitude as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False. (optional, default to False)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional, default to basic)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRateCenterByLocationAsync(String longitude, String latitude, String areaCodeInfo, String level, final ApiCallback<RateCenterResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRateCenterByLocationCall(longitude, latitude, areaCodeInfo, level, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RateCenterResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
