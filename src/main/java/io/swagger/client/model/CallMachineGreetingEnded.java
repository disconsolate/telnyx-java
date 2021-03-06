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
import io.swagger.client.model.CallMachineGreetingEndedPayload;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;
/**
 * CallMachineGreetingEnded
 */


public class CallMachineGreetingEnded {
  /**
   * Identifies the type of the resource.
   */
  @JsonAdapter(RecordTypeEnum.Adapter.class)
  public enum RecordTypeEnum {
    EVENT("event");

    private String value;

    RecordTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RecordTypeEnum fromValue(String text) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RecordTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecordTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecordTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecordTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("record_type")
  private RecordTypeEnum recordType = null;

  /**
   * The type of event being delivered.
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
  public enum EventTypeEnum {
    ENDED("call.machine.greeting.ended");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EventTypeEnum fromValue(String text) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EventTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("event_type")
  private EventTypeEnum eventType = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("occurred_at")
  private OffsetDateTime occurredAt = null;

  @SerializedName("payload")
  private CallMachineGreetingEndedPayload payload = null;

  public CallMachineGreetingEnded recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @Schema(example = "event", description = "Identifies the type of the resource.")
  public RecordTypeEnum getRecordType() {
    return recordType;
  }

  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }

  public CallMachineGreetingEnded eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of event being delivered.
   * @return eventType
  **/
  @Schema(example = "call.machine.greeting.ended", description = "The type of event being delivered.")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public CallMachineGreetingEnded id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @Schema(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", description = "Identifies the type of resource.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CallMachineGreetingEnded occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * ISO 8601 datetime of when the event occurred.
   * @return occurredAt
  **/
  @Schema(example = "2018-02-02T22:25:27.521992Z", description = "ISO 8601 datetime of when the event occurred.")
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }

  public CallMachineGreetingEnded payload(CallMachineGreetingEndedPayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @Schema(description = "")
  public CallMachineGreetingEndedPayload getPayload() {
    return payload;
  }

  public void setPayload(CallMachineGreetingEndedPayload payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallMachineGreetingEnded callMachineGreetingEnded = (CallMachineGreetingEnded) o;
    return Objects.equals(this.recordType, callMachineGreetingEnded.recordType) &&
        Objects.equals(this.eventType, callMachineGreetingEnded.eventType) &&
        Objects.equals(this.id, callMachineGreetingEnded.id) &&
        Objects.equals(this.occurredAt, callMachineGreetingEnded.occurredAt) &&
        Objects.equals(this.payload, callMachineGreetingEnded.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, eventType, id, occurredAt, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallMachineGreetingEnded {\n");
    
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
