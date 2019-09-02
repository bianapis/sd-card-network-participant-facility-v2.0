package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateInputModelCRCardNetworkParticipantFacilityInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateInputModel
 */
public class CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateInputModel   {
  private String cardNetworkParticipantFacilityServicingSessionReference = null;

  private Object cardNetworkParticipantFacilityFulfillmentArrangementInitiateActionRecord = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceStatus = null;

  private CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateInputModelCRCardNetworkParticipantFacilityInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardNetworkParticipantFacilityServicingSessionReference
  **/

  public String getCardNetworkParticipantFacilityServicingSessionReference() {
    return cardNetworkParticipantFacilityServicingSessionReference;
  }

  public void setCardNetworkParticipantFacilityServicingSessionReference(String cardNetworkParticipantFacilityServicingSessionReference) {
    this.cardNetworkParticipantFacilityServicingSessionReference = cardNetworkParticipantFacilityServicingSessionReference;
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

  public CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateInputModelCRCardNetworkParticipantFacilityInstanceRecord getCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord() {
    return cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord(CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateInputModelCRCardNetworkParticipantFacilityInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord) {
    this.cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }


}

