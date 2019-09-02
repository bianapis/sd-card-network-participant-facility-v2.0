package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceExecuteOutputModel
 */
public class BQParticipantServiceExecuteOutputModel   {
  private BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecord participantServiceInstanceRecord = null;

  private String participantServiceExecuteActionTaskReference = null;

  private Object participantServiceExecuteActionTaskRecord = null;

  private String participantServiceExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get participantServiceInstanceRecord
   * @return participantServiceInstanceRecord
  **/

  public BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecord getParticipantServiceInstanceRecord() {
    return participantServiceInstanceRecord;
  }

  public void setParticipantServiceInstanceRecord(BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecord participantServiceInstanceRecord) {
    this.participantServiceInstanceRecord = participantServiceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Participant Service instance execute service call 
   * @return participantServiceExecuteActionTaskReference
  **/

  public String getParticipantServiceExecuteActionTaskReference() {
    return participantServiceExecuteActionTaskReference;
  }

  public void setParticipantServiceExecuteActionTaskReference(String participantServiceExecuteActionTaskReference) {
    this.participantServiceExecuteActionTaskReference = participantServiceExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Participant Service execute transaction/record 
   * @return participantServiceExecuteRecordReference
  **/

  public String getParticipantServiceExecuteRecordReference() {
    return participantServiceExecuteRecordReference;
  }

  public void setParticipantServiceExecuteRecordReference(String participantServiceExecuteRecordReference) {
    this.participantServiceExecuteRecordReference = participantServiceExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

