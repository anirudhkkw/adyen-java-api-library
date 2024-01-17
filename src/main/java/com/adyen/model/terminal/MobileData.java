/*
 * Adyen Terminal API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.terminal;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.terminal.Geolocation;
import com.adyen.model.terminal.SensitiveMobileData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Mobile phone is used as a payment instrument for the transaction. Information related to the mobile for the payment transaction.
 */
@ApiModel(description = "Mobile phone is used as a payment instrument for the transaction. Information related to the mobile for the payment transaction.")
@JsonPropertyOrder({
  MobileData.JSON_PROPERTY_MOBILE_COUNTRY_CODE,
  MobileData.JSON_PROPERTY_MOBILE_NETWORK_CODE,
  MobileData.JSON_PROPERTY_MASKED_M_S_I_S_D_N,
  MobileData.JSON_PROPERTY_GEOLOCATION,
  MobileData.JSON_PROPERTY_PROTECTED_MOBILE_DATA,
  MobileData.JSON_PROPERTY_SENSITIVE_MOBILE_DATA
})

public class MobileData {
  public static final String JSON_PROPERTY_MOBILE_COUNTRY_CODE = "MobileCountryCode";
  private Integer mobileCountryCode;

  public static final String JSON_PROPERTY_MOBILE_NETWORK_CODE = "MobileNetworkCode";
  private Integer mobileNetworkCode;

  public static final String JSON_PROPERTY_MASKED_M_S_I_S_D_N = "MaskedMSISDN";
  private Integer maskedMSISDN;

  public static final String JSON_PROPERTY_GEOLOCATION = "Geolocation";
  private Geolocation geolocation;

  public static final String JSON_PROPERTY_PROTECTED_MOBILE_DATA = "ProtectedMobileData";
  private String protectedMobileData;

  public static final String JSON_PROPERTY_SENSITIVE_MOBILE_DATA = "SensitiveMobileData";
  private SensitiveMobileData sensitiveMobileData;

  public MobileData() { 
  }

  public MobileData mobileCountryCode(Integer mobileCountryCode) {
    this.mobileCountryCode = mobileCountryCode;
    return this;
  }

   /**
   * If data available.
   * minimum: 3
   * maximum: 3
   * @return mobileCountryCode
  **/
  @ApiModelProperty(value = "If data available.")
  @JsonProperty(JSON_PROPERTY_MOBILE_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMobileCountryCode() {
    return mobileCountryCode;
  }


 /**
  * If data available.
  *
  * @param mobileCountryCode
  */ 
  @JsonProperty(JSON_PROPERTY_MOBILE_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileCountryCode(Integer mobileCountryCode) {
    this.mobileCountryCode = mobileCountryCode;
  }


  public MobileData mobileNetworkCode(Integer mobileNetworkCode) {
    this.mobileNetworkCode = mobileNetworkCode;
    return this;
  }

   /**
   * If data available.
   * minimum: 2
   * maximum: 3
   * @return mobileNetworkCode
  **/
  @ApiModelProperty(value = "If data available.")
  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMobileNetworkCode() {
    return mobileNetworkCode;
  }


 /**
  * If data available.
  *
  * @param mobileNetworkCode
  */ 
  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileNetworkCode(Integer mobileNetworkCode) {
    this.mobileNetworkCode = mobileNetworkCode;
  }


  public MobileData maskedMSISDN(Integer maskedMSISDN) {
    this.maskedMSISDN = maskedMSISDN;
    return this;
  }

   /**
   * If data available.
   * @return maskedMSISDN
  **/
  @ApiModelProperty(value = "If data available.")
  @JsonProperty(JSON_PROPERTY_MASKED_M_S_I_S_D_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaskedMSISDN() {
    return maskedMSISDN;
  }


 /**
  * If data available.
  *
  * @param maskedMSISDN
  */ 
  @JsonProperty(JSON_PROPERTY_MASKED_M_S_I_S_D_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaskedMSISDN(Integer maskedMSISDN) {
    this.maskedMSISDN = maskedMSISDN;
  }


  public MobileData geolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
    return this;
  }

   /**
   * Get geolocation
   * @return geolocation
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GEOLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Geolocation getGeolocation() {
    return geolocation;
  }


 /**
  * geolocation
  *
  * @param geolocation
  */ 
  @JsonProperty(JSON_PROPERTY_GEOLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }


  public MobileData protectedMobileData(String protectedMobileData) {
    this.protectedMobileData = protectedMobileData;
    return this;
  }

   /**
   * SensitiveMobileData.
   * @return protectedMobileData
  **/
  @ApiModelProperty(value = "SensitiveMobileData.")
  @JsonProperty(JSON_PROPERTY_PROTECTED_MOBILE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProtectedMobileData() {
    return protectedMobileData;
  }


 /**
  * SensitiveMobileData.
  *
  * @param protectedMobileData
  */ 
  @JsonProperty(JSON_PROPERTY_PROTECTED_MOBILE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtectedMobileData(String protectedMobileData) {
    this.protectedMobileData = protectedMobileData;
  }


  public MobileData sensitiveMobileData(SensitiveMobileData sensitiveMobileData) {
    this.sensitiveMobileData = sensitiveMobileData;
    return this;
  }

   /**
   * Get sensitiveMobileData
   * @return sensitiveMobileData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENSITIVE_MOBILE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SensitiveMobileData getSensitiveMobileData() {
    return sensitiveMobileData;
  }


 /**
  * sensitiveMobileData
  *
  * @param sensitiveMobileData
  */ 
  @JsonProperty(JSON_PROPERTY_SENSITIVE_MOBILE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSensitiveMobileData(SensitiveMobileData sensitiveMobileData) {
    this.sensitiveMobileData = sensitiveMobileData;
  }


  /**
   * Return true if this MobileData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileData mobileData = (MobileData) o;
    return Objects.equals(this.mobileCountryCode, mobileData.mobileCountryCode) &&
        Objects.equals(this.mobileNetworkCode, mobileData.mobileNetworkCode) &&
        Objects.equals(this.maskedMSISDN, mobileData.maskedMSISDN) &&
        Objects.equals(this.geolocation, mobileData.geolocation) &&
        Objects.equals(this.protectedMobileData, mobileData.protectedMobileData) &&
        Objects.equals(this.sensitiveMobileData, mobileData.sensitiveMobileData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileCountryCode, mobileNetworkCode, maskedMSISDN, geolocation, protectedMobileData, sensitiveMobileData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileData {\n");
    sb.append("    mobileCountryCode: ").append(toIndentedString(mobileCountryCode)).append("\n");
    sb.append("    mobileNetworkCode: ").append(toIndentedString(mobileNetworkCode)).append("\n");
    sb.append("    maskedMSISDN: ").append(toIndentedString(maskedMSISDN)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    protectedMobileData: ").append(toIndentedString(protectedMobileData)).append("\n");
    sb.append("    sensitiveMobileData: ").append(toIndentedString(sensitiveMobileData)).append("\n");
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

/**
   * Create an instance of MobileData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MobileData
   * @throws JsonProcessingException if the JSON string is invalid with respect to MobileData
   */
  public static MobileData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, MobileData.class);
  }
/**
  * Convert an instance of MobileData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

