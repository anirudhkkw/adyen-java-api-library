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
import com.adyen.model.terminal.OutputResult;
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
 * It conveys the result of the display, parallel to the message request, except if response not required and absent. Content of the Display Response message.
 */
@ApiModel(description = "It conveys the result of the display, parallel to the message request, except if response not required and absent. Content of the Display Response message.")
@JsonPropertyOrder({
  DisplayResponse.JSON_PROPERTY_OUTPUT_RESULT
})

public class DisplayResponse {
  public static final String JSON_PROPERTY_OUTPUT_RESULT = "OutputResult";
  private List<OutputResult> outputResult = new ArrayList<>();

  public DisplayResponse() { 
  }

  public DisplayResponse outputResult(List<OutputResult> outputResult) {
    this.outputResult = outputResult;
    return this;
  }

  public DisplayResponse addOutputResultItem(OutputResult outputResultItem) {
    this.outputResult.add(outputResultItem);
    return this;
  }

   /**
   * Get outputResult
   * @return outputResult
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OUTPUT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OutputResult> getOutputResult() {
    return outputResult;
  }


 /**
  * outputResult
  *
  * @param outputResult
  */ 
  @JsonProperty(JSON_PROPERTY_OUTPUT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputResult(List<OutputResult> outputResult) {
    this.outputResult = outputResult;
  }


  /**
   * Return true if this DisplayResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayResponse displayResponse = (DisplayResponse) o;
    return Objects.equals(this.outputResult, displayResponse.outputResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayResponse {\n");
    sb.append("    outputResult: ").append(toIndentedString(outputResult)).append("\n");
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
   * Create an instance of DisplayResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DisplayResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to DisplayResponse
   */
  public static DisplayResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DisplayResponse.class);
  }
/**
  * Convert an instance of DisplayResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

