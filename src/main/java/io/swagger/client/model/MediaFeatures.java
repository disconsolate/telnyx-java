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
 * The media features settings for a phone number.
 */
@Schema(description = "The media features settings for a phone number.")

public class MediaFeatures {
  @SerializedName("rtp_auto_adjust_enabled")
  private Boolean rtpAutoAdjustEnabled = true;

  /**
   * Controls how media is handled for the phone number. default: media routed through Telnyx with transcode support. proxy: media routed through Telnyx with no transcode support.
   */
  @JsonAdapter(MediaHandlingModeEnum.Adapter.class)
  public enum MediaHandlingModeEnum {
    DEFAULT("default"),
    PROXY("proxy");

    private String value;

    MediaHandlingModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MediaHandlingModeEnum fromValue(String text) {
      for (MediaHandlingModeEnum b : MediaHandlingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MediaHandlingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MediaHandlingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MediaHandlingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MediaHandlingModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("media_handling_mode")
  private MediaHandlingModeEnum mediaHandlingMode = MediaHandlingModeEnum.DEFAULT;

  @SerializedName("accept_any_rtp_packets_enabled")
  private Boolean acceptAnyRtpPacketsEnabled = false;

  @SerializedName("t38_fax_gateway_enabled")
  private Boolean t38FaxGatewayEnabled = false;

  public MediaFeatures rtpAutoAdjustEnabled(Boolean rtpAutoAdjustEnabled) {
    this.rtpAutoAdjustEnabled = rtpAutoAdjustEnabled;
    return this;
  }

   /**
   * When RTP Auto-Adjust is enabled, the destination RTP address port will be automatically changed to match the source of the incoming RTP packets.
   * @return rtpAutoAdjustEnabled
  **/
  @Schema(description = "When RTP Auto-Adjust is enabled, the destination RTP address port will be automatically changed to match the source of the incoming RTP packets.")
  public Boolean isRtpAutoAdjustEnabled() {
    return rtpAutoAdjustEnabled;
  }

  public void setRtpAutoAdjustEnabled(Boolean rtpAutoAdjustEnabled) {
    this.rtpAutoAdjustEnabled = rtpAutoAdjustEnabled;
  }

  public MediaFeatures mediaHandlingMode(MediaHandlingModeEnum mediaHandlingMode) {
    this.mediaHandlingMode = mediaHandlingMode;
    return this;
  }

   /**
   * Controls how media is handled for the phone number. default: media routed through Telnyx with transcode support. proxy: media routed through Telnyx with no transcode support.
   * @return mediaHandlingMode
  **/
  @Schema(description = "Controls how media is handled for the phone number. default: media routed through Telnyx with transcode support. proxy: media routed through Telnyx with no transcode support.")
  public MediaHandlingModeEnum getMediaHandlingMode() {
    return mediaHandlingMode;
  }

  public void setMediaHandlingMode(MediaHandlingModeEnum mediaHandlingMode) {
    this.mediaHandlingMode = mediaHandlingMode;
  }

  public MediaFeatures acceptAnyRtpPacketsEnabled(Boolean acceptAnyRtpPacketsEnabled) {
    this.acceptAnyRtpPacketsEnabled = acceptAnyRtpPacketsEnabled;
    return this;
  }

   /**
   * When enabled, Telnyx will accept RTP packets from any customer-side IP address and port, not just those to which Telnyx is sending RTP.
   * @return acceptAnyRtpPacketsEnabled
  **/
  @Schema(description = "When enabled, Telnyx will accept RTP packets from any customer-side IP address and port, not just those to which Telnyx is sending RTP.")
  public Boolean isAcceptAnyRtpPacketsEnabled() {
    return acceptAnyRtpPacketsEnabled;
  }

  public void setAcceptAnyRtpPacketsEnabled(Boolean acceptAnyRtpPacketsEnabled) {
    this.acceptAnyRtpPacketsEnabled = acceptAnyRtpPacketsEnabled;
  }

  public MediaFeatures t38FaxGatewayEnabled(Boolean t38FaxGatewayEnabled) {
    this.t38FaxGatewayEnabled = t38FaxGatewayEnabled;
    return this;
  }

   /**
   * Controls whether Telnyx will accept a T.38 re-INVITE for this phone number. Note that Telnyx will not send a T.38 re-INVITE; this option only controls whether one will be accepted.
   * @return t38FaxGatewayEnabled
  **/
  @Schema(description = "Controls whether Telnyx will accept a T.38 re-INVITE for this phone number. Note that Telnyx will not send a T.38 re-INVITE; this option only controls whether one will be accepted.")
  public Boolean isT38FaxGatewayEnabled() {
    return t38FaxGatewayEnabled;
  }

  public void setT38FaxGatewayEnabled(Boolean t38FaxGatewayEnabled) {
    this.t38FaxGatewayEnabled = t38FaxGatewayEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaFeatures mediaFeatures = (MediaFeatures) o;
    return Objects.equals(this.rtpAutoAdjustEnabled, mediaFeatures.rtpAutoAdjustEnabled) &&
        Objects.equals(this.mediaHandlingMode, mediaFeatures.mediaHandlingMode) &&
        Objects.equals(this.acceptAnyRtpPacketsEnabled, mediaFeatures.acceptAnyRtpPacketsEnabled) &&
        Objects.equals(this.t38FaxGatewayEnabled, mediaFeatures.t38FaxGatewayEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rtpAutoAdjustEnabled, mediaHandlingMode, acceptAnyRtpPacketsEnabled, t38FaxGatewayEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaFeatures {\n");
    
    sb.append("    rtpAutoAdjustEnabled: ").append(toIndentedString(rtpAutoAdjustEnabled)).append("\n");
    sb.append("    mediaHandlingMode: ").append(toIndentedString(mediaHandlingMode)).append("\n");
    sb.append("    acceptAnyRtpPacketsEnabled: ").append(toIndentedString(acceptAnyRtpPacketsEnabled)).append("\n");
    sb.append("    t38FaxGatewayEnabled: ").append(toIndentedString(t38FaxGatewayEnabled)).append("\n");
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
