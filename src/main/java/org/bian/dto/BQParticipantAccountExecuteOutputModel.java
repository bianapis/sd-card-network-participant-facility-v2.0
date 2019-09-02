package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountExecuteOutputModel
 */
public class BQParticipantAccountExecuteOutputModel   {
  private BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecord participantAccountInstanceRecord = null;

  private String participantAccountExecuteActionTaskReference = null;

  private Object participantAccountExecuteActionTaskRecord = null;

  private String participantAccountExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get participantAccountInstanceRecord
   * @return participantAccountInstanceRecord
  **/

  public BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecord getParticipantAccountInstanceRecord() {
    return participantAccountInstanceRecord;
  }

  public void setParticipantAccountInstanceRecord(BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecord participantAccountInstanceRecord) {
    this.participantAccountInstanceRecord = participantAccountInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Participant Account instance execute service call 
   * @return participantAccountExecuteActionTaskReference
  **/

  public String getParticipantAccountExecuteActionTaskReference() {
    return participantAccountExecuteActionTaskReference;
  }

  public void setParticipantAccountExecuteActionTaskReference(String participantAccountExecuteActionTaskReference) {
    this.participantAccountExecuteActionTaskReference = participantAccountExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Participant Account execute transaction/record 
   * @return participantAccountExecuteRecordReference
  **/

  public String getParticipantAccountExecuteRecordReference() {
    return participantAccountExecuteRecordReference;
  }

  public void setParticipantAccountExecuteRecordReference(String participantAccountExecuteRecordReference) {
    this.participantAccountExecuteRecordReference = participantAccountExecuteRecordReference;
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

