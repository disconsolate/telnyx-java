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


package com.telnyx.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AnswerRequest
 */
@JsonPropertyOrder({
  AnswerRequest.JSON_PROPERTY_CLIENT_STATE,
  AnswerRequest.JSON_PROPERTY_COMMAND_ID,
  AnswerRequest.JSON_PROPERTY_WEBHOOK_URL,
  AnswerRequest.JSON_PROPERTY_WEBHOOK_URL_METHOD
})
@JsonTypeName("AnswerRequest")
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AnswerRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private String webhookUrl;

  /**
   * HTTP request type used for &#x60;webhook_url&#x60;.
   */
  public enum WebhookUrlMethodEnum {
    POST("POST"),
    
    GET("GET");

    private String value;

    WebhookUrlMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WebhookUrlMethodEnum fromValue(String value) {
      for (WebhookUrlMethodEnum b : WebhookUrlMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WEBHOOK_URL_METHOD = "webhook_url_method";
  private WebhookUrlMethodEnum webhookUrlMethod = WebhookUrlMethodEnum.POST;


  public AnswerRequest clientState(String clientState) {
    
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientState() {
    return clientState;
  }


  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public AnswerRequest commandId(String commandId) {
    
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;.
   * @return commandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "891510ac-f3e4-11e8-af5b-de00688a4901", value = "Use this field to avoid duplicate commands. Telnyx will ignore commands with the same `command_id`.")
  @JsonProperty(JSON_PROPERTY_COMMAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommandId() {
    return commandId;
  }


  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  public AnswerRequest webhookUrl(String webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Use this field to override the URL for which Telnyx will send subsuqeunt webhooks to for this call.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example.com/server-b/", value = "Use this field to override the URL for which Telnyx will send subsuqeunt webhooks to for this call.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  public AnswerRequest webhookUrlMethod(WebhookUrlMethodEnum webhookUrlMethod) {
    
    this.webhookUrlMethod = webhookUrlMethod;
    return this;
  }

   /**
   * HTTP request type used for &#x60;webhook_url&#x60;.
   * @return webhookUrlMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GET", value = "HTTP request type used for `webhook_url`.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookUrlMethodEnum getWebhookUrlMethod() {
    return webhookUrlMethod;
  }


  public void setWebhookUrlMethod(WebhookUrlMethodEnum webhookUrlMethod) {
    this.webhookUrlMethod = webhookUrlMethod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerRequest answerRequest = (AnswerRequest) o;
    return Objects.equals(this.clientState, answerRequest.clientState) &&
        Objects.equals(this.commandId, answerRequest.commandId) &&
        Objects.equals(this.webhookUrl, answerRequest.webhookUrl) &&
        Objects.equals(this.webhookUrlMethod, answerRequest.webhookUrlMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientState, commandId, webhookUrl, webhookUrlMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerRequest {\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    webhookUrlMethod: ").append(toIndentedString(webhookUrlMethod)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

