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
 * Empty. Content of the Logout Request message.
 */
@ApiModel(description = "Empty. Content of the Logout Request message.")
@JsonPropertyOrder({
  LogoutRequest.JSON_PROPERTY_MAINTENANCE_ALLOWED
})

public class LogoutRequest {
  public static final String JSON_PROPERTY_MAINTENANCE_ALLOWED = "MaintenanceAllowed";
  private Boolean maintenanceAllowed = false;

  public LogoutRequest() { 
  }

  public LogoutRequest maintenanceAllowed(Boolean maintenanceAllowed) {
    this.maintenanceAllowed = maintenanceAllowed;
    return this;
  }

   /**
   * Get maintenanceAllowed
   * @return maintenanceAllowed
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMaintenanceAllowed() {
    return maintenanceAllowed;
  }


 /**
  * maintenanceAllowed
  *
  * @param maintenanceAllowed
  */ 
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaintenanceAllowed(Boolean maintenanceAllowed) {
    this.maintenanceAllowed = maintenanceAllowed;
  }


  /**
   * Return true if this LogoutRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogoutRequest logoutRequest = (LogoutRequest) o;
    return Objects.equals(this.maintenanceAllowed, logoutRequest.maintenanceAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenanceAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogoutRequest {\n");
    sb.append("    maintenanceAllowed: ").append(toIndentedString(maintenanceAllowed)).append("\n");
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
   * Create an instance of LogoutRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LogoutRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to LogoutRequest
   */
  public static LogoutRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, LogoutRequest.class);
  }
/**
  * Convert an instance of LogoutRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

