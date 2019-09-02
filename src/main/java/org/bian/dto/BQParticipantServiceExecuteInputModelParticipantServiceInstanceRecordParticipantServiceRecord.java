package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecordParticipantServiceRecord
 */
public class BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecordParticipantServiceRecord   {
  private String networkParticipantServiceType = null;

  private String networkParticipantServiceDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of request (e.g. merchant alert, chargeback arbitration, chargeback reduction) 
   * @return networkParticipantServiceType
  **/

  public String getNetworkParticipantServiceType() {
    return networkParticipantServiceType;
  }

  public void setNetworkParticipantServiceType(String networkParticipantServiceType) {
    this.networkParticipantServiceType = networkParticipantServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Key dates and times associated with the provision of the service (e.g. initiation of service fulfillment) 
   * @return networkParticipantServiceDateTime
  **/

  public String getNetworkParticipantServiceDateTime() {
    return networkParticipantServiceDateTime;
  }

  public void setNetworkParticipantServiceDateTime(String networkParticipantServiceDateTime) {
    this.networkParticipantServiceDateTime = networkParticipantServiceDateTime;
  }


}

