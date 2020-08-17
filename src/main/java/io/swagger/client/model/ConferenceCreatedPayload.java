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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;
/**
 * ConferenceCreatedPayload
 */


public class ConferenceCreatedPayload {
  @SerializedName("call_control_id")
  private UUID callControlId = null;

  @SerializedName("connection_id")
  private String connectionId = null;

  @SerializedName("call_leg_id")
  private String callLegId = null;

  @SerializedName("call_session_id")
  private String callSessionId = null;

  @SerializedName("client_state")
  private String clientState = null;

  @SerializedName("conference_id")
  private String conferenceId = null;

  @SerializedName("occurred_at")
  private OffsetDateTime occurredAt = null;

  public ConferenceCreatedPayload callControlId(UUID callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Call ID used to issue commands via Call Control API.
   * @return callControlId
  **/
  @Schema(description = "Call ID used to issue commands via Call Control API.")
  public UUID getCallControlId() {
    return callControlId;
  }

  public void setCallControlId(UUID callControlId) {
    this.callControlId = callControlId;
  }

  public ConferenceCreatedPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Telnyx connection ID used in the call.
   * @return connectionId
  **/
  @Schema(example = "7267xxxxxxxxxxxxxx", description = "Telnyx connection ID used in the call.")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public ConferenceCreatedPayload callLegId(String callLegId) {
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

  public ConferenceCreatedPayload callSessionId(String callSessionId) {
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

  public ConferenceCreatedPayload clientState(String clientState) {
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

  public ConferenceCreatedPayload conferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
    return this;
  }

   /**
   * Conference ID that the participant joined.
   * @return conferenceId
  **/
  @Schema(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", description = "Conference ID that the participant joined.")
  public String getConferenceId() {
    return conferenceId;
  }

  public void setConferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
  }

  public ConferenceCreatedPayload occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * ISO 8601 datetime of when the event occurred.
   * @return occurredAt
  **/
  @Schema(example = "2018-02-02T22:25:27.521Z", description = "ISO 8601 datetime of when the event occurred.")
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceCreatedPayload conferenceCreatedPayload = (ConferenceCreatedPayload) o;
    return Objects.equals(this.callControlId, conferenceCreatedPayload.callControlId) &&
        Objects.equals(this.connectionId, conferenceCreatedPayload.connectionId) &&
        Objects.equals(this.callLegId, conferenceCreatedPayload.callLegId) &&
        Objects.equals(this.callSessionId, conferenceCreatedPayload.callSessionId) &&
        Objects.equals(this.clientState, conferenceCreatedPayload.clientState) &&
        Objects.equals(this.conferenceId, conferenceCreatedPayload.conferenceId) &&
        Objects.equals(this.occurredAt, conferenceCreatedPayload.occurredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, connectionId, callLegId, callSessionId, clientState, conferenceId, occurredAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceCreatedPayload {\n");
    
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
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