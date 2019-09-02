package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountRetrieveOutputModelCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
 */
public class BQParticipantAccountRetrieveOutputModelCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord   {
  private String productServiceReference = null;

  private String customerReference = null;

  private String partyReference = null;

  private String facilityTerms = null;

  private String participantAcquirerBankReference = null;

  private String participantAcquirerBankClearingandSettlementTerms = null;

  private String participantAcquirerBankServiceSchedule = null;

  private String participantIssuerBankReference = null;

  private String participantIssuerBankClearingandSettlementTerms = null;

  private String participantIssuerBankServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the participant facility product instance 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the participant primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the legal entity (typically the customer) 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Acquiring bank for which the Network orchestrates clearing and settlement processing 
   * @return participantAcquirerBankReference
  **/

  public String getParticipantAcquirerBankReference() {
    return participantAcquirerBankReference;
  }

  public void setParticipantAcquirerBankReference(String participantAcquirerBankReference) {
    this.participantAcquirerBankReference = participantAcquirerBankReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issuing bank for which the Network orchestrates clearing and settlement processing 
   * @return participantIssuerBankReference
  **/

  public String getParticipantIssuerBankReference() {
    return participantIssuerBankReference;
  }

  public void setParticipantIssuerBankReference(String participantIssuerBankReference) {
    this.participantIssuerBankReference = participantIssuerBankReference;
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

