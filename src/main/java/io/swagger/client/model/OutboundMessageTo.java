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
/**
 * OutboundMessageTo
 */


public class OutboundMessageTo {
  @SerializedName("phone_number")
  private String phoneNumber = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    QUEUED("queued"),
    SENDING("sending"),
    SENT("sent"),
    DELIVERED("delivered"),
    SENDING_FAILED("sending_failed"),
    DELIVERY_FAILED("delivery_failed"),
    DELIVERY_UNCONFIRMED("delivery_unconfirmed");

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

  @SerializedName("carrier")
  private String carrier = null;

  /**
   * The line-type of the receiver.
   */
  @JsonAdapter(LineTypeEnum.Adapter.class)
  public enum LineTypeEnum {
    WIRELINE("Wireline"),
    WIRELESS("Wireless"),
    VOWIFI("VoWiFi"),
    VOIP("VoIP"),
    PRE_PAID_WIRELESS("Pre-Paid Wireless");

    private String value;

    LineTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LineTypeEnum fromValue(String text) {
      for (LineTypeEnum b : LineTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LineTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LineTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LineTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LineTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("line_type")
  private LineTypeEnum lineType = null;

  public OutboundMessageTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Receiving address (+E.164 formatted phone number or short code).
   * @return phoneNumber
  **/
  @Schema(description = "Receiving address (+E.164 formatted phone number or short code).")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public OutboundMessageTo status(StatusEnum status) {
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

  public OutboundMessageTo carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * The carrier of the receiver.
   * @return carrier
  **/
  @Schema(description = "The carrier of the receiver.")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public OutboundMessageTo lineType(LineTypeEnum lineType) {
    this.lineType = lineType;
    return this;
  }

   /**
   * The line-type of the receiver.
   * @return lineType
  **/
  @Schema(description = "The line-type of the receiver.")
  public LineTypeEnum getLineType() {
    return lineType;
  }

  public void setLineType(LineTypeEnum lineType) {
    this.lineType = lineType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessageTo outboundMessageTo = (OutboundMessageTo) o;
    return Objects.equals(this.phoneNumber, outboundMessageTo.phoneNumber) &&
        Objects.equals(this.status, outboundMessageTo.status) &&
        Objects.equals(this.carrier, outboundMessageTo.carrier) &&
        Objects.equals(this.lineType, outboundMessageTo.lineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, status, carrier, lineType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessageTo {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
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
