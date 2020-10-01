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
import java.util.ArrayList;
import java.util.List;
/**
 * InboundFqdn
 */


public class InboundFqdn {
  /**
   * This setting allows you to set the format with which the caller&#x27;s number (ANI) is sent for inbound phone calls.
   */
  @JsonAdapter(AniNumberFormatEnum.Adapter.class)
  public enum AniNumberFormatEnum {
    _E_164("+E.164"),
    E_164("E.164"),
    _E_164_NATIONAL("+E.164-national"),
    E_164_NATIONAL("E.164-national");

    private String value;

    AniNumberFormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AniNumberFormatEnum fromValue(String text) {
      for (AniNumberFormatEnum b : AniNumberFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AniNumberFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AniNumberFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AniNumberFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AniNumberFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("ani_number_format")
  private AniNumberFormatEnum aniNumberFormat = AniNumberFormatEnum.E_164_NATIONAL;

  /**
   * Gets or Sets dnisNumberFormat
   */
  @JsonAdapter(DnisNumberFormatEnum.Adapter.class)
  public enum DnisNumberFormatEnum {
    _E164("+e164"),
    E164("e164"),
    NATIONAL("national");

    private String value;

    DnisNumberFormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DnisNumberFormatEnum fromValue(String text) {
      for (DnisNumberFormatEnum b : DnisNumberFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DnisNumberFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DnisNumberFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DnisNumberFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DnisNumberFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("dnis_number_format")
  private DnisNumberFormatEnum dnisNumberFormat = DnisNumberFormatEnum.E164;

  @SerializedName("codecs")
  private List<String> codecs = null;

  /**
   * Default routing method to be used when a number is associated with the connection. Must be one of the routing method types or left blank, other values are not allowed.
   */
  @JsonAdapter(DefaultRoutingMethodEnum.Adapter.class)
  public enum DefaultRoutingMethodEnum {
    SEQUENTIAL("sequential"),
    ROUND_ROBIN("round-robin");

    private String value;

    DefaultRoutingMethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DefaultRoutingMethodEnum fromValue(String text) {
      for (DefaultRoutingMethodEnum b : DefaultRoutingMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DefaultRoutingMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultRoutingMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultRoutingMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DefaultRoutingMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("default_routing_method")
  private DefaultRoutingMethodEnum defaultRoutingMethod = null;

  @SerializedName("channel_limit")
  private Integer channelLimit = null;

  @SerializedName("generate_ringback_tone")
  private Boolean generateRingbackTone = false;

  @SerializedName("isup_headers_enabled")
  private Boolean isupHeadersEnabled = false;

  @SerializedName("prack_enabled")
  private Boolean prackEnabled = false;

  @SerializedName("privacy_zone_enabled")
  private Boolean privacyZoneEnabled = false;

  @SerializedName("sip_compact_headers_enabled")
  private Boolean sipCompactHeadersEnabled = true;

  /**
   * Selects which &#x60;sip_region&#x60; to receive inbound calls from. If null, the default region (US) will be used.
   */
  @JsonAdapter(SipRegionEnum.Adapter.class)
  public enum SipRegionEnum {
    US("US"),
    EUROPE("Europe"),
    AUSTRALIA("Australia");

    private String value;

    SipRegionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SipRegionEnum fromValue(String text) {
      for (SipRegionEnum b : SipRegionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SipRegionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SipRegionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SipRegionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SipRegionEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("sip_region")
  private SipRegionEnum sipRegion = SipRegionEnum.US;

  @SerializedName("sip_subdomain")
  private String sipSubdomain = null;

  /**
   * This option can be enabled to receive calls from: \&quot;Anyone\&quot; (any SIP endpoint in the public Internet) or \&quot;Only my connections\&quot; (any connection assigned to the same Telnyx user).
   */
  @JsonAdapter(SipSubdomainReceiveSettingsEnum.Adapter.class)
  public enum SipSubdomainReceiveSettingsEnum {
    ONLY_MY_CONNECTIONS("only_my_connections"),
    FROM_ANYONE("from_anyone");

    private String value;

    SipSubdomainReceiveSettingsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SipSubdomainReceiveSettingsEnum fromValue(String text) {
      for (SipSubdomainReceiveSettingsEnum b : SipSubdomainReceiveSettingsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SipSubdomainReceiveSettingsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SipSubdomainReceiveSettingsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SipSubdomainReceiveSettingsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SipSubdomainReceiveSettingsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("sip_subdomain_receive_settings")
  private SipSubdomainReceiveSettingsEnum sipSubdomainReceiveSettings = null;

  @SerializedName("timeout_1xx_secs")
  private Integer timeout1xxSecs = 3;

  @SerializedName("timeout_2xx_secs")
  private Integer timeout2xxSecs = 90;

  public InboundFqdn aniNumberFormat(AniNumberFormatEnum aniNumberFormat) {
    this.aniNumberFormat = aniNumberFormat;
    return this;
  }

   /**
   * This setting allows you to set the format with which the caller&#x27;s number (ANI) is sent for inbound phone calls.
   * @return aniNumberFormat
  **/
  @Schema(description = "This setting allows you to set the format with which the caller's number (ANI) is sent for inbound phone calls.")
  public AniNumberFormatEnum getAniNumberFormat() {
    return aniNumberFormat;
  }

  public void setAniNumberFormat(AniNumberFormatEnum aniNumberFormat) {
    this.aniNumberFormat = aniNumberFormat;
  }

  public InboundFqdn dnisNumberFormat(DnisNumberFormatEnum dnisNumberFormat) {
    this.dnisNumberFormat = dnisNumberFormat;
    return this;
  }

   /**
   * Get dnisNumberFormat
   * @return dnisNumberFormat
  **/
  @Schema(description = "")
  public DnisNumberFormatEnum getDnisNumberFormat() {
    return dnisNumberFormat;
  }

  public void setDnisNumberFormat(DnisNumberFormatEnum dnisNumberFormat) {
    this.dnisNumberFormat = dnisNumberFormat;
  }

  public InboundFqdn codecs(List<String> codecs) {
    this.codecs = codecs;
    return this;
  }

  public InboundFqdn addCodecsItem(String codecsItem) {
    if (this.codecs == null) {
      this.codecs = new ArrayList<>();
    }
    this.codecs.add(codecsItem);
    return this;
  }

   /**
   * Defines the list of codecs that Telnyx will send for inbound calls to a specific number on your portal account, in priority order. OPUS and H.264 codecs are available only when using TCP or TLS transport for SIP.
   * @return codecs
  **/
  @Schema(description = "Defines the list of codecs that Telnyx will send for inbound calls to a specific number on your portal account, in priority order. OPUS and H.264 codecs are available only when using TCP or TLS transport for SIP.")
  public List<String> getCodecs() {
    return codecs;
  }

  public void setCodecs(List<String> codecs) {
    this.codecs = codecs;
  }

  public InboundFqdn defaultRoutingMethod(DefaultRoutingMethodEnum defaultRoutingMethod) {
    this.defaultRoutingMethod = defaultRoutingMethod;
    return this;
  }

   /**
   * Default routing method to be used when a number is associated with the connection. Must be one of the routing method types or left blank, other values are not allowed.
   * @return defaultRoutingMethod
  **/
  @Schema(description = "Default routing method to be used when a number is associated with the connection. Must be one of the routing method types or left blank, other values are not allowed.")
  public DefaultRoutingMethodEnum getDefaultRoutingMethod() {
    return defaultRoutingMethod;
  }

  public void setDefaultRoutingMethod(DefaultRoutingMethodEnum defaultRoutingMethod) {
    this.defaultRoutingMethod = defaultRoutingMethod;
  }

  public InboundFqdn channelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
    return this;
  }

   /**
   * When set, this will limit the total number of inbound calls to phone numbers associated with this connection.
   * @return channelLimit
  **/
  @Schema(description = "When set, this will limit the total number of inbound calls to phone numbers associated with this connection.")
  public Integer getChannelLimit() {
    return channelLimit;
  }

  public void setChannelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
  }

  public InboundFqdn generateRingbackTone(Boolean generateRingbackTone) {
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

  public InboundFqdn isupHeadersEnabled(Boolean isupHeadersEnabled) {
    this.isupHeadersEnabled = isupHeadersEnabled;
    return this;
  }

   /**
   * When set, inbound phone calls will receive ISUP parameters via SIP headers. (Only when available and only when using TCP or TLS transport.)
   * @return isupHeadersEnabled
  **/
  @Schema(description = "When set, inbound phone calls will receive ISUP parameters via SIP headers. (Only when available and only when using TCP or TLS transport.)")
  public Boolean isIsupHeadersEnabled() {
    return isupHeadersEnabled;
  }

  public void setIsupHeadersEnabled(Boolean isupHeadersEnabled) {
    this.isupHeadersEnabled = isupHeadersEnabled;
  }

  public InboundFqdn prackEnabled(Boolean prackEnabled) {
    this.prackEnabled = prackEnabled;
    return this;
  }

   /**
   * Enable PRACK messages as defined in RFC3262.
   * @return prackEnabled
  **/
  @Schema(description = "Enable PRACK messages as defined in RFC3262.")
  public Boolean isPrackEnabled() {
    return prackEnabled;
  }

  public void setPrackEnabled(Boolean prackEnabled) {
    this.prackEnabled = prackEnabled;
  }

  public InboundFqdn privacyZoneEnabled(Boolean privacyZoneEnabled) {
    this.privacyZoneEnabled = privacyZoneEnabled;
    return this;
  }

   /**
   * By default, Telnyx does not send caller-id information when the caller has chosen to hide this information. When this option is enabled, Telnyx will send the SIP header Privacy:id plus the caller-id information so that the receiver side can choose when to hide it.
   * @return privacyZoneEnabled
  **/
  @Schema(description = "By default, Telnyx does not send caller-id information when the caller has chosen to hide this information. When this option is enabled, Telnyx will send the SIP header Privacy:id plus the caller-id information so that the receiver side can choose when to hide it.")
  public Boolean isPrivacyZoneEnabled() {
    return privacyZoneEnabled;
  }

  public void setPrivacyZoneEnabled(Boolean privacyZoneEnabled) {
    this.privacyZoneEnabled = privacyZoneEnabled;
  }

  public InboundFqdn sipCompactHeadersEnabled(Boolean sipCompactHeadersEnabled) {
    this.sipCompactHeadersEnabled = sipCompactHeadersEnabled;
    return this;
  }

   /**
   * Defaults to true.
   * @return sipCompactHeadersEnabled
  **/
  @Schema(description = "Defaults to true.")
  public Boolean isSipCompactHeadersEnabled() {
    return sipCompactHeadersEnabled;
  }

  public void setSipCompactHeadersEnabled(Boolean sipCompactHeadersEnabled) {
    this.sipCompactHeadersEnabled = sipCompactHeadersEnabled;
  }

  public InboundFqdn sipRegion(SipRegionEnum sipRegion) {
    this.sipRegion = sipRegion;
    return this;
  }

   /**
   * Selects which &#x60;sip_region&#x60; to receive inbound calls from. If null, the default region (US) will be used.
   * @return sipRegion
  **/
  @Schema(description = "Selects which `sip_region` to receive inbound calls from. If null, the default region (US) will be used.")
  public SipRegionEnum getSipRegion() {
    return sipRegion;
  }

  public void setSipRegion(SipRegionEnum sipRegion) {
    this.sipRegion = sipRegion;
  }

  public InboundFqdn sipSubdomain(String sipSubdomain) {
    this.sipSubdomain = sipSubdomain;
    return this;
  }

   /**
   * Specifies a subdomain that can be used to receive Inbound calls to a Connection, in the same way a phone number is used, from a SIP endpoint. Example: the subdomain \&quot;example.sip.telnyx.com\&quot; can be called from any SIP endpoint by using the SIP URI \&quot;sip:@example.sip.telnyx.com\&quot; where the user part can be any alphanumeric value. Please note TLS encrypted calls are not allowed for subdomain calls.
   * @return sipSubdomain
  **/
  @Schema(description = "Specifies a subdomain that can be used to receive Inbound calls to a Connection, in the same way a phone number is used, from a SIP endpoint. Example: the subdomain \"example.sip.telnyx.com\" can be called from any SIP endpoint by using the SIP URI \"sip:@example.sip.telnyx.com\" where the user part can be any alphanumeric value. Please note TLS encrypted calls are not allowed for subdomain calls.")
  public String getSipSubdomain() {
    return sipSubdomain;
  }

  public void setSipSubdomain(String sipSubdomain) {
    this.sipSubdomain = sipSubdomain;
  }

  public InboundFqdn sipSubdomainReceiveSettings(SipSubdomainReceiveSettingsEnum sipSubdomainReceiveSettings) {
    this.sipSubdomainReceiveSettings = sipSubdomainReceiveSettings;
    return this;
  }

   /**
   * This option can be enabled to receive calls from: \&quot;Anyone\&quot; (any SIP endpoint in the public Internet) or \&quot;Only my connections\&quot; (any connection assigned to the same Telnyx user).
   * @return sipSubdomainReceiveSettings
  **/
  @Schema(description = "This option can be enabled to receive calls from: \"Anyone\" (any SIP endpoint in the public Internet) or \"Only my connections\" (any connection assigned to the same Telnyx user).")
  public SipSubdomainReceiveSettingsEnum getSipSubdomainReceiveSettings() {
    return sipSubdomainReceiveSettings;
  }

  public void setSipSubdomainReceiveSettings(SipSubdomainReceiveSettingsEnum sipSubdomainReceiveSettings) {
    this.sipSubdomainReceiveSettings = sipSubdomainReceiveSettings;
  }

  public InboundFqdn timeout1xxSecs(Integer timeout1xxSecs) {
    this.timeout1xxSecs = timeout1xxSecs;
    return this;
  }

   /**
   * Time(sec) before aborting if connection is not made (min: 1, max: 20).
   * @return timeout1xxSecs
  **/
  @Schema(description = "Time(sec) before aborting if connection is not made (min: 1, max: 20).")
  public Integer getTimeout1xxSecs() {
    return timeout1xxSecs;
  }

  public void setTimeout1xxSecs(Integer timeout1xxSecs) {
    this.timeout1xxSecs = timeout1xxSecs;
  }

  public InboundFqdn timeout2xxSecs(Integer timeout2xxSecs) {
    this.timeout2xxSecs = timeout2xxSecs;
    return this;
  }

   /**
   * Time(sec) before aborting if call is unanswered (min: 1, max: 600).
   * @return timeout2xxSecs
  **/
  @Schema(description = "Time(sec) before aborting if call is unanswered (min: 1, max: 600).")
  public Integer getTimeout2xxSecs() {
    return timeout2xxSecs;
  }

  public void setTimeout2xxSecs(Integer timeout2xxSecs) {
    this.timeout2xxSecs = timeout2xxSecs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundFqdn inboundFqdn = (InboundFqdn) o;
    return Objects.equals(this.aniNumberFormat, inboundFqdn.aniNumberFormat) &&
        Objects.equals(this.dnisNumberFormat, inboundFqdn.dnisNumberFormat) &&
        Objects.equals(this.codecs, inboundFqdn.codecs) &&
        Objects.equals(this.defaultRoutingMethod, inboundFqdn.defaultRoutingMethod) &&
        Objects.equals(this.channelLimit, inboundFqdn.channelLimit) &&
        Objects.equals(this.generateRingbackTone, inboundFqdn.generateRingbackTone) &&
        Objects.equals(this.isupHeadersEnabled, inboundFqdn.isupHeadersEnabled) &&
        Objects.equals(this.prackEnabled, inboundFqdn.prackEnabled) &&
        Objects.equals(this.privacyZoneEnabled, inboundFqdn.privacyZoneEnabled) &&
        Objects.equals(this.sipCompactHeadersEnabled, inboundFqdn.sipCompactHeadersEnabled) &&
        Objects.equals(this.sipRegion, inboundFqdn.sipRegion) &&
        Objects.equals(this.sipSubdomain, inboundFqdn.sipSubdomain) &&
        Objects.equals(this.sipSubdomainReceiveSettings, inboundFqdn.sipSubdomainReceiveSettings) &&
        Objects.equals(this.timeout1xxSecs, inboundFqdn.timeout1xxSecs) &&
        Objects.equals(this.timeout2xxSecs, inboundFqdn.timeout2xxSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aniNumberFormat, dnisNumberFormat, codecs, defaultRoutingMethod, channelLimit, generateRingbackTone, isupHeadersEnabled, prackEnabled, privacyZoneEnabled, sipCompactHeadersEnabled, sipRegion, sipSubdomain, sipSubdomainReceiveSettings, timeout1xxSecs, timeout2xxSecs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundFqdn {\n");
    
    sb.append("    aniNumberFormat: ").append(toIndentedString(aniNumberFormat)).append("\n");
    sb.append("    dnisNumberFormat: ").append(toIndentedString(dnisNumberFormat)).append("\n");
    sb.append("    codecs: ").append(toIndentedString(codecs)).append("\n");
    sb.append("    defaultRoutingMethod: ").append(toIndentedString(defaultRoutingMethod)).append("\n");
    sb.append("    channelLimit: ").append(toIndentedString(channelLimit)).append("\n");
    sb.append("    generateRingbackTone: ").append(toIndentedString(generateRingbackTone)).append("\n");
    sb.append("    isupHeadersEnabled: ").append(toIndentedString(isupHeadersEnabled)).append("\n");
    sb.append("    prackEnabled: ").append(toIndentedString(prackEnabled)).append("\n");
    sb.append("    privacyZoneEnabled: ").append(toIndentedString(privacyZoneEnabled)).append("\n");
    sb.append("    sipCompactHeadersEnabled: ").append(toIndentedString(sipCompactHeadersEnabled)).append("\n");
    sb.append("    sipRegion: ").append(toIndentedString(sipRegion)).append("\n");
    sb.append("    sipSubdomain: ").append(toIndentedString(sipSubdomain)).append("\n");
    sb.append("    sipSubdomainReceiveSettings: ").append(toIndentedString(sipSubdomainReceiveSettings)).append("\n");
    sb.append("    timeout1xxSecs: ").append(toIndentedString(timeout1xxSecs)).append("\n");
    sb.append("    timeout2xxSecs: ").append(toIndentedString(timeout2xxSecs)).append("\n");
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
