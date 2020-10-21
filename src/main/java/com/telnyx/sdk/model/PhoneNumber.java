/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.PhoneNumberRegulatoryRequirement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PhoneNumber
 */
@JsonPropertyOrder({
  PhoneNumber.JSON_PROPERTY_ID,
  PhoneNumber.JSON_PROPERTY_RECORD_TYPE,
  PhoneNumber.JSON_PROPERTY_PHONE_NUMBER,
  PhoneNumber.JSON_PROPERTY_REGULATORY_GROUP_ID,
  PhoneNumber.JSON_PROPERTY_REGULATORY_REQUIREMENTS,
  PhoneNumber.JSON_PROPERTY_REQUIREMENTS_MET,
  PhoneNumber.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PhoneNumber {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_REGULATORY_GROUP_ID = "regulatory_group_id";
  private String regulatoryGroupId;

  public static final String JSON_PROPERTY_REGULATORY_REQUIREMENTS = "regulatory_requirements";
  private List<PhoneNumberRegulatoryRequirement> regulatoryRequirements = null;

  public static final String JSON_PROPERTY_REQUIREMENTS_MET = "requirements_met";
  private Boolean requirementsMet;

  /**
   * The status of the phone number in the order.
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    SUCCESS("success"),
    
    FAILURE("failure");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dc8e4d67-33a0-4cbb-af74-7b58f05bd494", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "number_order_phone_number", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public PhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+19705555098", value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


   /**
   * Get regulatoryGroupId
   * @return regulatoryGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dc8e4d67-33a0-4cbb-af74-7b58f05bd494", value = "")
  @JsonProperty(JSON_PROPERTY_REGULATORY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegulatoryGroupId() {
    return regulatoryGroupId;
  }




  public PhoneNumber regulatoryRequirements(List<PhoneNumberRegulatoryRequirement> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
    return this;
  }

  public PhoneNumber addRegulatoryRequirementsItem(PhoneNumberRegulatoryRequirement regulatoryRequirementsItem) {
    if (this.regulatoryRequirements == null) {
      this.regulatoryRequirements = new ArrayList<>();
    }
    this.regulatoryRequirements.add(regulatoryRequirementsItem);
    return this;
  }

   /**
   * Get regulatoryRequirements
   * @return regulatoryRequirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PhoneNumberRegulatoryRequirement> getRegulatoryRequirements() {
    return regulatoryRequirements;
  }


  public void setRegulatoryRequirements(List<PhoneNumberRegulatoryRequirement> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
  }


   /**
   * True if all requirements are met for a phone number, false otherwise.
   * @return requirementsMet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "True if all requirements are met for a phone number, false otherwise.")
  @JsonProperty(JSON_PROPERTY_REQUIREMENTS_MET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequirementsMet() {
    return requirementsMet;
  }




   /**
   * The status of the phone number in the order.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the phone number in the order.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




  /**
   * Return true if this PhoneNumber object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(this.id, phoneNumber.id) &&
        Objects.equals(this.recordType, phoneNumber.recordType) &&
        Objects.equals(this.phoneNumber, phoneNumber.phoneNumber) &&
        Objects.equals(this.regulatoryGroupId, phoneNumber.regulatoryGroupId) &&
        Objects.equals(this.regulatoryRequirements, phoneNumber.regulatoryRequirements) &&
        Objects.equals(this.requirementsMet, phoneNumber.requirementsMet) &&
        Objects.equals(this.status, phoneNumber.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, phoneNumber, regulatoryGroupId, regulatoryRequirements, requirementsMet, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    regulatoryGroupId: ").append(toIndentedString(regulatoryGroupId)).append("\n");
    sb.append("    regulatoryRequirements: ").append(toIndentedString(regulatoryRequirements)).append("\n");
    sb.append("    requirementsMet: ").append(toIndentedString(requirementsMet)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
