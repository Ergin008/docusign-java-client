package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class EventResult   {
  
  private String status = null;
  private String eventTimestamp = null;
  private String failureDescription = null;
  private String vendorFailureStatusCode = null;

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("eventTimestamp")
  public String getEventTimestamp() {
    return eventTimestamp;
  }
  public void setEventTimestamp(String eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("failureDescription")
  public String getFailureDescription() {
    return failureDescription;
  }
  public void setFailureDescription(String failureDescription) {
    this.failureDescription = failureDescription;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("vendorFailureStatusCode")
  public String getVendorFailureStatusCode() {
    return vendorFailureStatusCode;
  }
  public void setVendorFailureStatusCode(String vendorFailureStatusCode) {
    this.vendorFailureStatusCode = vendorFailureStatusCode;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventResult eventResult = (EventResult) o;
    return Objects.equals(status, eventResult.status) &&
        Objects.equals(eventTimestamp, eventResult.eventTimestamp) &&
        Objects.equals(failureDescription, eventResult.failureDescription) &&
        Objects.equals(vendorFailureStatusCode, eventResult.vendorFailureStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, eventTimestamp, failureDescription, vendorFailureStatusCode);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResult {\n");
    
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    eventTimestamp: ").append(StringUtil.toIndentedString(eventTimestamp)).append("\n");
    sb.append("    failureDescription: ").append(StringUtil.toIndentedString(failureDescription)).append("\n");
    sb.append("    vendorFailureStatusCode: ").append(StringUtil.toIndentedString(vendorFailureStatusCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
