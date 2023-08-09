/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
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
 * SDKEphemPubKey
 */
@JsonPropertyOrder({
  SDKEphemPubKey.JSON_PROPERTY_CRV,
  SDKEphemPubKey.JSON_PROPERTY_KTY,
  SDKEphemPubKey.JSON_PROPERTY_X,
  SDKEphemPubKey.JSON_PROPERTY_Y
})

public class SDKEphemPubKey {
  public static final String JSON_PROPERTY_CRV = "crv";
  private String crv;

  public static final String JSON_PROPERTY_KTY = "kty";
  private String kty;

  public static final String JSON_PROPERTY_X = "x";
  private String x;

  public static final String JSON_PROPERTY_Y = "y";
  private String y;

  public SDKEphemPubKey() { 
  }

  public SDKEphemPubKey crv(String crv) {
    this.crv = crv;
    return this;
  }

   /**
   * The &#x60;crv&#x60; value as received from the 3D Secure 2 SDK.
   * @return crv
  **/
  @ApiModelProperty(value = "The `crv` value as received from the 3D Secure 2 SDK.")
  @JsonProperty(JSON_PROPERTY_CRV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCrv() {
    return crv;
  }


  @JsonProperty(JSON_PROPERTY_CRV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrv(String crv) {
    this.crv = crv;
  }


  public SDKEphemPubKey kty(String kty) {
    this.kty = kty;
    return this;
  }

   /**
   * The &#x60;kty&#x60; value as received from the 3D Secure 2 SDK.
   * @return kty
  **/
  @ApiModelProperty(value = "The `kty` value as received from the 3D Secure 2 SDK.")
  @JsonProperty(JSON_PROPERTY_KTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKty() {
    return kty;
  }


  @JsonProperty(JSON_PROPERTY_KTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKty(String kty) {
    this.kty = kty;
  }


  public SDKEphemPubKey x(String x) {
    this.x = x;
    return this;
  }

   /**
   * The &#x60;x&#x60; value as received from the 3D Secure 2 SDK.
   * @return x
  **/
  @ApiModelProperty(value = "The `x` value as received from the 3D Secure 2 SDK.")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getX() {
    return x;
  }


  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setX(String x) {
    this.x = x;
  }


  public SDKEphemPubKey y(String y) {
    this.y = y;
    return this;
  }

   /**
   * The &#x60;y&#x60; value as received from the 3D Secure 2 SDK.
   * @return y
  **/
  @ApiModelProperty(value = "The `y` value as received from the 3D Secure 2 SDK.")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getY() {
    return y;
  }


  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setY(String y) {
    this.y = y;
  }


  /**
   * Return true if this SDKEphemPubKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDKEphemPubKey sdKEphemPubKey = (SDKEphemPubKey) o;
    return Objects.equals(this.crv, sdKEphemPubKey.crv) &&
        Objects.equals(this.kty, sdKEphemPubKey.kty) &&
        Objects.equals(this.x, sdKEphemPubKey.x) &&
        Objects.equals(this.y, sdKEphemPubKey.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crv, kty, x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDKEphemPubKey {\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
   * Create an instance of SDKEphemPubKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SDKEphemPubKey
   * @throws JsonProcessingException if the JSON string is invalid with respect to SDKEphemPubKey
   */
  public static SDKEphemPubKey fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SDKEphemPubKey.class);
  }
/**
  * Convert an instance of SDKEphemPubKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
