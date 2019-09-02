package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountUpdateInputModel
 */
public class BQParticipantAccountUpdateInputModel   {
  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference = null;

  private String participantAccountInstanceReference = null;

  private BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord participantAccountInstanceRecord = null;

  private Object participantAccountUpdateActionTaskRecord = null;

  private String participantAccountUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Card Network Participant Facility Fulfillment Arrangement instance 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInstanceReference() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceReference(String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference = cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Participant Account instance 
   * @return participantAccountInstanceReference
  **/

  public String getParticipantAccountInstanceReference() {
    return participantAccountInstanceReference;
  }

  public void setParticipantAccountInstanceReference(String participantAccountInstanceReference) {
    this.participantAccountInstanceReference = participantAccountInstanceReference;
  }


  /**
   * Get participantAccountInstanceRecord
   * @return participantAccountInstanceRecord
  **/

  public BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord getParticipantAccountInstanceRecord() {
    return participantAccountInstanceRecord;
  }

  public void setParticipantAccountInstanceRecord(BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord participantAccountInstanceRecord) {
    this.participantAccountInstanceRecord = participantAccountInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return participantAccountUpdateActionTaskRecord
  **/

  public Object getParticipantAccountUpdateActionTaskRecord() {
    return participantAccountUpdateActionTaskRecord;
  }

  public void setParticipantAccountUpdateActionTaskRecord(Object participantAccountUpdateActionTaskRecord) {
    this.participantAccountUpdateActionTaskRecord = participantAccountUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return participantAccountUpdateActionRequest
  **/

  public String getParticipantAccountUpdateActionRequest() {
    return participantAccountUpdateActionRequest;
  }

  public void setParticipantAccountUpdateActionRequest(String participantAccountUpdateActionRequest) {
    this.participantAccountUpdateActionRequest = participantAccountUpdateActionRequest;
  }


}

