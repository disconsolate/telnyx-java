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
import com.telnyx.sdk.models.ConnectionRtcpSettings;
import com.telnyx.sdk.models.CreateInboundIpRequest;
import com.telnyx.sdk.models.OutboundIp;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CreateIpConnectionRequest
 */


public class CreateIpConnectionRequest {
  @SerializedName("active")
  private Boolean active = null;

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
   * One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN authentication.
   */
  @JsonAdapter(TransportProtocolEnum.Adapter.class)
  public enum TransportProtocolEnum {
    UDP("UDP"),
    TCP("TCP"),
    TLS("TLS");

    private String value;

    TransportProtocolEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TransportProtocolEnum fromValue(String text) {
      for (TransportProtocolEnum b : TransportProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TransportProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransportProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransportProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransportProtocolEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("transport_protocol")
  private TransportProtocolEnum transportProtocol = TransportProtocolEnum.UDP;

  @SerializedName("default_on_hold_comfort_noise_enabled")
  private Boolean defaultOnHoldComfortNoiseEnabled = true;

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
  private ConnectionRtcpSettings rtcpSettings = null;

  @SerializedName("inbound")
  private CreateInboundIpRequest inbound = null;

  @SerializedName("outbound")
  private OutboundIp outbound = null;

  public CreateIpConnectionRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Defaults to true
   * @return active
  **/
  @Schema(example = "true", description = "Defaults to true")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CreateIpConnectionRequest anchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
    return this;
  }

   /**
   * &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#x27;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.
   * @return anchorsiteOverride
  **/
  @Schema(example = "Chicago, IL", description = "`Latency` directs Telnyx to route media through the site with the lowest round-trip time to the user's connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.")
  public AnchorsiteOverrideEnum getAnchorsiteOverride() {
    return anchorsiteOverride;
  }

  public void setAnchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
  }

  public CreateIpConnectionRequest connectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

   /**
   * Get connectionName
   * @return connectionName
  **/
  @Schema(example = "string", description = "")
  public String getConnectionName() {
    return connectionName;
  }

  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }

  public CreateIpConnectionRequest transportProtocol(TransportProtocolEnum transportProtocol) {
    this.transportProtocol = transportProtocol;
    return this;
  }

   /**
   * One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN authentication.
   * @return transportProtocol
  **/
  @Schema(example = "UDP", description = "One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN authentication.")
  public TransportProtocolEnum getTransportProtocol() {
    return transportProtocol;
  }

  public void setTransportProtocol(TransportProtocolEnum transportProtocol) {
    this.transportProtocol = transportProtocol;
  }

  public CreateIpConnectionRequest defaultOnHoldComfortNoiseEnabled(Boolean defaultOnHoldComfortNoiseEnabled) {
    this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled;
    return this;
  }

   /**
   * When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.
   * @return defaultOnHoldComfortNoiseEnabled
  **/
  @Schema(example = "true", description = "When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.")
  public Boolean isDefaultOnHoldComfortNoiseEnabled() {
    return defaultOnHoldComfortNoiseEnabled;
  }

  public void setDefaultOnHoldComfortNoiseEnabled(Boolean defaultOnHoldComfortNoiseEnabled) {
    this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled;
  }

  public CreateIpConnectionRequest dtmfType(DtmfTypeEnum dtmfType) {
    this.dtmfType = dtmfType;
    return this;
  }

   /**
   * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.
   * @return dtmfType
  **/
  @Schema(example = "RFC 2833", description = "Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.")
  public DtmfTypeEnum getDtmfType() {
    return dtmfType;
  }

  public void setDtmfType(DtmfTypeEnum dtmfType) {
    this.dtmfType = dtmfType;
  }

  public CreateIpConnectionRequest encodeContactHeaderEnabled(Boolean encodeContactHeaderEnabled) {
    this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
    return this;
  }

   /**
   * Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.
   * @return encodeContactHeaderEnabled
  **/
  @Schema(example = "true", description = "Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.")
  public Boolean isEncodeContactHeaderEnabled() {
    return encodeContactHeaderEnabled;
  }

