package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardNetworkParticipantFacilityFulfillmentArrangementControlOutputModel
 */
public class CRCardNetworkParticipantFacilityFulfillmentArrangementControlOutputModel   {
  private String cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskReference = null;

  private Object cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskRecord = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Network Participant Facility Fulfillment Arrangement instance control processing service call 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskReference
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskReference() {
    return cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskReference;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskReference(String cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskReference) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskReference = cardNetworkParticipantFacilityFulfillmentArrangementControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementControlActionResponse
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementControlActionResponse() {
    return cardNetworkParticipantFacilityFulfillmentArrangementControlActionResponse;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementControlActionResponse(String cardNetworkParticipantFacilityFulfillmentArrangementControlActionResponse) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementControlActionResponse = cardNetworkParticipantFacilityFulfillmentArrangementControlActionResponse;
  }


}

