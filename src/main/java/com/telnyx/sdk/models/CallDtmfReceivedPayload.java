/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.telnyx.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CallDtmfReceivedPayload
 */


public class CallDtmfReceivedPayload {
  @SerializedName("call_control_id")
  private String callControlId = null;

  @SerializedName("connection_id")
  private String connectionId = null;

  @SerializedName("call_leg_id")
  private String callLegId = null;

  @SerializedName("call_session_id")
  private String callSessionId = null;

  @SerializedName("client_state")
  private String clientState = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("digit")
  private String digit = null;

  public CallDtmfReceivedPayload callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Call ID used to issue commands via Call Control API.
   * @return callControlId
  **/
  @Schema(example = "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ", description = "Call ID used to issue commands via Call Control API.")
  public String getCallControlId() {
    return callControlId;
  }

  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }

  public CallDtmfReceivedPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Identifies the type of resource.
   * @return connectionId
  **/
  @Schema(example = "7267xxxxxxxxxxxxxx", description = "Identifies the type of resource.")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public CallDtmfReceivedPayload callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events.
   * @return callLegId
  **/
  @Schema(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", description = "ID that is unique to the call and can be used to correlate webhook events.")
  public String getCallLegId() {
    return callLegId;
  }

  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }

  public CallDtmfReceivedPayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events.
   * @return callSessionId
  **/
  @Schema(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", description = "ID that is unique to the call session and can be used to correlate webhook events.")
  public String getCallSessionId() {
    return callSessionId;
  }

  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }

  public CallDtmfReceivedPayload clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * State received from a command.
   * @return clientState
  **/
  @Schema(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", description = "State received from a command.")
  public String getClientState() {
    return clientState;
  }

  public void setClientState(String clientState) {
    this.clientState = clientState;
  }

  public CallDtmfReceivedPayload from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Number or SIP URI placing the call.
   * @return from
  **/
  @Schema(example = "+35319605860", description = "Number or SIP URI placing the call.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public CallDtmfReceivedPayload to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Destination number or SIP URI of the call.
   * @return to
  **/
  @Schema(example = "+13129457420", description = "Destination number or SIP URI of the call.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public CallDtmfReceivedPayload digit(String digit) {
    this.digit = digit;
    return this;
  }

   /**
   * The received DTMF digit or symbol.
   * @return digit
  **/
  @Schema(example = "#", description = "The received DTMF digit or symbol.")
  public String getDigit() {
    return digit;
  }

  public void setDigit(String digit) {
    this.digit = digit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallDtmfReceivedPayload callDtmfReceivedPayload = (CallDtmfReceivedPayload) o;
    return Objects.equals(this.callControlId, callDtmfReceivedPayload.callControlId) &&
        Objects.equals(this.connectionId, callDtmfReceivedPayload.connectionId) &&
        Objects.equals(this.callLegId, callDtmfReceivedPayload.callLegId) &&
        Objects.equals(this.callSessionId, callDtmfReceivedPayload.callSessionId) &&
        Objects.equals(this.clientState, callDtmfReceivedPayload.clientState) &&
        Objects.equals(this.from, callDtmfReceivedPayload.from) &&
        Objects.equals(this.to, callDtmfReceivedPayload.to) &&
        Objects.equals(this.digit, callDtmfReceivedPayload.digit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, connectionId, callLegId, callSessionId, clientState, from, to, digit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallDtmfReceivedPayload {\n");
    
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    digit: ").append(toIndentedString(digit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
