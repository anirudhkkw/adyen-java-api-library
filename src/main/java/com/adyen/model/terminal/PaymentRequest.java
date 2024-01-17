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
import com.adyen.model.terminal.LoyaltyData;
import com.adyen.model.terminal.PaymentData;
import com.adyen.model.terminal.PaymentTransaction;
import com.adyen.model.terminal.SaleData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Request sent to terminal to initiate payment.  It conveys Information related to the Payment transaction to process. Content of the Payment Request message.
 */
@ApiModel(description = "Request sent to terminal to initiate payment.  It conveys Information related to the Payment transaction to process. Content of the Payment Request message.")
@JsonPropertyOrder({
  PaymentRequest.JSON_PROPERTY_SALE_DATA,
  PaymentRequest.JSON_PROPERTY_PAYMENT_TRANSACTION,
  PaymentRequest.JSON_PROPERTY_PAYMENT_DATA,
  PaymentRequest.JSON_PROPERTY_LOYALTY_DATA
})

public class PaymentRequest {
  public static final String JSON_PROPERTY_SALE_DATA = "SaleData";
  private SaleData saleData;

  public static final String JSON_PROPERTY_PAYMENT_TRANSACTION = "PaymentTransaction";
  private PaymentTransaction paymentTransaction;

  public static final String JSON_PROPERTY_PAYMENT_DATA = "PaymentData";
  private PaymentData paymentData;

  public static final String JSON_PROPERTY_LOYALTY_DATA = "LoyaltyData";
  private List<LoyaltyData> loyaltyData = null;

  public PaymentRequest() { 
  }

  public PaymentRequest saleData(SaleData saleData) {
    this.saleData = saleData;
    return this;
  }

   /**
   * Get saleData
   * @return saleData
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SALE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SaleData getSaleData() {
    return saleData;
  }


 /**
  * saleData
  *
  * @param saleData
  */ 
  @JsonProperty(JSON_PROPERTY_SALE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaleData(SaleData saleData) {
    this.saleData = saleData;
  }


  public PaymentRequest paymentTransaction(PaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

   /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }


 /**
  * paymentTransaction
  *
  * @param paymentTransaction
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentTransaction(PaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


  public PaymentRequest paymentData(PaymentData paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * Get paymentData
   * @return paymentData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentData getPaymentData() {
    return paymentData;
  }


 /**
  * paymentData
  *
  * @param paymentData
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentData(PaymentData paymentData) {
    this.paymentData = paymentData;
  }


  public PaymentRequest loyaltyData(List<LoyaltyData> loyaltyData) {
    this.loyaltyData = loyaltyData;
    return this;
  }

  public PaymentRequest addLoyaltyDataItem(LoyaltyData loyaltyDataItem) {
    if (this.loyaltyData == null) {
      this.loyaltyData = new ArrayList<>();
    }
    this.loyaltyData.add(loyaltyDataItem);
    return this;
  }

   /**
   * Get loyaltyData
   * @return loyaltyData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOYALTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LoyaltyData> getLoyaltyData() {
    return loyaltyData;
  }


 /**
  * loyaltyData
  *
  * @param loyaltyData
  */ 
  @JsonProperty(JSON_PROPERTY_LOYALTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoyaltyData(List<LoyaltyData> loyaltyData) {
    this.loyaltyData = loyaltyData;
  }


  /**
   * Return true if this PaymentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequest paymentRequest = (PaymentRequest) o;
    return Objects.equals(this.saleData, paymentRequest.saleData) &&
        Objects.equals(this.paymentTransaction, paymentRequest.paymentTransaction) &&
        Objects.equals(this.paymentData, paymentRequest.paymentData) &&
        Objects.equals(this.loyaltyData, paymentRequest.loyaltyData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saleData, paymentTransaction, paymentData, loyaltyData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequest {\n");
    sb.append("    saleData: ").append(toIndentedString(saleData)).append("\n");
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    loyaltyData: ").append(toIndentedString(loyaltyData)).append("\n");
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
   * Create an instance of PaymentRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentRequest
   */
  public static PaymentRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentRequest.class);
  }
/**
  * Convert an instance of PaymentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

