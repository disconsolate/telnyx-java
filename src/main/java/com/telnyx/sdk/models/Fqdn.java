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
 * Fqdn
 */


public class Fqdn {
  @SerializedName("id")
  private String id = null;

  @SerializedName("record_type")
  private String recordType = null;

  @SerializedName("connection_id")
  private String connectionId = null;

  @SerializedName("fqdn")
  private String fqdn = null;

  @SerializedName("port")
  private Integer port = 5060;

  @SerializedName("dns_record_type")
  private String dnsRecordType = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  public Fqdn id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the resource.
   * @return id
  **/
  @Schema(example = "1293384261075731499", description = "Identifies the resource.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Fqdn recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @Schema(example = "fqdn", description = "Identifies the type of the resource.")
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public Fqdn connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * ID of the FQDN connection to which this FQDN is attached.
   * @return connectionId
  **/
  @Schema(description = "ID of the FQDN connection to which this FQDN is attached.")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public Fqdn fqdn(String fqdn) {
    this.fqdn = fqdn;
    return this;
  }

   /**
   * FQDN represented by this resource.
   * @return fqdn
  **/
  @Schema(example = "example.com", description = "FQDN represented by this resource.")
  public String getFqdn() {
    return fqdn;
  }

  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  public Fqdn port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port to use when connecting to this FQDN.
   * @return port
  **/
  @Schema(example = "5060", description = "Port to use when connecting to this FQDN.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Fqdn dnsRecordType(String dnsRecordType) {
    this.dnsRecordType = dnsRecordType;
    return this;
  }

   /**
   * The DNS record type for the FQDN. For cases where a port is not set, the DNS record type must be &#x27;srv&#x27;. For cases where a port is set, the DNS record type must be &#x27;a&#x27;. If the DNS record type is &#x27;a&#x27; and a port is not specified, 5060 will be used.
   * @return dnsRecordType
  **/
  @Schema(example = "a", description = "The DNS record type for the FQDN. For cases where a port is not set, the DNS record type must be 'srv'. For cases where a port is set, the DNS record type must be 'a'. If the DNS record type is 'a' and a port is not specified, 5060 will be used.")
  public String getDnsRecordType() {
    return dnsRecordType;
  }

  public void setDnsRecordType(String dnsRecordType) {
    this.dnsRecordType = dnsRecordType;
  }

  public Fqdn createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @Schema(example = "2018-02-02T22:25:27.521Z", description = "ISO 8601 formatted date indicating when the resource was created.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Fqdn updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @Schema(example = "2018-02-02T22:25:27.521Z", description = "ISO 8601 formatted date indicating when the resource was updated.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fqdn fqdn = (Fqdn) o;
    return Objects.equals(this.id, fqdn.id) &&
        Objects.equals(this.recordType, fqdn.recordType) &&
        Objects.equals(this.connectionId, fqdn.connectionId) &&
        Objects.equals(this.fqdn, fqdn.fqdn) &&
        Objects.equals(this.port, fqdn.port) &&
        Objects.equals(this.dnsRecordType, fqdn.dnsRecordType) &&
        Objects.equals(this.createdAt, fqdn.createdAt) &&
        Objects.equals(this.updatedAt, fqdn.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, connectionId, fqdn, port, dnsRecordType, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fqdn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    dnsRecordType: ").append(toIndentedString(dnsRecordType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
