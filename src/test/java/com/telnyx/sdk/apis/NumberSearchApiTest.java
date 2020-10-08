/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.apis;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.models.Errors;
import com.telnyx.sdk.models.ListAvailablePhoneNumbersResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for NumberSearchApi
 */
@Ignore
public class NumberSearchApiTest {

    private final NumberSearchApi api = new NumberSearchApi();

    
    /**
     * List available phone numbers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAvailablePhoneNumbersTest() throws ApiException {
        String filterPhoneNumberStartsWith = null;
        String filterPhoneNumberEndsWith = null;
        String filterPhoneNumberContains = null;
        String filterLocality = null;
        String filterAdministrativeArea = null;
        String filterCountryCode = null;
        String filterNationalDestinationCode = null;
        String filterRateCenter = null;
        String filterNumberType = null;
        List<String> filterFeatures = null;
        Integer filterLimit = null;
        Boolean filterBestEffort = null;
        Boolean filterQuickship = null;
        Boolean filterReservable = null;
        
        NumberSearchApi.APIlistAvailablePhoneNumbersRequest request = NumberSearchApi.APIlistAvailablePhoneNumbersRequest.newBuilder()
          .filterPhoneNumberStartsWith(filterPhoneNumberStartsWith)
          .filterPhoneNumberEndsWith(filterPhoneNumberEndsWith)
          .filterPhoneNumberContains(filterPhoneNumberContains)
          .filterLocality(filterLocality)
          .filterAdministrativeArea(filterAdministrativeArea)
          .filterCountryCode(filterCountryCode)
          .filterNationalDestinationCode(filterNationalDestinationCode)
          .filterRateCenter(filterRateCenter)
          .filterNumberType(filterNumberType)
          .filterFeatures(filterFeatures)
          .filterLimit(filterLimit)
          .filterBestEffort(filterBestEffort)
          .filterQuickship(filterQuickship)
          .filterReservable(filterReservable)
          .build();
        CompletableFuture<ListAvailablePhoneNumbersResponse> response = 
        api.listAvailablePhoneNumbers(request);

        // TODO: test validations
    }
    
}
