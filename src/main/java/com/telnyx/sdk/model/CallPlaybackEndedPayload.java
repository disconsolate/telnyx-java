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


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CallPlaybackEndedPayload
 */
@JsonPropertyOrder({
  CallPlaybackEndedPayload.JSON_PROPERTY_CALL_CONTROL_ID,
  CallPlaybackEndedPayload.JSON_PROPERTY_CONNECTION_ID,
  CallPlaybackEndedPayload.JSON_PROPERTY_CALL_LEG_ID,
  CallPlaybackEndedPayload.JSON_PROPERTY_CALL_SESSION_ID,
  CallPlaybackEndedPayload.JSON_PROPERTY_CLIENT_STATE,
  CallPlaybackEndedPayload.JSON_PROPERTY_MEDIA_URL,
  CallPlaybackEndedPayload.JSON_PROPERTY_OVERLAY,
  CallPlaybackEndedPayload.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallPlaybackEndedPayload {
  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
  private String callLegId;

  public static final String JSON_PROPERTY_CALL_SESSION_ID = "call_session_id";
  private String callSessionId;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_MEDIA_URL = "media_url";
  private String mediaUrl;

  public static final String JSON_PROPERTY_OVERLAY = "overlay";
  private Boolean overlay;

  /**
   * Reflects how command ended.
   */
  public enum StatusEnum {
    VALID("valid"),
    
    INVALID("invalid"),
    
    CALL_HANGUP("call_hangup");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;


  public CallPlaybackEndedPayload callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Call ID used to issue commands via Call Control API.
   * @return callControlId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ", value = "Call ID used to issue commands via Call Control API.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallControlId() {
    return callControlId;
  }


  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }


  public CallPlaybackEndedPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Telnyx connection ID used in the call.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7267xxxxxxxxxxxxxx", value = "Telnyx connection ID used in the call.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public CallPlaybackEndedPayload callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events.
   * @return callLegId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", value = "ID that is unique to the call and can be used to correlate webhook events.")
  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallLegId() {
    return callLegId;
  }


  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }


  public CallPlaybackEndedPayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events.
   * @return callSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", value = "ID that is unique to the call session and can be used to correlate webhook events.")
  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallSessionId() {
    return callSessionId;
  }


  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }


  public CallPlaybackEndedPayload clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * State received from a command.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "State received from a command.")
  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientState() {
    return clientState;
  }


  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public CallPlaybackEndedPayload mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The audio URL being played back.
   * @return mediaUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://example.com/audio.wav", value = "The audio URL being played back.")
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaUrl() {
    return mediaUrl;
  }


  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


  public CallPlaybackEndedPayload overlay(Boolean overlay) {
    this.overlay = overlay;
    return this;
  }

   /**
   * Whether the audio is going to be played in overlay mode or not.
   * @return overlay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the audio is going to be played in overlay mode or not.")
  @JsonProperty(JSON_PROPERTY_OVERLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOverlay() {
    return overlay;
  }


  public void setOverlay(Boolean overlay) {
    this.overlay = overlay;
  }


  public CallPlaybackEndedPayload status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Reflects how command ended.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "valid", value = "Reflects how command ended.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this CallPlaybackEnded_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallPlaybackEndedPayload callPlaybackEndedPayload = (CallPlaybackEndedPayload) o;
    return Objects.equals(this.callControlId, callPlaybackEndedPayload.callControlId) &&
        Objects.equals(this.connectionId, callPlaybackEndedPayload.connectionId) &&
        Objects.equals(this.callLegId, callPlaybackEndedPayload.callLegId) &&
        Objects.equals(this.callSessionId, callPlaybackEndedPayload.callSessionId) &&
        Objects.equals(this.clientState, callPlaybackEndedPayload.clientState) &&
        Objects.equals(this.mediaUrl, callPlaybackEndedPayload.mediaUrl) &&
        Objects.equals(this.overlay, callPlaybackEndedPayload.overlay) &&
        Objects.equals(this.status, callPlaybackEndedPayload.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, connectionId, callLegId, callSessionId, clientState, mediaUrl, overlay, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallPlaybackEndedPayload {\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    overlay: ").append(toIndentedString(overlay)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
