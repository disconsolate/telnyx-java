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
 * Recording URLs in requested format. The URL is valid for as long as the file exists. For security purposes, this feature is activated on a per request basis.  Please contact customer support with your Account ID to request activation.
 */
@Schema(description = "Recording URLs in requested format. The URL is valid for as long as the file exists. For security purposes, this feature is activated on a per request basis.  Please contact customer support with your Account ID to request activation.")

public class CallRecordingSavedPayloadPublicRecordingUrls {
  @SerializedName("mp3")
  private String mp3 = null;

  @SerializedName("wav")
  private String wav = null;

  public CallRecordingSavedPayloadPublicRecordingUrls mp3(String mp3) {
    this.mp3 = mp3;
    return this;
  }

   /**
   * Recording URL in requested &#x60;mp3&#x60; format.
   * @return mp3
  **/
  @Schema(example = "http://example.com/recording.mp3", description = "Recording URL in requested `mp3` format.")
  public String getMp3() {
    return mp3;
  }

  public void setMp3(String mp3) {
    this.mp3 = mp3;
  }

  public CallRecordingSavedPayloadPublicRecordingUrls wav(String wav) {
    this.wav = wav;
    return this;
  }

   /**
   * Recording URL in requested &#x60;wav&#x60; format.
   * @return wav
  **/
  @Schema(example = "http://example.com/recording.wav", description = "Recording URL in requested `wav` format.")
  public String getWav() {
    return wav;
  }

  public void setWav(String wav) {
    this.wav = wav;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallRecordingSavedPayloadPublicRecordingUrls callRecordingSavedPayloadPublicRecordingUrls = (CallRecordingSavedPayloadPublicRecordingUrls) o;
    return Objects.equals(this.mp3, callRecordingSavedPayloadPublicRecordingUrls.mp3) &&
        Objects.equals(this.wav, callRecordingSavedPayloadPublicRecordingUrls.wav);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mp3, wav);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallRecordingSavedPayloadPublicRecordingUrls {\n");
    
    sb.append("    mp3: ").append(toIndentedString(mp3)).append("\n");
    sb.append("    wav: ").append(toIndentedString(wav)).append("\n");
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