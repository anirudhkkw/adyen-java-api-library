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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * ThreeDSRequestorPriorAuthenticationInfo
 */

public class ThreeDSRequestorPriorAuthenticationInfo {
  public static final String SERIALIZED_NAME_THREE_D_S_REQ_PRIOR_AUTH_DATA = "threeDSReqPriorAuthData";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_REQ_PRIOR_AUTH_DATA)
  private String threeDSReqPriorAuthData;

  /**
   * Mechanism used by the Cardholder to previously authenticate to the 3DS Requestor. Allowed values: * **01** — Frictionless authentication occurred by ACS. * **02** — Cardholder challenge occurred by ACS. * **03** — AVS verified. * **04** — Other issuer methods.
   */
  @JsonAdapter(ThreeDSReqPriorAuthMethodEnum.Adapter.class)
  public enum ThreeDSReqPriorAuthMethodEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04");

    private String value;

    ThreeDSReqPriorAuthMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ThreeDSReqPriorAuthMethodEnum fromValue(String value) {
      for (ThreeDSReqPriorAuthMethodEnum b : ThreeDSReqPriorAuthMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ThreeDSReqPriorAuthMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ThreeDSReqPriorAuthMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ThreeDSReqPriorAuthMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ThreeDSReqPriorAuthMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_THREE_D_S_REQ_PRIOR_AUTH_METHOD = "threeDSReqPriorAuthMethod";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_REQ_PRIOR_AUTH_METHOD)
  private ThreeDSReqPriorAuthMethodEnum threeDSReqPriorAuthMethod;

  public static final String SERIALIZED_NAME_THREE_D_S_REQ_PRIOR_AUTH_TIMESTAMP = "threeDSReqPriorAuthTimestamp";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_REQ_PRIOR_AUTH_TIMESTAMP)
  private String threeDSReqPriorAuthTimestamp;

  public static final String SERIALIZED_NAME_THREE_D_S_REQ_PRIOR_REF = "threeDSReqPriorRef";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_REQ_PRIOR_REF)
  private String threeDSReqPriorRef;

  public ThreeDSRequestorPriorAuthenticationInfo() { 
  }

  public ThreeDSRequestorPriorAuthenticationInfo threeDSReqPriorAuthData(String threeDSReqPriorAuthData) {
    
    this.threeDSReqPriorAuthData = threeDSReqPriorAuthData;
    return this;
  }

   /**
   * Data that documents and supports a specific authentication process. Maximum length: 2048 bytes.
   * @return threeDSReqPriorAuthData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data that documents and supports a specific authentication process. Maximum length: 2048 bytes.")

  public String getThreeDSReqPriorAuthData() {
    return threeDSReqPriorAuthData;
  }


  public void setThreeDSReqPriorAuthData(String threeDSReqPriorAuthData) {
    this.threeDSReqPriorAuthData = threeDSReqPriorAuthData;
  }


  public ThreeDSRequestorPriorAuthenticationInfo threeDSReqPriorAuthMethod(ThreeDSReqPriorAuthMethodEnum threeDSReqPriorAuthMethod) {
    
    this.threeDSReqPriorAuthMethod = threeDSReqPriorAuthMethod;
    return this;
  }

   /**
   * Mechanism used by the Cardholder to previously authenticate to the 3DS Requestor. Allowed values: * **01** — Frictionless authentication occurred by ACS. * **02** — Cardholder challenge occurred by ACS. * **03** — AVS verified. * **04** — Other issuer methods.
   * @return threeDSReqPriorAuthMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mechanism used by the Cardholder to previously authenticate to the 3DS Requestor. Allowed values: * **01** — Frictionless authentication occurred by ACS. * **02** — Cardholder challenge occurred by ACS. * **03** — AVS verified. * **04** — Other issuer methods.")

  public ThreeDSReqPriorAuthMethodEnum getThreeDSReqPriorAuthMethod() {
    return threeDSReqPriorAuthMethod;
  }


  public void setThreeDSReqPriorAuthMethod(ThreeDSReqPriorAuthMethodEnum threeDSReqPriorAuthMethod) {
    this.threeDSReqPriorAuthMethod = threeDSReqPriorAuthMethod;
  }


  public ThreeDSRequestorPriorAuthenticationInfo threeDSReqPriorAuthTimestamp(String threeDSReqPriorAuthTimestamp) {
    
    this.threeDSReqPriorAuthTimestamp = threeDSReqPriorAuthTimestamp;
    return this;
  }

   /**
   * Date and time in UTC of the prior cardholder authentication. Format: YYYYMMDDHHMM
   * @return threeDSReqPriorAuthTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time in UTC of the prior cardholder authentication. Format: YYYYMMDDHHMM")

  public String getThreeDSReqPriorAuthTimestamp() {
    return threeDSReqPriorAuthTimestamp;
  }


  public void setThreeDSReqPriorAuthTimestamp(String threeDSReqPriorAuthTimestamp) {
    this.threeDSReqPriorAuthTimestamp = threeDSReqPriorAuthTimestamp;
  }


  public ThreeDSRequestorPriorAuthenticationInfo threeDSReqPriorRef(String threeDSReqPriorRef) {
    
    this.threeDSReqPriorRef = threeDSReqPriorRef;
    return this;
  }

   /**
   * This data element provides additional information to the ACS to determine the best approach for handing a request. This data element contains an ACS Transaction ID for a prior authenticated transaction. For example, the first recurring transaction that was authenticated with the cardholder. Length: 30 characters.
   * @return threeDSReqPriorRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This data element provides additional information to the ACS to determine the best approach for handing a request. This data element contains an ACS Transaction ID for a prior authenticated transaction. For example, the first recurring transaction that was authenticated with the cardholder. Length: 30 characters.")

  public String getThreeDSReqPriorRef() {
    return threeDSReqPriorRef;
  }


  public void setThreeDSReqPriorRef(String threeDSReqPriorRef) {
    this.threeDSReqPriorRef = threeDSReqPriorRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSRequestorPriorAuthenticationInfo threeDSRequestorPriorAuthenticationInfo = (ThreeDSRequestorPriorAuthenticationInfo) o;
    return Objects.equals(this.threeDSReqPriorAuthData, threeDSRequestorPriorAuthenticationInfo.threeDSReqPriorAuthData) &&
        Objects.equals(this.threeDSReqPriorAuthMethod, threeDSRequestorPriorAuthenticationInfo.threeDSReqPriorAuthMethod) &&
        Objects.equals(this.threeDSReqPriorAuthTimestamp, threeDSRequestorPriorAuthenticationInfo.threeDSReqPriorAuthTimestamp) &&
        Objects.equals(this.threeDSReqPriorRef, threeDSRequestorPriorAuthenticationInfo.threeDSReqPriorRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDSReqPriorAuthData, threeDSReqPriorAuthMethod, threeDSReqPriorAuthTimestamp, threeDSReqPriorRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSRequestorPriorAuthenticationInfo {\n");
    sb.append("    threeDSReqPriorAuthData: ").append(toIndentedString(threeDSReqPriorAuthData)).append("\n");
    sb.append("    threeDSReqPriorAuthMethod: ").append(toIndentedString(threeDSReqPriorAuthMethod)).append("\n");
    sb.append("    threeDSReqPriorAuthTimestamp: ").append(toIndentedString(threeDSReqPriorAuthTimestamp)).append("\n");
    sb.append("    threeDSReqPriorRef: ").append(toIndentedString(threeDSReqPriorRef)).append("\n");
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
    openapiFields.add("threeDSReqPriorAuthData");
    openapiFields.add("threeDSReqPriorAuthMethod");
    openapiFields.add("threeDSReqPriorAuthTimestamp");
    openapiFields.add("threeDSReqPriorRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDSRequestorPriorAuthenticationInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ThreeDSRequestorPriorAuthenticationInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDSRequestorPriorAuthenticationInfo is not found in the empty JSON string", ThreeDSRequestorPriorAuthenticationInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ThreeDSRequestorPriorAuthenticationInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThreeDSRequestorPriorAuthenticationInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field threeDSReqPriorAuthData
      if (jsonObj.get("threeDSReqPriorAuthData") != null && !jsonObj.get("threeDSReqPriorAuthData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSReqPriorAuthData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSReqPriorAuthData").toString()));
      }
      // ensure the field threeDSReqPriorAuthMethod can be parsed to an enum value
      if (jsonObj.get("threeDSReqPriorAuthMethod") != null) {
        if(!jsonObj.get("threeDSReqPriorAuthMethod").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `threeDSReqPriorAuthMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSReqPriorAuthMethod").toString()));
        }
        ThreeDSReqPriorAuthMethodEnum.fromValue(jsonObj.get("threeDSReqPriorAuthMethod").getAsString());
      }
      // validate the optional field threeDSReqPriorAuthTimestamp
      if (jsonObj.get("threeDSReqPriorAuthTimestamp") != null && !jsonObj.get("threeDSReqPriorAuthTimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSReqPriorAuthTimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSReqPriorAuthTimestamp").toString()));
      }
      // validate the optional field threeDSReqPriorRef
      if (jsonObj.get("threeDSReqPriorRef") != null && !jsonObj.get("threeDSReqPriorRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSReqPriorRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSReqPriorRef").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDSRequestorPriorAuthenticationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDSRequestorPriorAuthenticationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDSRequestorPriorAuthenticationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDSRequestorPriorAuthenticationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDSRequestorPriorAuthenticationInfo>() {
           @Override
           public void write(JsonWriter out, ThreeDSRequestorPriorAuthenticationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDSRequestorPriorAuthenticationInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThreeDSRequestorPriorAuthenticationInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreeDSRequestorPriorAuthenticationInfo
  * @throws IOException if the JSON string is invalid with respect to ThreeDSRequestorPriorAuthenticationInfo
  */
  public static ThreeDSRequestorPriorAuthenticationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreeDSRequestorPriorAuthenticationInfo.class);
  }

 /**
  * Convert an instance of ThreeDSRequestorPriorAuthenticationInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

