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
 * Ip
 */


public class Ip {
  @SerializedName("id")
  private String id = null;

  @SerializedName("record_type")
  private String recordType = null;

  @SerializedName("connection_id")
  private String connectionId = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("port")
  private Integer port = 5060;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  public Ip id(String id) {
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

  public Ip recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @Schema(example = "ip", description = "Identifies the type of the resource.")
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public Ip connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * ID of the IP Connection to which this IP should be attached.
   * @return connectionId
  **/
  @Schema(description = "ID of the IP Connection to which this IP should be attached.")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public Ip ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP adddress represented by this resource.
   * @return ipAddress
  **/
  @Schema(example = "192.168.0.0", description = "IP adddress represented by this resource.")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Ip port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port to use when connecting to this IP.
   * @return port
  **/
  @Schema(example = "5060", description = "Port to use when connecting to this IP.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Ip createdAt(String createdAt) {
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

  public Ip updatedAt(String updatedAt) {
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
    Ip ip = (Ip) o;
    return Objects.equals(this.id, ip.id) &&
        Objects.equals(this.recordType, ip.recordType) &&
        Objects.equals(this.connectionId, ip.connectionId) &&
        Objects.equals(this.ipAddress, ip.ipAddress) &&
        Objects.equals(this.port, ip.port) &&
        Objects.equals(this.createdAt, ip.createdAt) &&
        Objects.equals(this.updatedAt, ip.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, connectionId, ipAddress, port, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ip {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
