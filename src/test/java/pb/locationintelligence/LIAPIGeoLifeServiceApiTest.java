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

import pb.ApiException;
import pb.locationintelligence.model.DemographicsV2;
import pb.locationintelligence.model.Segmentation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LIAPIGeoLifeServiceApi
 */
public class LIAPIGeoLifeServiceApiTest {

    private final LIAPIGeoLifeServiceApi api = new LIAPIGeoLifeServiceApi();

    
    /**
     * Demographics By Address.
     *
     * Provides the demographic details around a specified address. GeoLife &#39;byaddress&#39; service accepts address as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDemographicsByAddressV2Test() throws ApiException {
        String address = null;
        String country = null;
        String profile = null;
        String filter = null;
        String valueFormat = null;
        String variableLevel = null;
        // DemographicsV2 response = api.getDemographicsByAddressV2(address, country, profile, filter, valueFormat, variableLevel);

        // TODO: test validations
    }
    
    /**
     * Demographics By Location.
     *
     * Provides the demographic details around a specified location. GeoLife &#39;bylocation&#39; service accepts longitude and latitude as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDemographicsByLocationV2Test() throws ApiException {
        String longitude = null;
        String latitude = null;
        String profile = null;
        String filter = null;
        String valueFormat = null;
        String variableLevel = null;
        // DemographicsV2 response = api.getDemographicsByLocationV2(longitude, latitude, profile, filter, valueFormat, variableLevel);

        // TODO: test validations
    }
    
    /**
     * Demographics By PBKey.
     *
     * Provides the demographic details for a specified PB Key. GeoLife &#39;bypbkey&#39; service accepts pbkey as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDemographicsByPBKeyTest() throws ApiException {
        String pbKey = null;
        String profile = null;
        String filter = null;
        String valueFormat = null;
        String variableLevel = null;
        // DemographicsV2 response = api.getDemographicsByPBKey(pbKey, profile, filter, valueFormat, variableLevel);

        // TODO: test validations
    }
    
    /**
     * Segmentation By Address.
     *
     * Provides the segmentation details around a specified address. GeoLife &#39;Segmentation by Address&#39; service accepts address as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentationByAddressTest() throws ApiException {
        String address = null;
        String country = null;
        // Segmentation response = api.getSegmentationByAddress(address, country);

        // TODO: test validations
    }
    
    /**
     * Segmentation By Location.
     *
     * Provides the segmentation details around a specified location. GeoLife &#39;segmentation bylocation&#39; service accepts longitude and latitude as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentationByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        // Segmentation response = api.getSegmentationByLocation(longitude, latitude);

        // TODO: test validations
    }
    
    /**
     * Segmentation By PB Key.
     *
     * Provides the segmentation details for a PB Key. GeoLife &#39;segmentation bypbkey&#39; service accepts free form text PB Key as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentationByPBKeyTest() throws ApiException {
        String pbKey = null;
        // Segmentation response = api.getSegmentationByPBKey(pbKey);

        // TODO: test validations
    }
    
}
