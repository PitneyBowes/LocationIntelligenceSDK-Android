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

import pb.ApiException;
import pb.locationintelligence.model.GeoEnrichMetadataResponse;
import pb.locationintelligence.model.POIPlaces;
import pb.locationintelligence.model.GeoEnrichResponse;
import pb.locationintelligence.model.POIByGeometryRequest;
import pb.locationintelligence.model.Pois;
import pb.locationintelligence.model.PoiCountRequest;
import pb.locationintelligence.model.PoiCount;
import pb.locationintelligence.model.PlaceByLocations;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LIAPIGeoEnrichServiceApi
 */
public class LIAPIGeoEnrichServiceApiTest {

    private final LIAPIGeoEnrichServiceApi api = new LIAPIGeoEnrichServiceApi();

    
    /**
     * Returns Category Codes with their sub-categories (if exist), descriptions and SIC Codes mapping
     *
     * Accepts first partial digits or full category codes to filter the response
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoryCodeMetadataTest() throws ApiException {
        String categoryCode = null;
        String level = null;
        // GeoEnrichMetadataResponse response = api.getCategoryCodeMetadata(categoryCode, level);

        // TODO: test validations
    }
    
    /**
     * Point of Interest By Id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIByIdTest() throws ApiException {
        String id = null;
        // POIPlaces response = api.getPOIById(id);

        // TODO: test validations
    }
    
    /**
     * Points of Interest By Address.
     *
     * Accepts address as an input to retrieve nearby points of interest.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIsByAddressTest() throws ApiException {
        String address = null;
        String country = null;
        String name = null;
        String type = null;
        String categoryCode = null;
        String sicCode = null;
        String maxCandidates = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String travelTime = null;
        String travelTimeUnit = null;
        String travelDistance = null;
        String travelDistanceUnit = null;
        String travelMode = null;
        String sortBy = null;
        String fuzzyOnName = null;
        String page = null;
        // GeoEnrichResponse response = api.getPOIsByAddress(address, country, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page);

        // TODO: test validations
    }
    
    /**
     * Points of Interest By Area.
     *
     * Accepts postcode or city as an input to retrieve nearby points of interest.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIsByAreaTest() throws ApiException {
        String country = null;
        String areaName3 = null;
        String postcode1 = null;
        String postcode2 = null;
        String name = null;
        String type = null;
        String categoryCode = null;
        String sicCode = null;
        String maxCandidates = null;
        String fuzzyOnName = null;
        String page = null;
        // GeoEnrichResponse response = api.getPOIsByArea(country, areaName3, postcode1, postcode2, name, type, categoryCode, sicCode, maxCandidates, fuzzyOnName, page);

        // TODO: test validations
    }
    
    /**
     * Point of Interests By Geometry.
     *
     * Accepts geometry as an input to retrieve nearby point of interests.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIsByGeometryTest() throws ApiException {
        String accept = null;
        String contentType = null;
        POIByGeometryRequest body = null;
        // Pois response = api.getPOIsByGeometry(accept, contentType, body);

        // TODO: test validations
    }
    
    /**
     * Points of Interest By Location.
     *
     * Accepts longitude and latitude as an input to retrieve nearby points of interest.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIsByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String searchText = null;
        String type = null;
        String categoryCode = null;
        String sicCode = null;
        String maxCandidates = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String travelTime = null;
        String travelTimeUnit = null;
        String travelDistance = null;
        String travelDistanceUnit = null;
        String travelMode = null;
        String sortBy = null;
        String fuzzyOnName = null;
        String page = null;
        String searchOnNameOnly = null;
        // GeoEnrichResponse response = api.getPOIsByLocation(longitude, latitude, searchText, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page, searchOnNameOnly);

        // TODO: test validations
    }
    
    /**
     * Point of Interests count By Geometry.
     *
     * Accepts geometry/loc/address as an input to count nearby point of interests.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIsCountTest() throws ApiException {
        String contentType = null;
        PoiCountRequest body = null;
        // PoiCount response = api.getPOIsCount(contentType, body);

        // TODO: test validations
    }
    
    /**
     * Place By Location.
     *
     * Identifies and retrieves the nearest neighborhood around a specific location. This GeoEnrich service accepts latitude &amp; longitude as input and returns a place name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlaceByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String levelHint = null;
        // PlaceByLocations response = api.getPlaceByLocation(longitude, latitude, levelHint);

        // TODO: test validations
    }
    
    /**
     * Returns SIC Codes with their Industry Titles and Category Codes mapping
     *
     * Accepts first few partial digits or full SIC codes to filter the response
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSICMetadataTest() throws ApiException {
        String sicCode = null;
        String level = null;
        // GeoEnrichMetadataResponse response = api.getSICMetadata(sicCode, level);

        // TODO: test validations
    }
    
    /**
     * Points of Interest Autocomplete.
     *
     * POIs-Autocomplete will return POIs predictions based on the full or partial words specified in the search.The search can then be narrowed based on Location, IP Address or Country along with other supporting filters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poisAutocompleteTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String searchText = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String travelTime = null;
        String travelTimeUnit = null;
        String travelDistance = null;
        String travelDistanceUnit = null;
        String travelMode = null;
        String country = null;
        String areaName1 = null;
        String areaName3 = null;
        String postcode1 = null;
        String postcode2 = null;
        String ipAddress = null;
        String autoDetectLocation = null;
        String type = null;
        String categoryCode = null;
        String sicCode = null;
        String maxCandidates = null;
        String sortBy = null;
        String searchOnNameOnly = null;
        // GeoEnrichResponse response = api.poisAutocomplete(longitude, latitude, searchText, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, country, areaName1, areaName3, postcode1, postcode2, ipAddress, autoDetectLocation, type, categoryCode, sicCode, maxCandidates, sortBy, searchOnNameOnly);

        // TODO: test validations
    }
    
}
