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
import com.adyen.model.terminal.LoyaltyAccountStatus;
import com.adyen.model.terminal.PaymentAccountStatus;
import com.adyen.model.terminal.PaymentReceipt;
import com.adyen.model.terminal.Response;
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
 * It conveys the balance and the identification of the associated payment, loyalty or stored value account. Content of the Balance Inquiry Response message.
 */
@ApiModel(description = "It conveys the balance and the identification of the associated payment, loyalty or stored value account. Content of the Balance Inquiry Response message.")
@JsonPropertyOrder({
  BalanceInquiryResponse.JSON_PROPERTY_RESPONSE,
  BalanceInquiryResponse.JSON_PROPERTY_PAYMENT_ACCOUNT_STATUS,
  BalanceInquiryResponse.JSON_PROPERTY_LOYALTY_ACCOUNT_STATUS,
  BalanceInquiryResponse.JSON_PROPERTY_PAYMENT_RECEIPT
})

public class BalanceInquiryResponse {
  public static final String JSON_PROPERTY_RESPONSE = "Response";
  private Response response;

  public static final String JSON_PROPERTY_PAYMENT_ACCOUNT_STATUS = "PaymentAccountStatus";
  private PaymentAccountStatus paymentAccountStatus;

  public static final String JSON_PROPERTY_LOYALTY_ACCOUNT_STATUS = "LoyaltyAccountStatus";
  private LoyaltyAccountStatus loyaltyAccountStatus;

  public static final String JSON_PROPERTY_PAYMENT_RECEIPT = "PaymentReceipt";
  private List<PaymentReceipt> paymentReceipt = null;

  public BalanceInquiryResponse() { 
  }

  public BalanceInquiryResponse response(Response response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Response getResponse() {
    return response;
  }


 /**
  * response
  *
  * @param response
  */ 
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponse(Response response) {
    this.response = response;
  }


  public BalanceInquiryResponse paymentAccountStatus(PaymentAccountStatus paymentAccountStatus) {
    this.paymentAccountStatus = paymentAccountStatus;
    return this;
  }

   /**
   * Get paymentAccountStatus
   * @return paymentAccountStatus
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentAccountStatus getPaymentAccountStatus() {
    return paymentAccountStatus;
  }


 /**
  * paymentAccountStatus
  *
  * @param paymentAccountStatus
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentAccountStatus(PaymentAccountStatus paymentAccountStatus) {
    this.paymentAccountStatus = paymentAccountStatus;
  }


  public BalanceInquiryResponse loyaltyAccountStatus(LoyaltyAccountStatus loyaltyAccountStatus) {
    this.loyaltyAccountStatus = loyaltyAccountStatus;
    return this;
  }

   /**
   * Get loyaltyAccountStatus
   * @return loyaltyAccountStatus
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOYALTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LoyaltyAccountStatus getLoyaltyAccountStatus() {
    return loyaltyAccountStatus;
  }


 /**
  * loyaltyAccountStatus
  *
  * @param loyaltyAccountStatus
  */ 
  @JsonProperty(JSON_PROPERTY_LOYALTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoyaltyAccountStatus(LoyaltyAccountStatus loyaltyAccountStatus) {
    this.loyaltyAccountStatus = loyaltyAccountStatus;
  }


  public BalanceInquiryResponse paymentReceipt(List<PaymentReceipt> paymentReceipt) {
    this.paymentReceipt = paymentReceipt;
    return this;
  }

  public BalanceInquiryResponse addPaymentReceiptItem(PaymentReceipt paymentReceiptItem) {
    if (this.paymentReceipt == null) {
      this.paymentReceipt = new ArrayList<>();
    }
    this.paymentReceipt.add(paymentReceiptItem);
    return this;
  }

   /**
   * Get paymentReceipt
   * @return paymentReceipt
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentReceipt> getPaymentReceipt() {
    return paymentReceipt;
  }


 /**
  * paymentReceipt
  *
  * @param paymentReceipt
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentReceipt(List<PaymentReceipt> paymentReceipt) {
    this.paymentReceipt = paymentReceipt;
  }


  /**
   * Return true if this BalanceInquiryResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceInquiryResponse balanceInquiryResponse = (BalanceInquiryResponse) o;
    return Objects.equals(this.response, balanceInquiryResponse.response) &&
        Objects.equals(this.paymentAccountStatus, balanceInquiryResponse.paymentAccountStatus) &&
        Objects.equals(this.loyaltyAccountStatus, balanceInquiryResponse.loyaltyAccountStatus) &&
        Objects.equals(this.paymentReceipt, balanceInquiryResponse.paymentReceipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, paymentAccountStatus, loyaltyAccountStatus, paymentReceipt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceInquiryResponse {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    paymentAccountStatus: ").append(toIndentedString(paymentAccountStatus)).append("\n");
    sb.append("    loyaltyAccountStatus: ").append(toIndentedString(loyaltyAccountStatus)).append("\n");
    sb.append("    paymentReceipt: ").append(toIndentedString(paymentReceipt)).append("\n");
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
   * Create an instance of BalanceInquiryResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BalanceInquiryResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to BalanceInquiryResponse
   */
  public static BalanceInquiryResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BalanceInquiryResponse.class);
  }
/**
  * Convert an instance of BalanceInquiryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

