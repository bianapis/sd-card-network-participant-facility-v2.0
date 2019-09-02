package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantAccountExecuteInputModelExecuteRecordType;
import org.bian.dto.BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceExecuteInputModel
 */
public class BQParticipantServiceExecuteInputModel   {
  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReference = null;

  private String participantServiceInstanceReference = null;

  private BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecord participantServiceInstanceRecord = null;

  private Object participantServiceExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return participantServiceExecuteActionTaskRecord
  **/

  public Object getParticipantServiceExecuteActionTaskRecord() {
    return participantServiceExecuteActionTaskRecord;
  }

  public void setParticipantServiceExecuteActionTaskRecord(Object participantServiceExecuteActionTaskRecord) {
    this.participantServiceExecuteActionTaskRecord = participantServiceExecuteActionTaskRecord;
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

