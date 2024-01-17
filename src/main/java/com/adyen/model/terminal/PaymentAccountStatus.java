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
import com.adyen.model.terminal.PaymentAcquirerData;
import com.adyen.model.terminal.PaymentInstrumentData;
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
 * PaymentAccountStatus
 */
@JsonPropertyOrder({
  PaymentAccountStatus.JSON_PROPERTY_PAYMENT_INSTRUMENT_DATA,
  PaymentAccountStatus.JSON_PROPERTY_CURRENT_BALANCE,
  PaymentAccountStatus.JSON_PROPERTY_CURRENCY,
  PaymentAccountStatus.JSON_PROPERTY_PAYMENT_ACQUIRER_DATA
})

public class PaymentAccountStatus {
  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT_DATA = "PaymentInstrumentData";
  private PaymentInstrumentData paymentInstrumentData;

  public static final String JSON_PROPERTY_CURRENT_BALANCE = "CurrentBalance";
  private BigDecimal currentBalance;

  public static final String JSON_PROPERTY_CURRENCY = "Currency";
  private String currency;

  public static final String JSON_PROPERTY_PAYMENT_ACQUIRER_DATA = "PaymentAcquirerData";
  private PaymentAcquirerData paymentAcquirerData;

  public PaymentAccountStatus() { 
  }

  public PaymentAccountStatus paymentInstrumentData(PaymentInstrumentData paymentInstrumentData) {
    this.paymentInstrumentData = paymentInstrumentData;
    return this;
  }

   /**
   * Get paymentInstrumentData
   * @return paymentInstrumentData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentInstrumentData getPaymentInstrumentData() {
    return paymentInstrumentData;
  }


 /**
  * paymentInstrumentData
  *
  * @param paymentInstrumentData
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstrumentData(PaymentInstrumentData paymentInstrumentData) {
    this.paymentInstrumentData = paymentInstrumentData;
  }


  public PaymentAccountStatus currentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

   /**
   * Get currentBalance
   * minimum: 0.0
   * maximum: 99999999.999999
   * @return currentBalance
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCurrentBalance() {
    return currentBalance;
  }


 /**
  * currentBalance
  *
  * @param currentBalance
  */ 
  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
  }


  public PaymentAccountStatus currency(String currency) {
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


  public PaymentAccountStatus paymentAcquirerData(PaymentAcquirerData paymentAcquirerData) {
    this.paymentAcquirerData = paymentAcquirerData;
    return this;
  }

   /**
   * Get paymentAcquirerData
   * @return paymentAcquirerData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_ACQUIRER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentAcquirerData getPaymentAcquirerData() {
    return paymentAcquirerData;
  }


 /**
  * paymentAcquirerData
  *
  * @param paymentAcquirerData
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_ACQUIRER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentAcquirerData(PaymentAcquirerData paymentAcquirerData) {
    this.paymentAcquirerData = paymentAcquirerData;
  }


  /**
   * Return true if this PaymentAccountStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAccountStatus paymentAccountStatus = (PaymentAccountStatus) o;
    return Objects.equals(this.paymentInstrumentData, paymentAccountStatus.paymentInstrumentData) &&
        Objects.equals(this.currentBalance, paymentAccountStatus.currentBalance) &&
        Objects.equals(this.currency, paymentAccountStatus.currency) &&
        Objects.equals(this.paymentAcquirerData, paymentAccountStatus.paymentAcquirerData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentData, currentBalance, currency, paymentAcquirerData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAccountStatus {\n");
    sb.append("    paymentInstrumentData: ").append(toIndentedString(paymentInstrumentData)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentAcquirerData: ").append(toIndentedString(paymentAcquirerData)).append("\n");
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
   * Create an instance of PaymentAccountStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentAccountStatus
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentAccountStatus
   */
  public static PaymentAccountStatus fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentAccountStatus.class);
  }
/**
  * Convert an instance of PaymentAccountStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

