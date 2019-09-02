package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModelCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
 */
public class CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModelCRCardNetworkParticipantFacilityInstanceRecord   {
  private String facilityTerms = null;

  private String participantAcquirerBankClearingandSettlementTerms = null;

  private String participantAcquirerBankServiceSchedule = null;

  private String participantIssuerBankClearingandSettlementTerms = null;

  private String participantIssuerBankServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The operational configuration terms/options that govern the participant facility arrangement 
   * @return facilityTerms
  **/

  public String getFacilityTerms() {
    return facilityTerms;
  }

  public void setFacilityTerms(String facilityTerms) {
    this.facilityTerms = facilityTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the card clearing fees/terms in force  
   * @return participantAcquirerBankClearingandSettlementTerms
  **/

  public String getParticipantAcquirerBankClearingandSettlementTerms() {
    return participantAcquirerBankClearingandSettlementTerms;
  }

  public void setParticipantAcquirerBankClearingandSettlementTerms(String participantAcquirerBankClearingandSettlementTerms) {
    this.participantAcquirerBankClearingandSettlementTerms = participantAcquirerBankClearingandSettlementTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the tasks and processing schedule for the participant  
   * @return participantAcquirerBankServiceSchedule
  **/

  public String getParticipantAcquirerBankServiceSchedule() {
    return participantAcquirerBankServiceSchedule;
  }

  public void setParticipantAcquirerBankServiceSchedule(String participantAcquirerBankServiceSchedule) {
    this.participantAcquirerBankServiceSchedule = participantAcquirerBankServiceSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the card clearing fees/terms in force  
   * @return participantIssuerBankClearingandSettlementTerms
  **/

  public String getParticipantIssuerBankClearingandSettlementTerms() {
    return participantIssuerBankClearingandSettlementTerms;
  }

  public void setParticipantIssuerBankClearingandSettlementTerms(String participantIssuerBankClearingandSettlementTerms) {
    this.participantIssuerBankClearingandSettlementTerms = participantIssuerBankClearingandSettlementTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the tasks and processing schedule for the participant)  
   * @return participantIssuerBankServiceSchedule
  **/

  public String getParticipantIssuerBankServiceSchedule() {
    return participantIssuerBankServiceSchedule;
  }

  public void setParticipantIssuerBankServiceSchedule(String participantIssuerBankServiceSchedule) {
    this.participantIssuerBankServiceSchedule = participantIssuerBankServiceSchedule;
  }


}

