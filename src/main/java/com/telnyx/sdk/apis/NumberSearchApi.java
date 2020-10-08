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

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Pair;

import com.telnyx.sdk.models.Errors;
import com.telnyx.sdk.models.ListAvailablePhoneNumbersResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NumberSearchApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;

  public NumberSearchApi() {
    this(new ApiClient());
  }

  public NumberSearchApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  private ApiException getApiException(String operationId, HttpResponse<String>localVarResponse) {
    return new ApiException(localVarResponse.statusCode(),
        operationId + " call received non-success response",
        localVarResponse.headers(),
        localVarResponse.body());
  }

  /**
   * List available phone numbers
   * 
   * @param listAvailablePhoneNumbersRequest {@link APIlistAvailablePhoneNumbersRequest}
   * @return CompletableFuture&lt;ListAvailablePhoneNumbersResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ListAvailablePhoneNumbersResponse> listAvailablePhoneNumbers(APIlistAvailablePhoneNumbersRequest listAvailablePhoneNumbersRequest) throws ApiException {
    String filterPhoneNumberStartsWith = listAvailablePhoneNumbersRequest.filterPhoneNumberStartsWith();
    String filterPhoneNumberEndsWith = listAvailablePhoneNumbersRequest.filterPhoneNumberEndsWith();
    String filterPhoneNumberContains = listAvailablePhoneNumbersRequest.filterPhoneNumberContains();
    String filterLocality = listAvailablePhoneNumbersRequest.filterLocality();
    String filterAdministrativeArea = listAvailablePhoneNumbersRequest.filterAdministrativeArea();
    String filterCountryCode = listAvailablePhoneNumbersRequest.filterCountryCode();
    String filterNationalDestinationCode = listAvailablePhoneNumbersRequest.filterNationalDestinationCode();
    String filterRateCenter = listAvailablePhoneNumbersRequest.filterRateCenter();
    String filterNumberType = listAvailablePhoneNumbersRequest.filterNumberType();
    List<String> filterFeatures = listAvailablePhoneNumbersRequest.filterFeatures();
    Integer filterLimit = listAvailablePhoneNumbersRequest.filterLimit();
    Boolean filterBestEffort = listAvailablePhoneNumbersRequest.filterBestEffort();
    Boolean filterQuickship = listAvailablePhoneNumbersRequest.filterQuickship();
    Boolean filterReservable = listAvailablePhoneNumbersRequest.filterReservable();
    return listAvailablePhoneNumbers(filterPhoneNumberStartsWith, filterPhoneNumberEndsWith, filterPhoneNumberContains, filterLocality, filterAdministrativeArea, filterCountryCode, filterNationalDestinationCode, filterRateCenter, filterNumberType, filterFeatures, filterLimit, filterBestEffort, filterQuickship, filterReservable);
  }

  /**
   * List available phone numbers
   * 
   * @param listAvailablePhoneNumbersRequest {@link APIlistAvailablePhoneNumbersRequest}
   * @return CompletableFuture&lt;ApiResponse&lt;ListAvailablePhoneNumbersResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ListAvailablePhoneNumbersResponse>> listAvailablePhoneNumbersWithHttpInfo(APIlistAvailablePhoneNumbersRequest listAvailablePhoneNumbersRequest) throws ApiException {
    String filterPhoneNumberStartsWith = listAvailablePhoneNumbersRequest.filterPhoneNumberStartsWith();
    String filterPhoneNumberEndsWith = listAvailablePhoneNumbersRequest.filterPhoneNumberEndsWith();
    String filterPhoneNumberContains = listAvailablePhoneNumbersRequest.filterPhoneNumberContains();
    String filterLocality = listAvailablePhoneNumbersRequest.filterLocality();
    String filterAdministrativeArea = listAvailablePhoneNumbersRequest.filterAdministrativeArea();
    String filterCountryCode = listAvailablePhoneNumbersRequest.filterCountryCode();
    String filterNationalDestinationCode = listAvailablePhoneNumbersRequest.filterNationalDestinationCode();
    String filterRateCenter = listAvailablePhoneNumbersRequest.filterRateCenter();
    String filterNumberType = listAvailablePhoneNumbersRequest.filterNumberType();
    List<String> filterFeatures = listAvailablePhoneNumbersRequest.filterFeatures();
    Integer filterLimit = listAvailablePhoneNumbersRequest.filterLimit();
    Boolean filterBestEffort = listAvailablePhoneNumbersRequest.filterBestEffort();
    Boolean filterQuickship = listAvailablePhoneNumbersRequest.filterQuickship();
    Boolean filterReservable = listAvailablePhoneNumbersRequest.filterReservable();
    return listAvailablePhoneNumbersWithHttpInfo(filterPhoneNumberStartsWith, filterPhoneNumberEndsWith, filterPhoneNumberContains, filterLocality, filterAdministrativeArea, filterCountryCode, filterNationalDestinationCode, filterRateCenter, filterNumberType, filterFeatures, filterLimit, filterBestEffort, filterQuickship, filterReservable);
  }

  /**
   * List available phone numbers
   * 
   * @param filterPhoneNumberStartsWith Filter numbers starting with a pattern (meant to be used after &#x60;national_destination_code&#x60; filter has been set). (optional)
   * @param filterPhoneNumberEndsWith Filter numbers ending with a pattern. (optional)
   * @param filterPhoneNumberContains Filter numbers containing a pattern. (optional)
   * @param filterLocality Filter phone numbers by city. (optional)
   * @param filterAdministrativeArea Filter phone numbers by US state/CA province. (optional)
   * @param filterCountryCode Filter phone numbers by ISO alpha-2 country code. (optional)
   * @param filterNationalDestinationCode Filter by the national destination code of the number. This filter is only applicable to North American numbers. (optional)
   * @param filterRateCenter Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers. (optional)
   * @param filterNumberType Filter phone numbers by number type. (optional)
   * @param filterFeatures Filter if the phone number should be used for voice, fax, mms, sms, emergency. (optional
   * @param filterLimit Limits the number of results. (optional)
   * @param filterBestEffort Filter to determine if best effort results should be included. (optional)
   * @param filterQuickship Filter to exclude phone numbers that need additional time after to purchase to receive phone calls. (optional)
   * @param filterReservable Filter to exclude phone numbers that cannot be reserved before purchase. (optional)
   * @return CompletableFuture&lt;ListAvailablePhoneNumbersResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ListAvailablePhoneNumbersResponse> listAvailablePhoneNumbers(String filterPhoneNumberStartsWith, String filterPhoneNumberEndsWith, String filterPhoneNumberContains, String filterLocality, String filterAdministrativeArea, String filterCountryCode, String filterNationalDestinationCode, String filterRateCenter, String filterNumberType, List<String> filterFeatures, Integer filterLimit, Boolean filterBestEffort, Boolean filterQuickship, Boolean filterReservable) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = listAvailablePhoneNumbersRequestBuilder(filterPhoneNumberStartsWith, filterPhoneNumberEndsWith, filterPhoneNumberContains, filterLocality, filterAdministrativeArea, filterCountryCode, filterNationalDestinationCode, filterRateCenter, filterNumberType, filterFeatures, filterLimit, filterBestEffort, filterQuickship, filterReservable);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("listAvailablePhoneNumbers", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListAvailablePhoneNumbersResponse>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * List available phone numbers
   * 
   * @param filterPhoneNumberStartsWith Filter numbers starting with a pattern (meant to be used after &#x60;national_destination_code&#x60; filter has been set). (optional)
   * @param filterPhoneNumberEndsWith Filter numbers ending with a pattern. (optional)
   * @param filterPhoneNumberContains Filter numbers containing a pattern. (optional)
   * @param filterLocality Filter phone numbers by city. (optional)
   * @param filterAdministrativeArea Filter phone numbers by US state/CA province. (optional)
   * @param filterCountryCode Filter phone numbers by ISO alpha-2 country code. (optional)
   * @param filterNationalDestinationCode Filter by the national destination code of the number. This filter is only applicable to North American numbers. (optional)
   * @param filterRateCenter Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers. (optional)
   * @param filterNumberType Filter phone numbers by number type. (optional)
   * @param filterFeatures Filter if the phone number should be used for voice, fax, mms, sms, emergency. (optional
   * @param filterLimit Limits the number of results. (optional)
   * @param filterBestEffort Filter to determine if best effort results should be included. (optional)
   * @param filterQuickship Filter to exclude phone numbers that need additional time after to purchase to receive phone calls. (optional)
   * @param filterReservable Filter to exclude phone numbers that cannot be reserved before purchase. (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;ListAvailablePhoneNumbersResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ListAvailablePhoneNumbersResponse>> listAvailablePhoneNumbersWithHttpInfo(String filterPhoneNumberStartsWith, String filterPhoneNumberEndsWith, String filterPhoneNumberContains, String filterLocality, String filterAdministrativeArea, String filterCountryCode, String filterNationalDestinationCode, String filterRateCenter, String filterNumberType, List<String> filterFeatures, Integer filterLimit, Boolean filterBestEffort, Boolean filterQuickship, Boolean filterReservable) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = listAvailablePhoneNumbersRequestBuilder(filterPhoneNumberStartsWith, filterPhoneNumberEndsWith, filterPhoneNumberContains, filterLocality, filterAdministrativeArea, filterCountryCode, filterNationalDestinationCode, filterRateCenter, filterNumberType, filterFeatures, filterLimit, filterBestEffort, filterQuickship, filterReservable);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("listAvailablePhoneNumbers", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<ListAvailablePhoneNumbersResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListAvailablePhoneNumbersResponse>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder listAvailablePhoneNumbersRequestBuilder(String filterPhoneNumberStartsWith, String filterPhoneNumberEndsWith, String filterPhoneNumberContains, String filterLocality, String filterAdministrativeArea, String filterCountryCode, String filterNationalDestinationCode, String filterRateCenter, String filterNumberType, List<String> filterFeatures, Integer filterLimit, Boolean filterBestEffort, Boolean filterQuickship, Boolean filterReservable) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/available_phone_numbers";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[phone_number][starts_with]", filterPhoneNumberStartsWith));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[phone_number][ends_with]", filterPhoneNumberEndsWith));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[phone_number][contains]", filterPhoneNumberContains));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[locality]", filterLocality));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[administrative_area]", filterAdministrativeArea));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[country_code]", filterCountryCode));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[national_destination_code]", filterNationalDestinationCode));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[rate_center]", filterRateCenter));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[number_type]", filterNumberType));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "filter[features]", filterFeatures));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[limit]", filterLimit));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[best_effort]", filterBestEffort));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[quickship]", filterQuickship));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[reservable]", filterReservable));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  public static final class APIlistAvailablePhoneNumbersRequest {
    private String filterPhoneNumberStartsWith; // Filter numbers starting with a pattern (meant to be used after &#x60;national_destination_code&#x60; filter has been set). (optional)
    private String filterPhoneNumberEndsWith; // Filter numbers ending with a pattern. (optional)
    private String filterPhoneNumberContains; // Filter numbers containing a pattern. (optional)
    private String filterLocality; // Filter phone numbers by city. (optional)
    private String filterAdministrativeArea; // Filter phone numbers by US state/CA province. (optional)
    private String filterCountryCode; // Filter phone numbers by ISO alpha-2 country code. (optional)
    private String filterNationalDestinationCode; // Filter by the national destination code of the number. This filter is only applicable to North American numbers. (optional)
    private String filterRateCenter; // Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers. (optional)
    private String filterNumberType; // Filter phone numbers by number type. (optional)
    private List<String> filterFeatures; // Filter if the phone number should be used for voice, fax, mms, sms, emergency. (optional
    private Integer filterLimit; // Limits the number of results. (optional)
    private Boolean filterBestEffort; // Filter to determine if best effort results should be included. (optional)
    private Boolean filterQuickship; // Filter to exclude phone numbers that need additional time after to purchase to receive phone calls. (optional)
    private Boolean filterReservable; // Filter to exclude phone numbers that cannot be reserved before purchase. (optional)

    private APIlistAvailablePhoneNumbersRequest(Builder builder) {
      this.filterPhoneNumberStartsWith = builder.filterPhoneNumberStartsWith;
      this.filterPhoneNumberEndsWith = builder.filterPhoneNumberEndsWith;
      this.filterPhoneNumberContains = builder.filterPhoneNumberContains;
      this.filterLocality = builder.filterLocality;
      this.filterAdministrativeArea = builder.filterAdministrativeArea;
      this.filterCountryCode = builder.filterCountryCode;
      this.filterNationalDestinationCode = builder.filterNationalDestinationCode;
      this.filterRateCenter = builder.filterRateCenter;
      this.filterNumberType = builder.filterNumberType;
      this.filterFeatures = builder.filterFeatures;
      this.filterLimit = builder.filterLimit;
      this.filterBestEffort = builder.filterBestEffort;
      this.filterQuickship = builder.filterQuickship;
      this.filterReservable = builder.filterReservable;
    }
    public String filterPhoneNumberStartsWith() {
      return filterPhoneNumberStartsWith;
    }
    public String filterPhoneNumberEndsWith() {
      return filterPhoneNumberEndsWith;
    }
    public String filterPhoneNumberContains() {
      return filterPhoneNumberContains;
    }
    public String filterLocality() {
      return filterLocality;
    }
    public String filterAdministrativeArea() {
      return filterAdministrativeArea;
    }
    public String filterCountryCode() {
      return filterCountryCode;
    }
    public String filterNationalDestinationCode() {
      return filterNationalDestinationCode;
    }
    public String filterRateCenter() {
      return filterRateCenter;
    }
    public String filterNumberType() {
      return filterNumberType;
    }
    public List<String> filterFeatures() {
      return filterFeatures;
    }
    public Integer filterLimit() {
      return filterLimit;
    }
    public Boolean filterBestEffort() {
      return filterBestEffort;
    }
    public Boolean filterQuickship() {
      return filterQuickship;
    }
    public Boolean filterReservable() {
      return filterReservable;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String filterPhoneNumberStartsWith;
      private String filterPhoneNumberEndsWith;
      private String filterPhoneNumberContains;
      private String filterLocality;
      private String filterAdministrativeArea;
      private String filterCountryCode;
      private String filterNationalDestinationCode;
      private String filterRateCenter;
      private String filterNumberType;
      private List<String> filterFeatures;
      private Integer filterLimit;
      private Boolean filterBestEffort;
      private Boolean filterQuickship;
      private Boolean filterReservable;

      public Builder filterPhoneNumberStartsWith(String filterPhoneNumberStartsWith) {
        this.filterPhoneNumberStartsWith = filterPhoneNumberStartsWith;
        return this;
      }
      public Builder filterPhoneNumberEndsWith(String filterPhoneNumberEndsWith) {
        this.filterPhoneNumberEndsWith = filterPhoneNumberEndsWith;
        return this;
      }
      public Builder filterPhoneNumberContains(String filterPhoneNumberContains) {
        this.filterPhoneNumberContains = filterPhoneNumberContains;
        return this;
      }
      public Builder filterLocality(String filterLocality) {
        this.filterLocality = filterLocality;
        return this;
      }
      public Builder filterAdministrativeArea(String filterAdministrativeArea) {
        this.filterAdministrativeArea = filterAdministrativeArea;
        return this;
      }
      public Builder filterCountryCode(String filterCountryCode) {
        this.filterCountryCode = filterCountryCode;
        return this;
      }
      public Builder filterNationalDestinationCode(String filterNationalDestinationCode) {
        this.filterNationalDestinationCode = filterNationalDestinationCode;
        return this;
      }
      public Builder filterRateCenter(String filterRateCenter) {
        this.filterRateCenter = filterRateCenter;
        return this;
      }
      public Builder filterNumberType(String filterNumberType) {
        this.filterNumberType = filterNumberType;
        return this;
      }
      public Builder filterFeatures(List<String> filterFeatures) {
        this.filterFeatures = filterFeatures;
        return this;
      }
      public Builder filterLimit(Integer filterLimit) {
        this.filterLimit = filterLimit;
        return this;
      }
      public Builder filterBestEffort(Boolean filterBestEffort) {
        this.filterBestEffort = filterBestEffort;
        return this;
      }
      public Builder filterQuickship(Boolean filterQuickship) {
        this.filterQuickship = filterQuickship;
        return this;
      }
      public Builder filterReservable(Boolean filterReservable) {
        this.filterReservable = filterReservable;
        return this;
      }
      public APIlistAvailablePhoneNumbersRequest build() {
        return new APIlistAvailablePhoneNumbersRequest(this);
      }
    }
  }

}
