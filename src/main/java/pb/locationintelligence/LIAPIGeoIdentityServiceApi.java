/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 8.5.0
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

import pb.locationintelligence.model.GeoIdentityResponse;
import pb.locationintelligence.model.Identity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LIAPIGeoIdentityServiceApi {
    private ApiClient apiClient;

    public LIAPIGeoIdentityServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LIAPIGeoIdentityServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getIdentityByAddress */
    private com.squareup.okhttp.Call getIdentityByAddressCall(String address, String givenName, String familyName, String confidence, String maxCandidates, String theme, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling getIdentityByAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geoidentity/v1/identity/byaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (address != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
        if (givenName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "givenName", givenName));
        if (familyName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "familyName", familyName));
        if (confidence != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "confidence", confidence));
        if (maxCandidates != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCandidates", maxCandidates));
        if (theme != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "theme", theme));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

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
     * Gets GeoIdentityResponse
     * Gets GeoIdentityResponse
     * @param address free form address text (required)
     * @param givenName This filters all the associated identities of address by given Name (optional)
     * @param familyName This filters all the associated identities of address by family Name (optional)
     * @param confidence To adjust quality threshold of data returned. Default is HIGH (optional)
     * @param maxCandidates Number of identities returned in response (optional)
     * @param theme theme parameter for filtering results (optional)
     * @param filter filter params (optional)
     * @return GeoIdentityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeoIdentityResponse getIdentityByAddress(String address, String givenName, String familyName, String confidence, String maxCandidates, String theme, String filter) throws ApiException {
        ApiResponse<GeoIdentityResponse> resp = getIdentityByAddressWithHttpInfo(address, givenName, familyName, confidence, maxCandidates, theme, filter);
        return resp.getData();
    }

    /**
     * Gets GeoIdentityResponse
     * Gets GeoIdentityResponse
     * @param address free form address text (required)
     * @param givenName This filters all the associated identities of address by given Name (optional)
     * @param familyName This filters all the associated identities of address by family Name (optional)
     * @param confidence To adjust quality threshold of data returned. Default is HIGH (optional)
     * @param maxCandidates Number of identities returned in response (optional)
     * @param theme theme parameter for filtering results (optional)
     * @param filter filter params (optional)
     * @return ApiResponse&lt;GeoIdentityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeoIdentityResponse> getIdentityByAddressWithHttpInfo(String address, String givenName, String familyName, String confidence, String maxCandidates, String theme, String filter) throws ApiException {
        com.squareup.okhttp.Call call = getIdentityByAddressCall(address, givenName, familyName, confidence, maxCandidates, theme, filter, null, null);
        Type localVarReturnType = new TypeToken<GeoIdentityResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets GeoIdentityResponse (asynchronously)
     * Gets GeoIdentityResponse
     * @param address free form address text (required)
     * @param givenName This filters all the associated identities of address by given Name (optional)
     * @param familyName This filters all the associated identities of address by family Name (optional)
     * @param confidence To adjust quality threshold of data returned. Default is HIGH (optional)
     * @param maxCandidates Number of identities returned in response (optional)
     * @param theme theme parameter for filtering results (optional)
     * @param filter filter params (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIdentityByAddressAsync(String address, String givenName, String familyName, String confidence, String maxCandidates, String theme, String filter, final ApiCallback<GeoIdentityResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIdentityByAddressCall(address, givenName, familyName, confidence, maxCandidates, theme, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeoIdentityResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getIdentityByEmail */
    private com.squareup.okhttp.Call getIdentityByEmailCall(String email, String confidence, String theme, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling getIdentityByEmail(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geoidentity/v1/identity/byemail".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
        if (confidence != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "confidence", confidence));
        if (theme != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "theme", theme));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

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
     * Gets Identity
     * Gets Identity
     * @param email This specifies the email address (required)
     * @param confidence To adjust quality threshold of data returned. Default is HIGH (optional)
     * @param theme theme parameter for filtering results (optional)
     * @param filter filter params (optional)
     * @return Identity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Identity getIdentityByEmail(String email, String confidence, String theme, String filter) throws ApiException {
        ApiResponse<Identity> resp = getIdentityByEmailWithHttpInfo(email, confidence, theme, filter);
        return resp.getData();
    }

    /**
     * Gets Identity
     * Gets Identity
     * @param email This specifies the email address (required)
     * @param confidence To adjust quality threshold of data returned. Default is HIGH (optional)
     * @param theme theme parameter for filtering results (optional)
     * @param filter filter params (optional)
     * @return ApiResponse&lt;Identity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Identity> getIdentityByEmailWithHttpInfo(String email, String confidence, String theme, String filter) throws ApiException {
        com.squareup.okhttp.Call call = getIdentityByEmailCall(email, confidence, theme, filter, null, null);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets Identity (asynchronously)
     * Gets Identity
     * @param email This specifies the email address (required)
     * @param confidence To adjust quality threshold of data returned. Default is HIGH (optional)
     * @param theme theme parameter for filtering results (optional)
     * @param filter filter params (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIdentityByEmailAsync(String email, String confidence, String theme, String filter, final ApiCallback<Identity> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIdentityByEmailCall(email, confidence, theme, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getIdentityByTwitter */
    private com.squareup.okhttp.Call getIdentityByTwitterCall(String twitter, String confidence, String theme, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'twitter' is set
        if (twitter == null) {
            throw new ApiException("Missing the required parameter 'twitter' when calling getIdentityByTwitter(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geoidentity/v1/identity/bytwitter".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (twitter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "twitter", twitter));
        if (confidence != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "confidence", confidence));
        if (theme != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "theme", theme));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
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
     * Gets Identity
     * Gets Identity
     * @param twitter Twitter handle of the identity. (required)
     * @param confidence To adjust quality threshold of data returned. Default is HIGH (optional)
     * @param theme theme parameter for filtering results (optional)
     * @param filter filter params (optional)
     * @return Identity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Identity getIdentityByTwitter(String twitter, String confidence, String theme, String filter) throws ApiException {
        ApiResponse<Identity> resp = getIdentityByTwitterWithHttpInfo(twitter, confidence, theme, filter);
        return resp.getData();
    }

    /**
     * Gets Identity
     * Gets Identity
     * @param twitter Twitter handle of the identity. (required)
     * @param confidence To adjust quality threshold of data returned. Default is HIGH (optional)
     * @param theme theme parameter for filtering results (optional)
     * @param filter filter params (optional)
     * @return ApiResponse&lt;Identity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Identity> getIdentityByTwitterWithHttpInfo(String twitter, String confidence, String theme, String filter) throws ApiException {
        com.squareup.okhttp.Call call = getIdentityByTwitterCall(twitter, confidence, theme, filter, null, null);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets Identity (asynchronously)
     * Gets Identity
     * @param twitter Twitter handle of the identity. (required)
     * @param confidence To adjust quality threshold of data returned. Default is HIGH (optional)
     * @param theme theme parameter for filtering results (optional)
     * @param filter filter params (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIdentityByTwitterAsync(String twitter, String confidence, String theme, String filter, final ApiCallback<Identity> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIdentityByTwitterCall(twitter, confidence, theme, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Identity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
