package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction
 */
public class BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction   {
  private String networkParticipantFacilityAccountPostingValueDate = null;

  private String networkParticipantFacilityAccountPostingResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The value date for the posting 
   * @return networkParticipantFacilityAccountPostingValueDate
  **/

  public String getNetworkParticipantFacilityAccountPostingValueDate() {
    return networkParticipantFacilityAccountPostingValueDate;
  }

  public void setNetworkParticipantFacilityAccountPostingValueDate(String networkParticipantFacilityAccountPostingValueDate) {
    this.networkParticipantFacilityAccountPostingValueDate = networkParticipantFacilityAccountPostingValueDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Confirmation of the posting action 
   * @return networkParticipantFacilityAccountPostingResult
  **/

  public String getNetworkParticipantFacilityAccountPostingResult() {
    return networkParticipantFacilityAccountPostingResult;
  }

  public void setNetworkParticipantFacilityAccountPostingResult(String networkParticipantFacilityAccountPostingResult) {
    this.networkParticipantFacilityAccountPostingResult = networkParticipantFacilityAccountPostingResult;
  }


}

