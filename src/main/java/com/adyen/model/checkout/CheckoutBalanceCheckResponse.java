/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.checkout.Amount;
import com.adyen.model.checkout.FraudResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.checkout.JSON;

/**
 * CheckoutBalanceCheckResponse
 */

public class CheckoutBalanceCheckResponse {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = null;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Amount balance;

  public static final String SERIALIZED_NAME_FRAUD_RESULT = "fraudResult";
  @SerializedName(SERIALIZED_NAME_FRAUD_RESULT)
  private FraudResult fraudResult;

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public static final String SERIALIZED_NAME_REFUSAL_REASON = "refusalReason";
  @SerializedName(SERIALIZED_NAME_REFUSAL_REASON)
  private String refusalReason;

  /**
   * The result of the cancellation request.  Possible values:  * **Success** – Indicates that the balance check was successful. * **NotEnoughBalance** – Commonly indicates that the card did not have enough balance to pay the amount in the request, or that the currency of the balance on the card did not match the currency of the requested amount. * **Failed** – Indicates that the balance check failed.
   */
  @JsonAdapter(ResultCodeEnum.Adapter.class)
  public enum ResultCodeEnum {
    SUCCESS("Success"),
    
    NOTENOUGHBALANCE("NotEnoughBalance"),
    
    FAILED("Failed");

    private String value;

    ResultCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultCodeEnum fromValue(String value) {
      for (ResultCodeEnum b : ResultCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResultCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private ResultCodeEnum resultCode;

  public static final String SERIALIZED_NAME_TRANSACTION_LIMIT = "transactionLimit";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_LIMIT)
  private Amount transactionLimit;

  public CheckoutBalanceCheckResponse() { 
  }

  public CheckoutBalanceCheckResponse additionalData(Map<String, String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public CheckoutBalanceCheckResponse putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * Contains additional information about the payment. Some data fields are included only if you select them first: Go to **Customer Area** &gt; **Developers** &gt; **Additional data**.
   * @return additionalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains additional information about the payment. Some data fields are included only if you select them first: Go to **Customer Area** > **Developers** > **Additional data**.")

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public CheckoutBalanceCheckResponse balance(Amount balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Amount getBalance() {
    return balance;
  }


  public void setBalance(Amount balance) {
    this.balance = balance;
  }


  public CheckoutBalanceCheckResponse fraudResult(FraudResult fraudResult) {
    
    this.fraudResult = fraudResult;
    return this;
  }

   /**
   * Get fraudResult
   * @return fraudResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudResult getFraudResult() {
    return fraudResult;
  }


  public void setFraudResult(FraudResult fraudResult) {
    this.fraudResult = fraudResult;
  }


  public CheckoutBalanceCheckResponse pspReference(String pspReference) {
    
    this.pspReference = pspReference;
    return this;
  }

   /**
   * Adyen&#39;s 16-character reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.
   * @return pspReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Adyen's 16-character reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.")

  public String getPspReference() {
    return pspReference;
  }


  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public CheckoutBalanceCheckResponse refusalReason(String refusalReason) {
    
    this.refusalReason = refusalReason;
    return this;
  }

   /**
   * If the payment&#39;s authorisation is refused or an error occurs during authorisation, this field holds Adyen&#39;s mapped reason for the refusal or a description of the error. When a transaction fails, the authorisation response includes &#x60;resultCode&#x60; and &#x60;refusalReason&#x60; values.  For more information, see [Refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons).
   * @return refusalReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the payment's authorisation is refused or an error occurs during authorisation, this field holds Adyen's mapped reason for the refusal or a description of the error. When a transaction fails, the authorisation response includes `resultCode` and `refusalReason` values.  For more information, see [Refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons).")

  public String getRefusalReason() {
    return refusalReason;
  }


  public void setRefusalReason(String refusalReason) {
    this.refusalReason = refusalReason;
  }


  public CheckoutBalanceCheckResponse resultCode(ResultCodeEnum resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The result of the cancellation request.  Possible values:  * **Success** – Indicates that the balance check was successful. * **NotEnoughBalance** – Commonly indicates that the card did not have enough balance to pay the amount in the request, or that the currency of the balance on the card did not match the currency of the requested amount. * **Failed** – Indicates that the balance check failed.
   * @return resultCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The result of the cancellation request.  Possible values:  * **Success** – Indicates that the balance check was successful. * **NotEnoughBalance** – Commonly indicates that the card did not have enough balance to pay the amount in the request, or that the currency of the balance on the card did not match the currency of the requested amount. * **Failed** – Indicates that the balance check failed.")

  public ResultCodeEnum getResultCode() {
    return resultCode;
  }


  public void setResultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
  }


  public CheckoutBalanceCheckResponse transactionLimit(Amount transactionLimit) {
    
    this.transactionLimit = transactionLimit;
    return this;
  }

   /**
   * Get transactionLimit
   * @return transactionLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getTransactionLimit() {
    return transactionLimit;
  }


  public void setTransactionLimit(Amount transactionLimit) {
    this.transactionLimit = transactionLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutBalanceCheckResponse checkoutBalanceCheckResponse = (CheckoutBalanceCheckResponse) o;
    return Objects.equals(this.additionalData, checkoutBalanceCheckResponse.additionalData) &&
        Objects.equals(this.balance, checkoutBalanceCheckResponse.balance) &&
        Objects.equals(this.fraudResult, checkoutBalanceCheckResponse.fraudResult) &&
        Objects.equals(this.pspReference, checkoutBalanceCheckResponse.pspReference) &&
        Objects.equals(this.refusalReason, checkoutBalanceCheckResponse.refusalReason) &&
        Objects.equals(this.resultCode, checkoutBalanceCheckResponse.resultCode) &&
        Objects.equals(this.transactionLimit, checkoutBalanceCheckResponse.transactionLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, balance, fraudResult, pspReference, refusalReason, resultCode, transactionLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutBalanceCheckResponse {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    fraudResult: ").append(toIndentedString(fraudResult)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    refusalReason: ").append(toIndentedString(refusalReason)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    transactionLimit: ").append(toIndentedString(transactionLimit)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("additionalData");
    openapiFields.add("balance");
    openapiFields.add("fraudResult");
    openapiFields.add("pspReference");
    openapiFields.add("refusalReason");
    openapiFields.add("resultCode");
    openapiFields.add("transactionLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("resultCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckoutBalanceCheckResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CheckoutBalanceCheckResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckoutBalanceCheckResponse is not found in the empty JSON string", CheckoutBalanceCheckResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CheckoutBalanceCheckResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckoutBalanceCheckResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckoutBalanceCheckResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `balance`
      if (jsonObj.getAsJsonObject("balance") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("balance"));
      }
      // validate the optional field `fraudResult`
      if (jsonObj.getAsJsonObject("fraudResult") != null) {
        FraudResult.validateJsonObject(jsonObj.getAsJsonObject("fraudResult"));
      }
      // validate the optional field pspReference
      if (jsonObj.get("pspReference") != null && !jsonObj.get("pspReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pspReference").toString()));
      }
      // validate the optional field refusalReason
      if (jsonObj.get("refusalReason") != null && !jsonObj.get("refusalReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refusalReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refusalReason").toString()));
      }
      // ensure the field resultCode can be parsed to an enum value
      if (jsonObj.get("resultCode") != null) {
        if(!jsonObj.get("resultCode").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `resultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultCode").toString()));
        }
        ResultCodeEnum.fromValue(jsonObj.get("resultCode").getAsString());
      }
      // validate the optional field `transactionLimit`
      if (jsonObj.getAsJsonObject("transactionLimit") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("transactionLimit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckoutBalanceCheckResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckoutBalanceCheckResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckoutBalanceCheckResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckoutBalanceCheckResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckoutBalanceCheckResponse>() {
           @Override
           public void write(JsonWriter out, CheckoutBalanceCheckResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckoutBalanceCheckResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckoutBalanceCheckResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckoutBalanceCheckResponse
  * @throws IOException if the JSON string is invalid with respect to CheckoutBalanceCheckResponse
  */
  public static CheckoutBalanceCheckResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckoutBalanceCheckResponse.class);
  }

 /**
  * Convert an instance of CheckoutBalanceCheckResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