  public void setEncodeContactHeaderEnabled(Boolean encodeContactHeaderEnabled) {
    this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
  }

  public CreateIpConnectionRequest encryptedMedia(EncryptedMediaEnum encryptedMedia) {
    this.encryptedMedia = encryptedMedia;
    return this;
  }

   /**
   * Enable use of SRTP or ZRTP for encryption. Valid values are those listed or null. Cannot be set to non-null if the transport_portocol is TLS.
   * @return encryptedMedia
  **/
  @Schema(example = "SRTP", description = "Enable use of SRTP or ZRTP for encryption. Valid values are those listed or null. Cannot be set to non-null if the transport_portocol is TLS.")
  public EncryptedMediaEnum getEncryptedMedia() {
    return encryptedMedia;
  }

  public void setEncryptedMedia(EncryptedMediaEnum encryptedMedia) {
    this.encryptedMedia = encryptedMedia;
  }

  public CreateIpConnectionRequest onnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
    return this;
  }

   /**
   * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg&#x27;s settings.
   * @return onnetT38PassthroughEnabled
  **/
  @Schema(example = "false", description = "Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg's settings.")
  public Boolean isOnnetT38PassthroughEnabled() {
    return onnetT38PassthroughEnabled;
  }

  public void setOnnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
  }

  public CreateIpConnectionRequest rtcpSettings(ConnectionRtcpSettings rtcpSettings) {
    this.rtcpSettings = rtcpSettings;
    return this;
  }

   /**
   * Get rtcpSettings
   * @return rtcpSettings
  **/
  @Schema(description = "")
  public ConnectionRtcpSettings getRtcpSettings() {
    return rtcpSettings;
  }

  public void setRtcpSettings(ConnectionRtcpSettings rtcpSettings) {
    this.rtcpSettings = rtcpSettings;
  }

  public CreateIpConnectionRequest inbound(CreateInboundIpRequest inbound) {
    this.inbound = inbound;
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @Schema(description = "")
  public CreateInboundIpRequest getInbound() {
    return inbound;
  }

  public void setInbound(CreateInboundIpRequest inbound) {
    this.inbound = inbound;
  }

  public CreateIpConnectionRequest outbound(OutboundIp outbound) {
    this.outbound = outbound;
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @Schema(description = "")
  public OutboundIp getOutbound() {
    return outbound;
  }

  public void setOutbound(OutboundIp outbound) {
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
    CreateIpConnectionRequest createIpConnectionRequest = (CreateIpConnectionRequest) o;
    return Objects.equals(this.active, createIpConnectionRequest.active) &&
        Objects.equals(this.anchorsiteOverride, createIpConnectionRequest.anchorsiteOverride) &&
        Objects.equals(this.connectionName, createIpConnectionRequest.connectionName) &&
        Objects.equals(this.transportProtocol, createIpConnectionRequest.transportProtocol) &&
        Objects.equals(this.defaultOnHoldComfortNoiseEnabled, createIpConnectionRequest.defaultOnHoldComfortNoiseEnabled) &&
        Objects.equals(this.dtmfType, createIpConnectionRequest.dtmfType) &&
        Objects.equals(this.encodeContactHeaderEnabled, createIpConnectionRequest.encodeContactHeaderEnabled) &&
        Objects.equals(this.encryptedMedia, createIpConnectionRequest.encryptedMedia) &&
        Objects.equals(this.onnetT38PassthroughEnabled, createIpConnectionRequest.onnetT38PassthroughEnabled) &&
        Objects.equals(this.rtcpSettings, createIpConnectionRequest.rtcpSettings) &&
        Objects.equals(this.inbound, createIpConnectionRequest.inbound) &&
        Objects.equals(this.outbound, createIpConnectionRequest.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, anchorsiteOverride, connectionName, transportProtocol, defaultOnHoldComfortNoiseEnabled, dtmfType, encodeContactHeaderEnabled, encryptedMedia, onnetT38PassthroughEnabled, rtcpSettings, inbound, outbound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIpConnectionRequest {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    anchorsiteOverride: ").append(toIndentedString(anchorsiteOverride)).append("\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    transportProtocol: ").append(toIndentedString(transportProtocol)).append("\n");
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
