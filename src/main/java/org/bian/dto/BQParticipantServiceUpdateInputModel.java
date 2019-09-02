package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceUpdateInputModel
 */
public class BQParticipantServiceUpdateInputModel   {
  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference = null;

  private String participantServiceInstanceReference = null;

  private BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord participantServiceInstanceRecord = null;

  private Object participantServiceUpdateActionTaskRecord = null;

  private String participantServiceUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Participant Service instance 
   * @return participantServiceInstanceReference
  **/

  public String getParticipantServiceInstanceReference() {
    return participantServiceInstanceReference;
  }

  public void setParticipantServiceInstanceReference(String participantServiceInstanceReference) {
    this.participantServiceInstanceReference = participantServiceInstanceReference;
  }


  /**
   * Get participantServiceInstanceRecord
   * @return participantServiceInstanceRecord
  **/

  public BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord getParticipantServiceInstanceRecord() {
    return participantServiceInstanceRecord;
  }

  public void setParticipantServiceInstanceRecord(BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord participantServiceInstanceRecord) {
    this.participantServiceInstanceRecord = participantServiceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return participantServiceUpdateActionTaskRecord
  **/

  public Object getParticipantServiceUpdateActionTaskRecord() {
    return participantServiceUpdateActionTaskRecord;
  }

  public void setParticipantServiceUpdateActionTaskRecord(Object participantServiceUpdateActionTaskRecord) {
    this.participantServiceUpdateActionTaskRecord = participantServiceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return participantServiceUpdateActionRequest
  **/

  public String getParticipantServiceUpdateActionRequest() {
    return participantServiceUpdateActionRequest;
  }

  public void setParticipantServiceUpdateActionRequest(String participantServiceUpdateActionRequest) {
    this.participantServiceUpdateActionRequest = participantServiceUpdateActionRequest;
  }


}

