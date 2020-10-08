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
import com.telnyx.sdk.models.ListNumberOrderRegulatoryRequirementsResponse;
import com.telnyx.sdk.models.ListPhoneNumberRegulatoryRequirementsResponse;
import com.telnyx.sdk.models.NumberOrderRegulatoryRequirementResponse;

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
public class NumberOrderRegulatoryRequirementsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;

  public NumberOrderRegulatoryRequirementsApi() {
    this(new ApiClient());
  }

  public NumberOrderRegulatoryRequirementsApi(ApiClient apiClient) {
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
   * List number order regulatory requirements
   * Gets a paginated list of number order regulatory requirements.
   * @param listNumberOrderRegulatoryRequirementsRequest {@link APIlistNumberOrderRegulatoryRequirementsRequest}
   * @return CompletableFuture&lt;ListNumberOrderRegulatoryRequirementsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ListNumberOrderRegulatoryRequirementsResponse> listNumberOrderRegulatoryRequirements(APIlistNumberOrderRegulatoryRequirementsRequest listNumberOrderRegulatoryRequirementsRequest) throws ApiException {
    String filterRequirementId = listNumberOrderRegulatoryRequirementsRequest.filterRequirementId();
    String filterFieldType = listNumberOrderRegulatoryRequirementsRequest.filterFieldType();
    String filterRequirementType = listNumberOrderRegulatoryRequirementsRequest.filterRequirementType();
    return listNumberOrderRegulatoryRequirements(filterRequirementId, filterFieldType, filterRequirementType);
  }

  /**
   * List number order regulatory requirements
   * Gets a paginated list of number order regulatory requirements.
   * @param listNumberOrderRegulatoryRequirementsRequest {@link APIlistNumberOrderRegulatoryRequirementsRequest}
   * @return CompletableFuture&lt;ApiResponse&lt;ListNumberOrderRegulatoryRequirementsResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ListNumberOrderRegulatoryRequirementsResponse>> listNumberOrderRegulatoryRequirementsWithHttpInfo(APIlistNumberOrderRegulatoryRequirementsRequest listNumberOrderRegulatoryRequirementsRequest) throws ApiException {
    String filterRequirementId = listNumberOrderRegulatoryRequirementsRequest.filterRequirementId();
    String filterFieldType = listNumberOrderRegulatoryRequirementsRequest.filterFieldType();
    String filterRequirementType = listNumberOrderRegulatoryRequirementsRequest.filterRequirementType();
    return listNumberOrderRegulatoryRequirementsWithHttpInfo(filterRequirementId, filterFieldType, filterRequirementType);
  }

  /**
   * List number order regulatory requirements
   * Gets a paginated list of number order regulatory requirements.
   * @param filterRequirementId Filter number order regulatory requirements by &#x60;requirement_id&#x60;. (optional)
   * @param filterFieldType Filter number order regulatory requirements by &#x60;field_type&#x60;. (optional)
   * @param filterRequirementType Filter number order regulatory requirements by &#x60;requirement_type&#x60;. (optional)
   * @return CompletableFuture&lt;ListNumberOrderRegulatoryRequirementsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ListNumberOrderRegulatoryRequirementsResponse> listNumberOrderRegulatoryRequirements(String filterRequirementId, String filterFieldType, String filterRequirementType) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = listNumberOrderRegulatoryRequirementsRequestBuilder(filterRequirementId, filterFieldType, filterRequirementType);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("listNumberOrderRegulatoryRequirements", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListNumberOrderRegulatoryRequirementsResponse>() {})
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
   * List number order regulatory requirements
   * Gets a paginated list of number order regulatory requirements.
   * @param filterRequirementId Filter number order regulatory requirements by &#x60;requirement_id&#x60;. (optional)
   * @param filterFieldType Filter number order regulatory requirements by &#x60;field_type&#x60;. (optional)
   * @param filterRequirementType Filter number order regulatory requirements by &#x60;requirement_type&#x60;. (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;ListNumberOrderRegulatoryRequirementsResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ListNumberOrderRegulatoryRequirementsResponse>> listNumberOrderRegulatoryRequirementsWithHttpInfo(String filterRequirementId, String filterFieldType, String filterRequirementType) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = listNumberOrderRegulatoryRequirementsRequestBuilder(filterRequirementId, filterFieldType, filterRequirementType);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("listNumberOrderRegulatoryRequirements", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<ListNumberOrderRegulatoryRequirementsResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListNumberOrderRegulatoryRequirementsResponse>() {}))
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

  private HttpRequest.Builder listNumberOrderRegulatoryRequirementsRequestBuilder(String filterRequirementId, String filterFieldType, String filterRequirementType) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/regulatory_requirements";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[requirement_id]", filterRequirementId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[field_type]", filterFieldType));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter[requirement_type]", filterRequirementType));

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

  public static final class APIlistNumberOrderRegulatoryRequirementsRequest {
    private String filterRequirementId; // Filter number order regulatory requirements by &#x60;requirement_id&#x60;. (optional)
    private String filterFieldType; // Filter number order regulatory requirements by &#x60;field_type&#x60;. (optional)
    private String filterRequirementType; // Filter number order regulatory requirements by &#x60;requirement_type&#x60;. (optional)

    private APIlistNumberOrderRegulatoryRequirementsRequest(Builder builder) {
      this.filterRequirementId = builder.filterRequirementId;
      this.filterFieldType = builder.filterFieldType;
      this.filterRequirementType = builder.filterRequirementType;
    }
    public String filterRequirementId() {
      return filterRequirementId;
    }
    public String filterFieldType() {
      return filterFieldType;
    }
    public String filterRequirementType() {
      return filterRequirementType;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String filterRequirementId;
      private String filterFieldType;
      private String filterRequirementType;

      public Builder filterRequirementId(String filterRequirementId) {
        this.filterRequirementId = filterRequirementId;
        return this;
      }
      public Builder filterFieldType(String filterFieldType) {
        this.filterFieldType = filterFieldType;
        return this;
      }
      public Builder filterRequirementType(String filterRequirementType) {
        this.filterRequirementType = filterRequirementType;
        return this;
      }
      public APIlistNumberOrderRegulatoryRequirementsRequest build() {
        return new APIlistNumberOrderRegulatoryRequirementsRequest(this);
      }
    }
  }

  /**
   * List regulatory requirements per number
   * Gets a paginated list of phone number regulatory requirements.
   * @param listPhoneNumberRegulatoryRequirementsRequest {@link APIlistPhoneNumberRegulatoryRequirementsRequest}
   * @return CompletableFuture&lt;ListPhoneNumberRegulatoryRequirementsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ListPhoneNumberRegulatoryRequirementsResponse> listPhoneNumberRegulatoryRequirements(APIlistPhoneNumberRegulatoryRequirementsRequest listPhoneNumberRegulatoryRequirementsRequest) throws ApiException {
    List<String> filterPhoneNumber = listPhoneNumberRegulatoryRequirementsRequest.filterPhoneNumber();
    return listPhoneNumberRegulatoryRequirements(filterPhoneNumber);
  }

  /**
   * List regulatory requirements per number
   * Gets a paginated list of phone number regulatory requirements.
   * @param listPhoneNumberRegulatoryRequirementsRequest {@link APIlistPhoneNumberRegulatoryRequirementsRequest}
   * @return CompletableFuture&lt;ApiResponse&lt;ListPhoneNumberRegulatoryRequirementsResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ListPhoneNumberRegulatoryRequirementsResponse>> listPhoneNumberRegulatoryRequirementsWithHttpInfo(APIlistPhoneNumberRegulatoryRequirementsRequest listPhoneNumberRegulatoryRequirementsRequest) throws ApiException {
    List<String> filterPhoneNumber = listPhoneNumberRegulatoryRequirementsRequest.filterPhoneNumber();
    return listPhoneNumberRegulatoryRequirementsWithHttpInfo(filterPhoneNumber);
  }

  /**
   * List regulatory requirements per number
   * Gets a paginated list of phone number regulatory requirements.
   * @param filterPhoneNumber The list of phone numbers to retrieve regulatory requirements for. (optional
   * @return CompletableFuture&lt;ListPhoneNumberRegulatoryRequirementsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ListPhoneNumberRegulatoryRequirementsResponse> listPhoneNumberRegulatoryRequirements(List<String> filterPhoneNumber) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = listPhoneNumberRegulatoryRequirementsRequestBuilder(filterPhoneNumber);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("listPhoneNumberRegulatoryRequirements", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListPhoneNumberRegulatoryRequirementsResponse>() {})
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
   * List regulatory requirements per number
   * Gets a paginated list of phone number regulatory requirements.
   * @param filterPhoneNumber The list of phone numbers to retrieve regulatory requirements for. (optional
   * @return CompletableFuture&lt;ApiResponse&lt;ListPhoneNumberRegulatoryRequirementsResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ListPhoneNumberRegulatoryRequirementsResponse>> listPhoneNumberRegulatoryRequirementsWithHttpInfo(List<String> filterPhoneNumber) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = listPhoneNumberRegulatoryRequirementsRequestBuilder(filterPhoneNumber);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("listPhoneNumberRegulatoryRequirements", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<ListPhoneNumberRegulatoryRequirementsResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListPhoneNumberRegulatoryRequirementsResponse>() {}))
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

  private HttpRequest.Builder listPhoneNumberRegulatoryRequirementsRequestBuilder(List<String> filterPhoneNumber) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/phone_number_regulatory_requirements";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "filter[phone_number]", filterPhoneNumber));

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

  public static final class APIlistPhoneNumberRegulatoryRequirementsRequest {
    private List<String> filterPhoneNumber; // The list of phone numbers to retrieve regulatory requirements for. (optional

    private APIlistPhoneNumberRegulatoryRequirementsRequest(Builder builder) {
      this.filterPhoneNumber = builder.filterPhoneNumber;
    }
    public List<String> filterPhoneNumber() {
      return filterPhoneNumber;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private List<String> filterPhoneNumber;

      public Builder filterPhoneNumber(List<String> filterPhoneNumber) {
        this.filterPhoneNumber = filterPhoneNumber;
        return this;
      }
      public APIlistPhoneNumberRegulatoryRequirementsRequest build() {
        return new APIlistPhoneNumberRegulatoryRequirementsRequest(this);
      }
    }
  }

  /**
   * Retrieve a number order regulatory requirement
   * Gets a single number order regulatory requirement.
   * @param requirementId The number order regulatory requirement ID. (required)
   * @return CompletableFuture&lt;NumberOrderRegulatoryRequirementResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<NumberOrderRegulatoryRequirementResponse> retrieveNumberOrderRegulatoryRequirement(String requirementId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = retrieveNumberOrderRegulatoryRequirementRequestBuilder(requirementId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("retrieveNumberOrderRegulatoryRequirement", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<NumberOrderRegulatoryRequirementResponse>() {})
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
   * Retrieve a number order regulatory requirement
   * Gets a single number order regulatory requirement.
   * @param requirementId The number order regulatory requirement ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NumberOrderRegulatoryRequirementResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<NumberOrderRegulatoryRequirementResponse>> retrieveNumberOrderRegulatoryRequirementWithHttpInfo(String requirementId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = retrieveNumberOrderRegulatoryRequirementRequestBuilder(requirementId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("retrieveNumberOrderRegulatoryRequirement", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<NumberOrderRegulatoryRequirementResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<NumberOrderRegulatoryRequirementResponse>() {}))
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

  private HttpRequest.Builder retrieveNumberOrderRegulatoryRequirementRequestBuilder(String requirementId) throws ApiException {
    // verify the required parameter 'requirementId' is set
    if (requirementId == null) {
      throw new ApiException(400, "Missing the required parameter 'requirementId' when calling retrieveNumberOrderRegulatoryRequirement");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/regulatory_requirements/{requirement_id}"
        .replace("{requirement_id}", ApiClient.urlEncode(requirementId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

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
}
