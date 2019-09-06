package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModelCRCardNetworkParticipantFacilityInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModel
 */
public class CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModel   {
  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionReference = null;

  private Object cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionRecord = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceStatus = null;

  private CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModelCRCardNetworkParticipantFacilityInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card Network Participant Facility Fulfillment Arrangement instance 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInstanceReference() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceReference(String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference = cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionReference
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInitiateActionReference() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionReference;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInitiateActionReference(String cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionReference) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionReference = cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionRecord
  **/

  public Object getCardNetworkParticipantFacilityFulfillmentArrangementInitiateActionRecord() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionRecord;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInitiateActionRecord(Object cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionRecord) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionRecord = cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Card Network Participant Facility Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceStatus
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInstanceStatus() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceStatus;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceStatus(String cardNetworkParticipantFacilityFulfillmentArrangementInstanceStatus) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceStatus = cardNetworkParticipantFacilityFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
   * @return cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
  **/

  public CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModelCRCardNetworkParticipantFacilityInstanceRecord getCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord() {
    return cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }
  
  @JsonProperty("cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord")
  public void setCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord(CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModelCRCardNetworkParticipantFacilityInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord) {
    this.cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }


}

