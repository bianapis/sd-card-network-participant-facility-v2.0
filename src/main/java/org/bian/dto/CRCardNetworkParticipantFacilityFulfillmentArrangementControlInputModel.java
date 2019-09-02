package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardNetworkParticipantFacilityFulfillmentArrangementControlInputModelCardNetworkParticipantFacilityControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCardNetworkParticipantFacilityFulfillmentArrangementControlInputModel
 */
public class CRCardNetworkParticipantFacilityFulfillmentArrangementControlInputModel   {
  private String cardNetworkParticipantFacilityServicingSessionReference = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference = null;

  private Object cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskRecord = null;

  private CRCardNetworkParticipantFacilityFulfillmentArrangementControlInputModelCardNetworkParticipantFacilityControlActionRequest cardNetworkParticipantFacilityFulfillmentArrangementControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskRecord() {
    return cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskRecord(Object cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskRecord) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskRecord = cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * Get cardNetworkParticipantFacilityFulfillmentArrangementControlActionRequest
   * @return cardNetworkParticipantFacilityFulfillmentArrangementControlActionRequest
  **/

  public CRCardNetworkParticipantFacilityFulfillmentArrangementControlInputModelCardNetworkParticipantFacilityControlActionRequest getCardNetworkParticipantFacilityFulfillmentArrangementControlActionRequest() {
    return cardNetworkParticipantFacilityFulfillmentArrangementControlActionRequest;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementControlActionRequest(CRCardNetworkParticipantFacilityFulfillmentArrangementControlInputModelCardNetworkParticipantFacilityControlActionRequest cardNetworkParticipantFacilityFulfillmentArrangementControlActionRequest) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementControlActionRequest = cardNetworkParticipantFacilityFulfillmentArrangementControlActionRequest;
  }


}

