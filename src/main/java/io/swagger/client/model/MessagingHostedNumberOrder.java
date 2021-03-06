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
import io.swagger.client.model.HostedNumber;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * MessagingHostedNumberOrder
 */


public class MessagingHostedNumberOrder {
  @SerializedName("record_type")
  private String recordType = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("messaging_profile_id")
  private UUID messagingProfileId = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    FAILED("failed"),
    PENDING("pending"),
    SUCCESSFUL("successful");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("phone_numbers")
  private List<HostedNumber> phoneNumbers = null;

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @Schema(example = "messaging_hosted_number_order", description = "Identifies the type of the resource.")
  public String getRecordType() {
    return recordType;
  }

   /**
   * Resource unique identifier.
   * @return id
  **/
  @Schema(description = "Resource unique identifier.")
  public UUID getId() {
    return id;
  }

  public MessagingHostedNumberOrder messagingProfileId(UUID messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
    return this;
  }

   /**
   * Automatically associate the number with this messaging profile ID when the order is complete.
   * @return messagingProfileId
  **/
  @Schema(description = "Automatically associate the number with this messaging profile ID when the order is complete.")
  public UUID getMessagingProfileId() {
    return messagingProfileId;
  }

  public void setMessagingProfileId(UUID messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
  }

  public MessagingHostedNumberOrder status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MessagingHostedNumberOrder phoneNumbers(List<HostedNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public MessagingHostedNumberOrder addPhoneNumbersItem(HostedNumber phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @Schema(description = "")
  public List<HostedNumber> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<HostedNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingHostedNumberOrder messagingHostedNumberOrder = (MessagingHostedNumberOrder) o;
    return Objects.equals(this.recordType, messagingHostedNumberOrder.recordType) &&
        Objects.equals(this.id, messagingHostedNumberOrder.id) &&
        Objects.equals(this.messagingProfileId, messagingHostedNumberOrder.messagingProfileId) &&
        Objects.equals(this.status, messagingHostedNumberOrder.status) &&
        Objects.equals(this.phoneNumbers, messagingHostedNumberOrder.phoneNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, id, messagingProfileId, status, phoneNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingHostedNumberOrder {\n");
    
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
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
