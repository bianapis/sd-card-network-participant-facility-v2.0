package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModelCRCardNetworkParticipantFacilityInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModel
 */
public class CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModel   {
  private String cardNetworkParticipantFacilityServicingSessionReference = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference = null;

  private CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModelCRCardNetworkParticipantFacilityInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = null;

  private Object cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
   * @return cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
  **/

  public CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModelCRCardNetworkParticipantFacilityInstanceRecord getCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord() {
    return cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord(CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModelCRCardNetworkParticipantFacilityInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord) {
    this.cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord() {
    return cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord(Object cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord = cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

