/*
 * Account API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Account API provides endpoints for managing account-related entities on your platform. These related entities include account holders, accounts, bank accounts, shareholders, and verification-related documents. The management operations include actions such as creation, retrieval, updating, and deletion of them.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Account API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Account/v6/createAccountHolder ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayaccount;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpayaccount.ErrorFieldType;
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
 * CloseAccountResponse
 */
@JsonPropertyOrder({
  CloseAccountResponse.JSON_PROPERTY_ACCOUNT_CODE,
  CloseAccountResponse.JSON_PROPERTY_INVALID_FIELDS,
  CloseAccountResponse.JSON_PROPERTY_PSP_REFERENCE,
  CloseAccountResponse.JSON_PROPERTY_RESULT_CODE,
  CloseAccountResponse.JSON_PROPERTY_STATUS
})

public class CloseAccountResponse {
  public static final String JSON_PROPERTY_ACCOUNT_CODE = "accountCode";
  private String accountCode;

  public static final String JSON_PROPERTY_INVALID_FIELDS = "invalidFields";
  private List<ErrorFieldType> invalidFields = null;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_RESULT_CODE = "resultCode";
  private String resultCode;

  /**
   * The new status of the account. &gt;Permitted values: &#x60;Active&#x60;, &#x60;Inactive&#x60;, &#x60;Suspended&#x60;, &#x60;Closed&#x60;.
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    CLOSED("Closed"),
    
    INACTIVE("Inactive"),
    
    SUSPENDED("Suspended");

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

  public CloseAccountResponse() { 
  }

  public CloseAccountResponse accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * The account code of the account that is closed.
   * @return accountCode
  **/
  @ApiModelProperty(value = "The account code of the account that is closed.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountCode() {
    return accountCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }


  public CloseAccountResponse invalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }

  public CloseAccountResponse addInvalidFieldsItem(ErrorFieldType invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

   /**
   * Contains field validation errors that would prevent requests from being processed.
   * @return invalidFields
  **/
  @ApiModelProperty(value = "Contains field validation errors that would prevent requests from being processed.")
  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ErrorFieldType> getInvalidFields() {
    return invalidFields;
  }


  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
  }


  public CloseAccountResponse pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * The reference of a request. Can be used to uniquely identify the request.
   * @return pspReference
  **/
  @ApiModelProperty(value = "The reference of a request. Can be used to uniquely identify the request.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPspReference() {
    return pspReference;
  }


  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public CloseAccountResponse resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The result code.
   * @return resultCode
  **/
  @ApiModelProperty(value = "The result code.")
  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultCode() {
    return resultCode;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public CloseAccountResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The new status of the account. &gt;Permitted values: &#x60;Active&#x60;, &#x60;Inactive&#x60;, &#x60;Suspended&#x60;, &#x60;Closed&#x60;.
   * @return status
  **/
  @ApiModelProperty(value = "The new status of the account. >Permitted values: `Active`, `Inactive`, `Suspended`, `Closed`.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this CloseAccountResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloseAccountResponse closeAccountResponse = (CloseAccountResponse) o;
    return Objects.equals(this.accountCode, closeAccountResponse.accountCode) &&
        Objects.equals(this.invalidFields, closeAccountResponse.invalidFields) &&
        Objects.equals(this.pspReference, closeAccountResponse.pspReference) &&
        Objects.equals(this.resultCode, closeAccountResponse.resultCode) &&
        Objects.equals(this.status, closeAccountResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCode, invalidFields, pspReference, resultCode, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloseAccountResponse {\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
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

/**
   * Create an instance of CloseAccountResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloseAccountResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to CloseAccountResponse
   */
  public static CloseAccountResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CloseAccountResponse.class);
  }
/**
  * Convert an instance of CloseAccountResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
