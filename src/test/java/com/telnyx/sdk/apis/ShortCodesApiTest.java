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
import com.telnyx.sdk.models.ListShortCodesResponse;
import com.telnyx.sdk.models.ShortCodeResponse;
import java.util.UUID;
import com.telnyx.sdk.models.UpdateShortCodeRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShortCodesApi
 */
@Ignore
public class ShortCodesApiTest {

    private final ShortCodesApi api = new ShortCodesApi();

    
    /**
     * List short codes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listShortCodesTest() throws ApiException {
        Integer pageNumber = null;
        Integer pageSize = null;
        String filterMessagingProfileId = null;
        ListShortCodesResponse response = api.listShortCodes()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterMessagingProfileId(filterMessagingProfileId)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Retrieve a short code
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveShortCodeTest() throws ApiException {
        UUID id = null;
        ShortCodeResponse response = api.retrieveShortCode(id)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Update short code
     *
     * Update the settings for a specific short code. To unbind a short code from a profile, set the &#x60;messaging_profile_id&#x60; to &#x60;null&#x60; or an empty string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShortCodeTest() throws ApiException {
        UUID id = null;
        UpdateShortCodeRequest updateShortCodeRequest = null;
        ShortCodeResponse response = api.updateShortCode(id, updateShortCodeRequest)
                .execute();

        // TODO: test validations
    }
    
}
