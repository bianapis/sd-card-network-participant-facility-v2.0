package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecord;
import org.bian.dto.BQParticipantServiceRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceRequestInputModel
 */
public class BQParticipantServiceRequestInputModel   {
  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference = null;

  private String participantServiceInstanceReference = null;

  private BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecord participantServiceInstanceRecord = null;

  private Object participantServiceRequestActionTaskRecord = null;

  private BQParticipantServiceRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecord getParticipantServiceInstanceRecord() {
    return participantServiceInstanceRecord;
  }

  public void setParticipantServiceInstanceRecord(BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecord participantServiceInstanceRecord) {
    this.participantServiceInstanceRecord = participantServiceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return participantServiceRequestActionTaskRecord
  **/

  public Object getParticipantServiceRequestActionTaskRecord() {
    return participantServiceRequestActionTaskRecord;
  }

  public void setParticipantServiceRequestActionTaskRecord(Object participantServiceRequestActionTaskRecord) {
    this.participantServiceRequestActionTaskRecord = participantServiceRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQParticipantServiceRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQParticipantServiceRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

