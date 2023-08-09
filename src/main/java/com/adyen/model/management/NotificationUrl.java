/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.Url;
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
 * NotificationUrl
 */
@JsonPropertyOrder({
  NotificationUrl.JSON_PROPERTY_LOCAL_URLS,
  NotificationUrl.JSON_PROPERTY_PUBLIC_URLS
})

public class NotificationUrl {
  public static final String JSON_PROPERTY_LOCAL_URLS = "localUrls";
  private List<Url> localUrls = null;

  public static final String JSON_PROPERTY_PUBLIC_URLS = "publicUrls";
  private List<Url> publicUrls = null;

  public NotificationUrl() { 
  }

  public NotificationUrl localUrls(List<Url> localUrls) {
    this.localUrls = localUrls;
    return this;
  }

  public NotificationUrl addLocalUrlsItem(Url localUrlsItem) {
    if (this.localUrls == null) {
      this.localUrls = new ArrayList<>();
    }
    this.localUrls.add(localUrlsItem);
    return this;
  }

   /**
   * One or more local URLs to send notifications to when using Terminal API.
   * @return localUrls
  **/
  @ApiModelProperty(value = "One or more local URLs to send notifications to when using Terminal API.")
  @JsonProperty(JSON_PROPERTY_LOCAL_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Url> getLocalUrls() {
    return localUrls;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalUrls(List<Url> localUrls) {
    this.localUrls = localUrls;
  }


  public NotificationUrl publicUrls(List<Url> publicUrls) {
    this.publicUrls = publicUrls;
    return this;
  }

  public NotificationUrl addPublicUrlsItem(Url publicUrlsItem) {
    if (this.publicUrls == null) {
      this.publicUrls = new ArrayList<>();
    }
    this.publicUrls.add(publicUrlsItem);
    return this;
  }

   /**
   * One or more public URLs to send notifications to when using Terminal API.
   * @return publicUrls
  **/
  @ApiModelProperty(value = "One or more public URLs to send notifications to when using Terminal API.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Url> getPublicUrls() {
    return publicUrls;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicUrls(List<Url> publicUrls) {
    this.publicUrls = publicUrls;
  }


  /**
   * Return true if this NotificationUrl object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationUrl notificationUrl = (NotificationUrl) o;
    return Objects.equals(this.localUrls, notificationUrl.localUrls) &&
        Objects.equals(this.publicUrls, notificationUrl.publicUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localUrls, publicUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationUrl {\n");
    sb.append("    localUrls: ").append(toIndentedString(localUrls)).append("\n");
    sb.append("    publicUrls: ").append(toIndentedString(publicUrls)).append("\n");
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
   * Create an instance of NotificationUrl given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotificationUrl
   * @throws JsonProcessingException if the JSON string is invalid with respect to NotificationUrl
   */
  public static NotificationUrl fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, NotificationUrl.class);
  }
/**
  * Convert an instance of NotificationUrl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
