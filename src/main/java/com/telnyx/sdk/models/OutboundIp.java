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
 * OutboundIp
 */


public class OutboundIp {
  @SerializedName("call_parking_enabled")
  private Boolean callParkingEnabled = false;

  @SerializedName("ani_override")
  private String aniOverride = "";

  /**
   * Specifies when we apply your ani_override setting. Only applies when ani_override is not blank.
   */
  @JsonAdapter(AniOverrideTypeEnum.Adapter.class)
  public enum AniOverrideTypeEnum {
    ALWAYS("always"),
    NORMAL("normal"),
    EMERGENCY("emergency");

    private String value;

    AniOverrideTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AniOverrideTypeEnum fromValue(String text) {
      for (AniOverrideTypeEnum b : AniOverrideTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AniOverrideTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AniOverrideTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AniOverrideTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AniOverrideTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("ani_override_type")
  private AniOverrideTypeEnum aniOverrideType = AniOverrideTypeEnum.ALWAYS;

  @SerializedName("channel_limit")
  private Integer channelLimit = null;

  @SerializedName("instant_ringback_enabled")
  private Boolean instantRingbackEnabled = true;

  @SerializedName("generate_ringback_tone")
  private Boolean generateRingbackTone = false;

  @SerializedName("localization")
  private String localization = "null";

  /**
   * This setting only affects connections with Fax-type Outbound Voice Profiles. The setting dictates whether or not Telnyx sends a t.38 reinvite.&lt;br/&gt;&lt;br/&gt; By default, Telnyx will send the re-invite. If set to &#x60;customer&#x60;, the caller is expected to send the t.38 reinvite.
   */
  @JsonAdapter(T38ReinviteSourceEnum.Adapter.class)
  public enum T38ReinviteSourceEnum {
    TELNYX("telnyx"),
    CUSTOMER("customer"),
    DISABLED("disabled"),
    PASSTHRU("passthru"),
    CALLER_PASSTHRU("caller-passthru"),
    CALLEE_PASSTHRU("callee-passthru");

    private String value;

    T38ReinviteSourceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static T38ReinviteSourceEnum fromValue(String text) {
      for (T38ReinviteSourceEnum b : T38ReinviteSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<T38ReinviteSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final T38ReinviteSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public T38ReinviteSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return T38ReinviteSourceEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("t38_reinvite_source")
  private T38ReinviteSourceEnum t38ReinviteSource = T38ReinviteSourceEnum.TELNYX;

  @SerializedName("tech_prefix")
  private String techPrefix = "";

  /**
   * Gets or Sets ipAuthenticationMethod
   */
  @JsonAdapter(IpAuthenticationMethodEnum.Adapter.class)
  public enum IpAuthenticationMethodEnum {
    TECH_PREFIXP_CHARGE_INFO("tech-prefixp-charge-info"),
    TOKEN("token");

    private String value;

    IpAuthenticationMethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IpAuthenticationMethodEnum fromValue(String text) {
      for (IpAuthenticationMethodEnum b : IpAuthenticationMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IpAuthenticationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IpAuthenticationMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IpAuthenticationMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IpAuthenticationMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("ip_authentication_method")
  private IpAuthenticationMethodEnum ipAuthenticationMethod = tech-prefix;

  @SerializedName("ip_authentication_token")
  private String ipAuthenticationToken = "null";

  @SerializedName("outbound_voice_profile_id")
  private String outboundVoiceProfileId = null;

  public OutboundIp callParkingEnabled(Boolean callParkingEnabled) {
    this.callParkingEnabled = callParkingEnabled;
    return this;
  }

   /**
   * Forces all SIP calls originated on this connection to be \&quot;parked\&quot; instead of \&quot;bridged\&quot; to the destination specified on the URI. Parked calls will return ringback to the caller and will await for a Call Control command to define which action will be taken next.
   * @return callParkingEnabled
  **/
  @Schema(description = "Forces all SIP calls originated on this connection to be \"parked\" instead of \"bridged\" to the destination specified on the URI. Parked calls will return ringback to the caller and will await for a Call Control command to define which action will be taken next.")
  public Boolean isCallParkingEnabled() {
    return callParkingEnabled;
  }

  public void setCallParkingEnabled(Boolean callParkingEnabled) {
    this.callParkingEnabled = callParkingEnabled;
  }

  public OutboundIp aniOverride(String aniOverride) {
    this.aniOverride = aniOverride;
    return this;
  }

   /**
   * Set a phone number as the ani_override value to override caller id number on outbound calls.
   * @return aniOverride
  **/
  @Schema(description = "Set a phone number as the ani_override value to override caller id number on outbound calls.")
  public String getAniOverride() {
    return aniOverride;
  }

  public void setAniOverride(String aniOverride) {
    this.aniOverride = aniOverride;
  }

  public OutboundIp aniOverrideType(AniOverrideTypeEnum aniOverrideType) {
    this.aniOverrideType = aniOverrideType;
    return this;
  }

   /**
   * Specifies when we apply your ani_override setting. Only applies when ani_override is not blank.
   * @return aniOverrideType
  **/
  @Schema(description = "Specifies when we apply your ani_override setting. Only applies when ani_override is not blank.")
  public AniOverrideTypeEnum getAniOverrideType() {
    return aniOverrideType;
  }

  public void setAniOverrideType(AniOverrideTypeEnum aniOverrideType) {
    this.aniOverrideType = aniOverrideType;
  }

  public OutboundIp channelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
    return this;
  }

   /**
   * When set, this will limit the total number of outbound calls to phone numbers associated with this connection.
   * @return channelLimit
  **/
  @Schema(description = "When set, this will limit the total number of outbound calls to phone numbers associated with this connection.")
  public Integer getChannelLimit() {
    return channelLimit;
  }

  public void setChannelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
  }

  public OutboundIp instantRingbackEnabled(Boolean instantRingbackEnabled) {
    this.instantRingbackEnabled = instantRingbackEnabled;
    return this;
  }

   /**
   * When set, ringback will not wait for indication before sending ringback tone to calling party.
   * @return instantRingbackEnabled
  **/
  @Schema(description = "When set, ringback will not wait for indication before sending ringback tone to calling party.")
  public Boolean isInstantRingbackEnabled() {
    return instantRingbackEnabled;
  }

  public void setInstantRingbackEnabled(Boolean instantRingbackEnabled) {
    this.instantRingbackEnabled = instantRingbackEnabled;
  }

  public OutboundIp generateRingbackTone(Boolean generateRingbackTone) {
    this.generateRingbackTone = generateRingbackTone;
    return this;
  }

   /**
   * Generate ringback tone through 183 session progress message with early media.
   * @return generateRingbackTone
  **/
  @Schema(description = "Generate ringback tone through 183 session progress message with early media.")
  public Boolean isGenerateRingbackTone() {
    return generateRingbackTone;
  }

  public void setGenerateRingbackTone(Boolean generateRingbackTone) {
    this.generateRingbackTone = generateRingbackTone;
  }

  public OutboundIp localization(String localization) {
    this.localization = localization;
    return this;
  }

   /**
   * A 2-character country code specifying the country whose national dialing rules should be used. For example, if set to &#x60;US&#x60; then any US number can be dialed without preprending +1 to the number. When left blank, Telnyx will try US and GB dialing rules, in that order, by default.
   * @return localization
  **/
  @Schema(description = "A 2-character country code specifying the country whose national dialing rules should be used. For example, if set to `US` then any US number can be dialed without preprending +1 to the number. When left blank, Telnyx will try US and GB dialing rules, in that order, by default.")
  public String getLocalization() {
    return localization;
  }

  public void setLocalization(String localization) {
    this.localization = localization;
  }

  public OutboundIp t38ReinviteSource(T38ReinviteSourceEnum t38ReinviteSource) {
    this.t38ReinviteSource = t38ReinviteSource;
    return this;
  }

   /**
   * This setting only affects connections with Fax-type Outbound Voice Profiles. The setting dictates whether or not Telnyx sends a t.38 reinvite.&lt;br/&gt;&lt;br/&gt; By default, Telnyx will send the re-invite. If set to &#x60;customer&#x60;, the caller is expected to send the t.38 reinvite.
   * @return t38ReinviteSource
  **/
  @Schema(description = "This setting only affects connections with Fax-type Outbound Voice Profiles. The setting dictates whether or not Telnyx sends a t.38 reinvite.<br/><br/> By default, Telnyx will send the re-invite. If set to `customer`, the caller is expected to send the t.38 reinvite.")
  public T38ReinviteSourceEnum getT38ReinviteSource() {
    return t38ReinviteSource;
  }

  public void setT38ReinviteSource(T38ReinviteSourceEnum t38ReinviteSource) {
    this.t38ReinviteSource = t38ReinviteSource;
  }

  public OutboundIp techPrefix(String techPrefix) {
    this.techPrefix = techPrefix;
    return this;
  }

   /**
   * Numerical chars only, exactly 4 characters.
   * @return techPrefix
  **/
  @Schema(description = "Numerical chars only, exactly 4 characters.")
  public String getTechPrefix() {
    return techPrefix;
  }

  public void setTechPrefix(String techPrefix) {
    this.techPrefix = techPrefix;
  }

  public OutboundIp ipAuthenticationMethod(IpAuthenticationMethodEnum ipAuthenticationMethod) {
    this.ipAuthenticationMethod = ipAuthenticationMethod;
    return this;
  }

   /**
   * Get ipAuthenticationMethod
   * @return ipAuthenticationMethod
  **/
  @Schema(example = "tech-prefix", description = "")
  public IpAuthenticationMethodEnum getIpAuthenticationMethod() {
    return ipAuthenticationMethod;
  }

  public void setIpAuthenticationMethod(IpAuthenticationMethodEnum ipAuthenticationMethod) {
    this.ipAuthenticationMethod = ipAuthenticationMethod;
  }

  public OutboundIp ipAuthenticationToken(String ipAuthenticationToken) {
    this.ipAuthenticationToken = ipAuthenticationToken;
    return this;
  }

   /**
   * Get ipAuthenticationToken
   * @return ipAuthenticationToken
  **/
  @Schema(description = "")
  public String getIpAuthenticationToken() {
    return ipAuthenticationToken;
  }

  public void setIpAuthenticationToken(String ipAuthenticationToken) {
    this.ipAuthenticationToken = ipAuthenticationToken;
  }

  public OutboundIp outboundVoiceProfileId(String outboundVoiceProfileId) {
    this.outboundVoiceProfileId = outboundVoiceProfileId;
    return this;
  }

   /**
   * Get outboundVoiceProfileId
   * @return outboundVoiceProfileId
  **/
  @Schema(description = "")
  public String getOutboundVoiceProfileId() {
    return outboundVoiceProfileId;
  }

  public void setOutboundVoiceProfileId(String outboundVoiceProfileId) {
    this.outboundVoiceProfileId = outboundVoiceProfileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundIp outboundIp = (OutboundIp) o;
    return Objects.equals(this.callParkingEnabled, outboundIp.callParkingEnabled) &&
        Objects.equals(this.aniOverride, outboundIp.aniOverride) &&
        Objects.equals(this.aniOverrideType, outboundIp.aniOverrideType) &&
        Objects.equals(this.channelLimit, outboundIp.channelLimit) &&
        Objects.equals(this.instantRingbackEnabled, outboundIp.instantRingbackEnabled) &&
        Objects.equals(this.generateRingbackTone, outboundIp.generateRingbackTone) &&
        Objects.equals(this.localization, outboundIp.localization) &&
        Objects.equals(this.t38ReinviteSource, outboundIp.t38ReinviteSource) &&
        Objects.equals(this.techPrefix, outboundIp.techPrefix) &&
        Objects.equals(this.ipAuthenticationMethod, outboundIp.ipAuthenticationMethod) &&
        Objects.equals(this.ipAuthenticationToken, outboundIp.ipAuthenticationToken) &&
        Objects.equals(this.outboundVoiceProfileId, outboundIp.outboundVoiceProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callParkingEnabled, aniOverride, aniOverrideType, channelLimit, instantRingbackEnabled, generateRingbackTone, localization, t38ReinviteSource, techPrefix, ipAuthenticationMethod, ipAuthenticationToken, outboundVoiceProfileId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundIp {\n");
    
    sb.append("    callParkingEnabled: ").append(toIndentedString(callParkingEnabled)).append("\n");
    sb.append("    aniOverride: ").append(toIndentedString(aniOverride)).append("\n");
    sb.append("    aniOverrideType: ").append(toIndentedString(aniOverrideType)).append("\n");
    sb.append("    channelLimit: ").append(toIndentedString(channelLimit)).append("\n");
    sb.append("    instantRingbackEnabled: ").append(toIndentedString(instantRingbackEnabled)).append("\n");
    sb.append("    generateRingbackTone: ").append(toIndentedString(generateRingbackTone)).append("\n");
    sb.append("    localization: ").append(toIndentedString(localization)).append("\n");
    sb.append("    t38ReinviteSource: ").append(toIndentedString(t38ReinviteSource)).append("\n");
    sb.append("    techPrefix: ").append(toIndentedString(techPrefix)).append("\n");
    sb.append("    ipAuthenticationMethod: ").append(toIndentedString(ipAuthenticationMethod)).append("\n");
    sb.append("    ipAuthenticationToken: ").append(toIndentedString(ipAuthenticationToken)).append("\n");
    sb.append("    outboundVoiceProfileId: ").append(toIndentedString(outboundVoiceProfileId)).append("\n");
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
