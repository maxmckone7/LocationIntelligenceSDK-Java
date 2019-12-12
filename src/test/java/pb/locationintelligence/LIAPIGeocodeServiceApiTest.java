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
import pb.locationintelligence.model.GeocodeServiceResponse;
import pb.locationintelligence.model.GeocodeServiceResponseList;
import pb.locationintelligence.model.GeocodeRequest;
import pb.locationintelligence.model.GeocodeCapabilitiesResponse;
import pb.locationintelligence.model.ConfiguredDictionaryResponse;
import pb.locationintelligence.model.PBKeyResponse;
import pb.locationintelligence.model.PBKeyAddressRequest;
import pb.locationintelligence.model.PBKeyResponseList;
import pb.locationintelligence.model.KeyLookupRequest;
import pb.locationintelligence.model.ReverseGeocodeRequest;
import java.math.BigDecimal;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LIAPIGeocodeServiceApi
 */
public class LIAPIGeocodeServiceApiTest {

    private final LIAPIGeocodeServiceApi api = new LIAPIGeocodeServiceApi();

    
    /**
     * Gets Geocode
     *
     * Gets Geocode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void geocodeTest() throws ApiException {
        String datapackBundle = null;
        String country = null;
        String placeName = null;
        String mainAddress = null;
        String lastLine = null;
        String areaName1 = null;
        String areaName2 = null;
        String areaName3 = null;
        String areaName4 = null;
        Integer postalCode = null;
        String matchMode = null;
        Boolean fallbackGeo = null;
        Boolean fallbackPostal = null;
        Integer maxCands = null;
        Integer streetOffset = null;
        String streetOffsetUnits = null;
        Integer cornerOffset = null;
        String cornerOffsetUnits = null;
        // GeocodeServiceResponse response = api.geocode(datapackBundle, country, placeName, mainAddress, lastLine, areaName1, areaName2, areaName3, areaName4, postalCode, matchMode, fallbackGeo, fallbackPostal, maxCands, streetOffset, streetOffsetUnits, cornerOffset, cornerOffsetUnits);

        // TODO: test validations
    }
    
    /**
     * Gets Geocode
     *
     * Gets Geocode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void geocodeBatchTest() throws ApiException {
        GeocodeRequest body = null;
        String datapackBundle = null;
        // GeocodeServiceResponseList response = api.geocodeBatch(body, datapackBundle);

        // TODO: test validations
    }
    
    /**
     * Gets Capabilities
     *
     * Gets Capabilities
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCapabilitiesTest() throws ApiException {
        String datapackBundle = null;
        String operation = null;
        String country = null;
        // GeocodeCapabilitiesResponse response = api.getCapabilities(datapackBundle, operation, country);

        // TODO: test validations
    }
    
    /**
     * Gets installed Dictionaries
     *
     * Gets installed Dictionaries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDictionariesTest() throws ApiException {
        String datapackBundle = null;
        String country = null;
        // ConfiguredDictionaryResponse response = api.getDictionaries(datapackBundle, country);

        // TODO: test validations
    }
    
    /**
     * Gets PBKey
     *
     * Gets PBKey for an input free form address text
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPBKeyTest() throws ApiException {
        String address = null;
        String country = null;
        // PBKeyResponse response = api.getPBKey(address, country);

        // TODO: test validations
    }
    
    /**
     * Gets PBKeys
     *
     * Gets PBKeys for multiple input addresses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPBKeysTest() throws ApiException {
        PBKeyAddressRequest body = null;
        // PBKeyResponseList response = api.getPBKeys(body);

        // TODO: test validations
    }
    
    /**
     * Get Address
     *
     * Gets Address for an input free form PBKey text
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyLookupTest() throws ApiException {
        String key = null;
        String type = null;
        String country = null;
        // GeocodeServiceResponse response = api.keyLookup(key, type, country);

        // TODO: test validations
    }
    
    /**
     * Get List of Address
     *
     * Gets Address for an input free form PBKey text
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyLookupBatchTest() throws ApiException {
        KeyLookupRequest body = null;
        // GeocodeServiceResponseList response = api.keyLookupBatch(body);

        // TODO: test validations
    }
    
    /**
     * reverse Geocode
     *
     * reverse Geocode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reverseGeocodBatchTest() throws ApiException {
        String datapackBundle = null;
        ReverseGeocodeRequest body = null;
        // GeocodeServiceResponseList response = api.reverseGeocodBatch(datapackBundle, body);

        // TODO: test validations
    }
    
    /**
     * reverse Geocode
     *
     * reverse Geocode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reverseGeocodeTest() throws ApiException {
        String datapackBundle = null;
        BigDecimal x = null;
        BigDecimal y = null;
        String country = null;
        String coordSysName = null;
        Integer distance = null;
        String distanceUnits = null;
        // GeocodeServiceResponse response = api.reverseGeocode(datapackBundle, x, y, country, coordSysName, distance, distanceUnits);

        // TODO: test validations
    }
    
}
