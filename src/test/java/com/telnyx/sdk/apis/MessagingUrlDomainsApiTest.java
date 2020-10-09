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
import com.telnyx.sdk.models.ListMessagingProfileUrlDomainsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingUrlDomainsApi
 */
@Ignore
public class MessagingUrlDomainsApiTest {

    private final MessagingUrlDomainsApi api = new MessagingUrlDomainsApi();

    
    /**
     * List messaging URL domains
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMessagingUrlDomainsTest() throws ApiException {
        ListMessagingProfileUrlDomainsResponse response = api.listMessagingUrlDomains()
                .execute();

        // TODO: test validations
    }
    
}
