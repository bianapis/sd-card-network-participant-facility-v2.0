package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction
 */
public class BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction   {
  private String networkParticipantFacilityAccountPostingPurpose = null;

  private String networkParticipantFacilityAccountPostingAmount = null;

  private String networkParticipantFacilityAccountPostingValueDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Annotation of the reason for the positing (e.g. posting for fees, chargebacks, settlement) 
   * @return networkParticipantFacilityAccountPostingPurpose
  **/

  public String getNetworkParticipantFacilityAccountPostingPurpose() {
    return networkParticipantFacilityAccountPostingPurpose;
  }

  public void setNetworkParticipantFacilityAccountPostingPurpose(String networkParticipantFacilityAccountPostingPurpose) {
    this.networkParticipantFacilityAccountPostingPurpose = networkParticipantFacilityAccountPostingPurpose;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Posted amount (probably captured as a credit/debit pair) 
   * @return networkParticipantFacilityAccountPostingAmount
  **/

  public String getNetworkParticipantFacilityAccountPostingAmount() {
    return networkParticipantFacilityAccountPostingAmount;
  }

  public void setNetworkParticipantFacilityAccountPostingAmount(String networkParticipantFacilityAccountPostingAmount) {
    this.networkParticipantFacilityAccountPostingAmount = networkParticipantFacilityAccountPostingAmount;
  }


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


}

