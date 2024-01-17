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
import com.adyen.model.terminal.LoyaltyUnit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * An awarded amount or an amount to redeem to the loyalty account might be sent in the Payment request message. Amount of a loyalty account.
 */
@ApiModel(description = "An awarded amount or an amount to redeem to the loyalty account might be sent in the Payment request message. Amount of a loyalty account.")
@JsonPropertyOrder({
  LoyaltyAmount.JSON_PROPERTY_LOYALTY_UNIT,
  LoyaltyAmount.JSON_PROPERTY_CURRENCY,
  LoyaltyAmount.JSON_PROPERTY_AMOUNT_VALUE
})

public class LoyaltyAmount {
  public static final String JSON_PROPERTY_LOYALTY_UNIT = "LoyaltyUnit";
  private LoyaltyUnit loyaltyUnit;

  public static final String JSON_PROPERTY_CURRENCY = "Currency";
  private String currency;

  public static final String JSON_PROPERTY_AMOUNT_VALUE = "AmountValue";
  private BigDecimal amountValue;

  public LoyaltyAmount() { 
  }

  public LoyaltyAmount loyaltyUnit(LoyaltyUnit loyaltyUnit) {
    this.loyaltyUnit = loyaltyUnit;
    return this;
  }

   /**
   * Get loyaltyUnit
   * @return loyaltyUnit
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOYALTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LoyaltyUnit getLoyaltyUnit() {
    return loyaltyUnit;
  }


 /**
  * loyaltyUnit
  *
  * @param loyaltyUnit
  */ 
  @JsonProperty(JSON_PROPERTY_LOYALTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoyaltyUnit(LoyaltyUnit loyaltyUnit) {
    this.loyaltyUnit = loyaltyUnit;
  }


  public LoyaltyAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


 /**
  * currency
  *
  * @param currency
  */ 
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public LoyaltyAmount amountValue(BigDecimal amountValue) {
    this.amountValue = amountValue;
    return this;
  }

   /**
   * Get amountValue
   * minimum: 0.0
   * maximum: 99999999.999999
   * @return amountValue
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmountValue() {
    return amountValue;
  }


 /**
  * amountValue
  *
  * @param amountValue
  */ 
  @JsonProperty(JSON_PROPERTY_AMOUNT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountValue(BigDecimal amountValue) {
    this.amountValue = amountValue;
  }


  /**
   * Return true if this LoyaltyAmount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyAmount loyaltyAmount = (LoyaltyAmount) o;
    return Objects.equals(this.loyaltyUnit, loyaltyAmount.loyaltyUnit) &&
        Objects.equals(this.currency, loyaltyAmount.currency) &&
        Objects.equals(this.amountValue, loyaltyAmount.amountValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyaltyUnit, currency, amountValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyAmount {\n");
    sb.append("    loyaltyUnit: ").append(toIndentedString(loyaltyUnit)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amountValue: ").append(toIndentedString(amountValue)).append("\n");
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
   * Create an instance of LoyaltyAmount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LoyaltyAmount
   * @throws JsonProcessingException if the JSON string is invalid with respect to LoyaltyAmount
   */
  public static LoyaltyAmount fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, LoyaltyAmount.class);
  }
/**
  * Convert an instance of LoyaltyAmount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

