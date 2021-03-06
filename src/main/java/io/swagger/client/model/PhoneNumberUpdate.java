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
import java.util.ArrayList;
import java.util.List;
/**
 * PhoneNumberUpdate
 */


public class PhoneNumberUpdate {
  @SerializedName("id")
  private String id = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("external_pin")
  private String externalPin = null;

  @SerializedName("connection_id")
  private String connectionId = null;

  @SerializedName("billing_group_id")
  private String billingGroupId = null;

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @Schema(description = "Identifies the type of resource.")
  public String getId() {
    return id;
  }

  public PhoneNumberUpdate tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PhoneNumberUpdate addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of user-assigned tags to help organize phone numbers.
   * @return tags
  **/
  @Schema(description = "A list of user-assigned tags to help organize phone numbers.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public PhoneNumberUpdate externalPin(String externalPin) {
    this.externalPin = externalPin;
    return this;
  }

   /**
   * If someone attempts to port your phone number away from Telnyx and your phone number has an external PIN set, we will attempt to verify that you provided the correct external PIN to the winning carrier. Note that not all carriers cooperate with this security mechanism.
   * @return externalPin
  **/
  @Schema(description = "If someone attempts to port your phone number away from Telnyx and your phone number has an external PIN set, we will attempt to verify that you provided the correct external PIN to the winning carrier. Note that not all carriers cooperate with this security mechanism.")
  public String getExternalPin() {
    return externalPin;
  }

  public void setExternalPin(String externalPin) {
    this.externalPin = externalPin;
  }

  public PhoneNumberUpdate connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Identifies the connection associated with the phone number.
   * @return connectionId
  **/
  @Schema(description = "Identifies the connection associated with the phone number.")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public PhoneNumberUpdate billingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
    return this;
  }

   /**
   * Identifies the billing group associated with the phone number.
   * @return billingGroupId
  **/
  @Schema(description = "Identifies the billing group associated with the phone number.")
  public String getBillingGroupId() {
    return billingGroupId;
  }

  public void setBillingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberUpdate phoneNumberUpdate = (PhoneNumberUpdate) o;
    return Objects.equals(this.id, phoneNumberUpdate.id) &&
        Objects.equals(this.tags, phoneNumberUpdate.tags) &&
        Objects.equals(this.externalPin, phoneNumberUpdate.externalPin) &&
        Objects.equals(this.connectionId, phoneNumberUpdate.connectionId) &&
        Objects.equals(this.billingGroupId, phoneNumberUpdate.billingGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tags, externalPin, connectionId, billingGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    externalPin: ").append(toIndentedString(externalPin)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
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
