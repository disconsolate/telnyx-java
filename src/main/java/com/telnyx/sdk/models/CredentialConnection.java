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
import com.telnyx.sdk.models.CredentialConnectionRtcpSettings;
import com.telnyx.sdk.models.CredentialInbound;
import com.telnyx.sdk.models.CredentialOutbound;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CredentialConnection
 */


public class CredentialConnection {
  @SerializedName("id")
  private String id = null;

  @SerializedName("record_type")
  private String recordType = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  /**
   * &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#x27;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.
   */
  @JsonAdapter(AnchorsiteOverrideEnum.Adapter.class)
  public enum AnchorsiteOverrideEnum {
    LATENCY("Latency"),
    CHICAGO_IL("Chicago, IL"),
    ASHBURN_VA("Ashburn, VA"),
    SAN_JOSE_CA("San Jose, CA"),
    SYDNEY_AUSTRALIA("Sydney, Australia"),
    AMSTERDAM_NETHERLANDS("Amsterdam, Netherlands"),
    LONDON_UK("London, UK"),
    TORONTO_CANADA("Toronto, Canada"),
    VANCOUVER_CANADA("Vancouver, Canada"),
    FRANKFURT_GERMANY("Frankfurt, Germany");

    private String value;

    AnchorsiteOverrideEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AnchorsiteOverrideEnum fromValue(String text) {
      for (AnchorsiteOverrideEnum b : AnchorsiteOverrideEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AnchorsiteOverrideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnchorsiteOverrideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnchorsiteOverrideEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AnchorsiteOverrideEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("anchorsite_override")
  private AnchorsiteOverrideEnum anchorsiteOverride = null;

  @SerializedName("connection_name")
  private String connectionName = null;

  /**
   * This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for all (unrestricted) then anyone who calls the SIP URI &lt;your-username&gt;@telnyx.com will be connected to your Connection. You can also choose to allow only calls that are originated on any Connections under your account (internal).
   */
  @JsonAdapter(SipUriCallingPreferenceEnum.Adapter.class)
  public enum SipUriCallingPreferenceEnum {
    DISABLED("disabled"),
    UNRESTRICTED("unrestricted"),
    INTERNAL("internal");

    private String value;

    SipUriCallingPreferenceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SipUriCallingPreferenceEnum fromValue(String text) {
      for (SipUriCallingPreferenceEnum b : SipUriCallingPreferenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SipUriCallingPreferenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SipUriCallingPreferenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SipUriCallingPreferenceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SipUriCallingPreferenceEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("sip_uri_calling_preference")
  private SipUriCallingPreferenceEnum sipUriCallingPreference = SipUriCallingPreferenceEnum.DISABLED;

  @SerializedName("default_on_hold_comfort_noise_enabled")
  private Boolean defaultOnHoldComfortNoiseEnabled = false;

  /**
   * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.
   */
  @JsonAdapter(DtmfTypeEnum.Adapter.class)
  public enum DtmfTypeEnum {
    RFC_2833("RFC 2833"),
    INBAND("Inband"),
    SIP_INFO("SIP INFO");

    private String value;

    DtmfTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DtmfTypeEnum fromValue(String text) {
      for (DtmfTypeEnum b : DtmfTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DtmfTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DtmfTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DtmfTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DtmfTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("dtmf_type")
  private DtmfTypeEnum dtmfType = DtmfTypeEnum.RFC_2833;

  @SerializedName("encode_contact_header_enabled")
  private Boolean encodeContactHeaderEnabled = false;

  /**
   * Enable use of SRTP or ZRTP for encryption. Valid values are those listed or null. Cannot be set to non-null if the transport_portocol is TLS.
   */
  @JsonAdapter(EncryptedMediaEnum.Adapter.class)
  public enum EncryptedMediaEnum {
    SRTP("SRTP"),
    ZRTP("ZRTP");

    private String value;

    EncryptedMediaEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EncryptedMediaEnum fromValue(String text) {
      for (EncryptedMediaEnum b : EncryptedMediaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EncryptedMediaEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncryptedMediaEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncryptedMediaEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EncryptedMediaEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("encrypted_media")
  private EncryptedMediaEnum encryptedMedia = null;

  @SerializedName("onnet_t38_passthrough_enabled")
  private Boolean onnetT38PassthroughEnabled = false;

  @SerializedName("rtcp_settings")
  private CredentialConnectionRtcpSettings rtcpSettings = null;

  @SerializedName("inbound")
  private CredentialInbound inbound = null;

  @SerializedName("outbound")
  private CredentialOutbound outbound = null;

  public CredentialConnection id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @Schema(example = "1293384261075731499", description = "Identifies the type of resource.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CredentialConnection recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @Schema(example = "credential_connection", description = "Identifies the type of the resource.")
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public CredentialConnection active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Defaults to true
   * @return active
  **/
  @Schema(description = "Defaults to true")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CredentialConnection userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The user name to be used as part of the credentials. Must be 4-32 characters long and alphanumeric values only (no spaces or special characters).
   * @return userName
  **/
  @Schema(example = "myusername123", description = "The user name to be used as part of the credentials. Must be 4-32 characters long and alphanumeric values only (no spaces or special characters).")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public CredentialConnection password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password to be used as part of the credentials. Must be 8 to 128 characters long.
   * @return password
  **/
  @Schema(example = "my123secure456password789", description = "The password to be used as part of the credentials. Must be 8 to 128 characters long.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CredentialConnection createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO-8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @Schema(example = "2018-02-02T22:25:27.521Z", description = "ISO-8601 formatted date indicating when the resource was created.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CredentialConnection updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO-8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @Schema(example = "2018-02-02T22:25:27.521Z", description = "ISO-8601 formatted date indicating when the resource was updated.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CredentialConnection anchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
    return this;
  }

   /**
   * &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#x27;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.
   * @return anchorsiteOverride
  **/
  @Schema(description = "`Latency` directs Telnyx to route media through the site with the lowest round-trip time to the user's connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.")
  public AnchorsiteOverrideEnum getAnchorsiteOverride() {
    return anchorsiteOverride;
  }

  public void setAnchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
  }

  public CredentialConnection connectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

   /**
   * Get connectionName
   * @return connectionName
  **/
  @Schema(description = "")
  public String getConnectionName() {
    return connectionName;
  }

  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }

  public CredentialConnection sipUriCallingPreference(SipUriCallingPreferenceEnum sipUriCallingPreference) {
    this.sipUriCallingPreference = sipUriCallingPreference;
    return this;
  }

   /**
   * This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for all (unrestricted) then anyone who calls the SIP URI &lt;your-username&gt;@telnyx.com will be connected to your Connection. You can also choose to allow only calls that are originated on any Connections under your account (internal).
   * @return sipUriCallingPreference
  **/
  @Schema(description = "This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for all (unrestricted) then anyone who calls the SIP URI <your-username>@telnyx.com will be connected to your Connection. You can also choose to allow only calls that are originated on any Connections under your account (internal).")
  public SipUriCallingPreferenceEnum getSipUriCallingPreference() {
    return sipUriCallingPreference;
  }

  public void setSipUriCallingPreference(SipUriCallingPreferenceEnum sipUriCallingPreference) {
    this.sipUriCallingPreference = sipUriCallingPreference;
  }

  public CredentialConnection defaultOnHoldComfortNoiseEnabled(Boolean defaultOnHoldComfortNoiseEnabled) {
    this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled;
    return this;
  }

   /**
   * When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.
   * @return defaultOnHoldComfortNoiseEnabled
  **/
  @Schema(description = "When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.")
  public Boolean isDefaultOnHoldComfortNoiseEnabled() {
    return defaultOnHoldComfortNoiseEnabled;
  }

  public void setDefaultOnHoldComfortNoiseEnabled(Boolean defaultOnHoldComfortNoiseEnabled) {
    this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled;
  }

  public CredentialConnection dtmfType(DtmfTypeEnum dtmfType) {
    this.dtmfType = dtmfType;
    return this;
  }

   /**
   * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.
   * @return dtmfType
  **/
  @Schema(description = "Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.")
  public DtmfTypeEnum getDtmfType() {
    return dtmfType;
  }

  public void setDtmfType(DtmfTypeEnum dtmfType) {
    this.dtmfType = dtmfType;
  }

  public CredentialConnection encodeContactHeaderEnabled(Boolean encodeContactHeaderEnabled) {
    this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
    return this;
  }

   /**
   * Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.
   * @return encodeContactHeaderEnabled
  **/
  @Schema(description = "Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.")
  public Boolean isEncodeContactHeaderEnabled() {
    return encodeContactHeaderEnabled;
  }

  public void setEncodeContactHeaderEnabled(Boolean encodeContactHeaderEnabled) {
    this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
  }

  public CredentialConnection encryptedMedia(EncryptedMediaEnum encryptedMedia) {
    this.encryptedMedia = encryptedMedia;
    return this;
  }

   /**
   * Enable use of SRTP or ZRTP for encryption. Valid values are those listed or null. Cannot be set to non-null if the transport_portocol is TLS.
   * @return encryptedMedia
  **/
  @Schema(description = "Enable use of SRTP or ZRTP for encryption. Valid values are those listed or null. Cannot be set to non-null if the transport_portocol is TLS.")
  public EncryptedMediaEnum getEncryptedMedia() {
    return encryptedMedia;
  }

  public void setEncryptedMedia(EncryptedMediaEnum encryptedMedia) {
    this.encryptedMedia = encryptedMedia;
  }

  public CredentialConnection onnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
    return this;
  }

   /**
   * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg&#x27;s settings.
   * @return onnetT38PassthroughEnabled
  **/
  @Schema(description = "Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg's settings.")
  public Boolean isOnnetT38PassthroughEnabled() {
    return onnetT38PassthroughEnabled;
  }

  public void setOnnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
  }

  public CredentialConnection rtcpSettings(CredentialConnectionRtcpSettings rtcpSettings) {
    this.rtcpSettings = rtcpSettings;
    return this;
  }

   /**
   * Get rtcpSettings
   * @return rtcpSettings
  **/
  @Schema(description = "")
  public CredentialConnectionRtcpSettings getRtcpSettings() {
    return rtcpSettings;
  }

  public void setRtcpSettings(CredentialConnectionRtcpSettings rtcpSettings) {
    this.rtcpSettings = rtcpSettings;
  }

  public CredentialConnection inbound(CredentialInbound inbound) {
    this.inbound = inbound;
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @Schema(description = "")
  public CredentialInbound getInbound() {
    return inbound;
  }

  public void setInbound(CredentialInbound inbound) {
    this.inbound = inbound;
  }

  public CredentialConnection outbound(CredentialOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @Schema(description = "")
  public CredentialOutbound getOutbound() {
    return outbound;
  }

  public void setOutbound(CredentialOutbound outbound) {
    this.outbound = outbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialConnection credentialConnection = (CredentialConnection) o;
    return Objects.equals(this.id, credentialConnection.id) &&
        Objects.equals(this.recordType, credentialConnection.recordType) &&
        Objects.equals(this.active, credentialConnection.active) &&
        Objects.equals(this.userName, credentialConnection.userName) &&
        Objects.equals(this.password, credentialConnection.password) &&
        Objects.equals(this.createdAt, credentialConnection.createdAt) &&
        Objects.equals(this.updatedAt, credentialConnection.updatedAt) &&
        Objects.equals(this.anchorsiteOverride, credentialConnection.anchorsiteOverride) &&
        Objects.equals(this.connectionName, credentialConnection.connectionName) &&
        Objects.equals(this.sipUriCallingPreference, credentialConnection.sipUriCallingPreference) &&
        Objects.equals(this.defaultOnHoldComfortNoiseEnabled, credentialConnection.defaultOnHoldComfortNoiseEnabled) &&
        Objects.equals(this.dtmfType, credentialConnection.dtmfType) &&
        Objects.equals(this.encodeContactHeaderEnabled, credentialConnection.encodeContactHeaderEnabled) &&
        Objects.equals(this.encryptedMedia, credentialConnection.encryptedMedia) &&
        Objects.equals(this.onnetT38PassthroughEnabled, credentialConnection.onnetT38PassthroughEnabled) &&
        Objects.equals(this.rtcpSettings, credentialConnection.rtcpSettings) &&
        Objects.equals(this.inbound, credentialConnection.inbound) &&
        Objects.equals(this.outbound, credentialConnection.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, active, userName, password, createdAt, updatedAt, anchorsiteOverride, connectionName, sipUriCallingPreference, defaultOnHoldComfortNoiseEnabled, dtmfType, encodeContactHeaderEnabled, encryptedMedia, onnetT38PassthroughEnabled, rtcpSettings, inbound, outbound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialConnection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    anchorsiteOverride: ").append(toIndentedString(anchorsiteOverride)).append("\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    sipUriCallingPreference: ").append(toIndentedString(sipUriCallingPreference)).append("\n");
    sb.append("    defaultOnHoldComfortNoiseEnabled: ").append(toIndentedString(defaultOnHoldComfortNoiseEnabled)).append("\n");
    sb.append("    dtmfType: ").append(toIndentedString(dtmfType)).append("\n");
    sb.append("    encodeContactHeaderEnabled: ").append(toIndentedString(encodeContactHeaderEnabled)).append("\n");
    sb.append("    encryptedMedia: ").append(toIndentedString(encryptedMedia)).append("\n");
    sb.append("    onnetT38PassthroughEnabled: ").append(toIndentedString(onnetT38PassthroughEnabled)).append("\n");
    sb.append("    rtcpSettings: ").append(toIndentedString(rtcpSettings)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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
