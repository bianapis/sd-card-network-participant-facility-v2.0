package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantAccountExecuteInputModelExecuteRecordType;
import org.bian.dto.BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountExecuteInputModel
 */
public class BQParticipantAccountExecuteInputModel   {
  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference = null;

  private String participantAccountInstanceReference = null;

  private BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecord participantAccountInstanceRecord = null;

  private Object participantAccountExecuteActionTaskRecord = null;

  private BQParticipantAccountExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecord getParticipantAccountInstanceRecord() {
    return participantAccountInstanceRecord;
  }

  public void setParticipantAccountInstanceRecord(BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecord participantAccountInstanceRecord) {
    this.participantAccountInstanceRecord = participantAccountInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return participantAccountExecuteActionTaskRecord
  **/

  public Object getParticipantAccountExecuteActionTaskRecord() {
    return participantAccountExecuteActionTaskRecord;
  }

  public void setParticipantAccountExecuteActionTaskRecord(Object participantAccountExecuteActionTaskRecord) {
    this.participantAccountExecuteActionTaskRecord = participantAccountExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQParticipantAccountExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQParticipantAccountExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

