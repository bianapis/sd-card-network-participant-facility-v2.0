package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceRequestOutputModel
 */
public class BQParticipantServiceRequestOutputModel   {
  private BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecord participantServiceInstanceRecord = null;

  private String participantServiceRequestActionTaskReference = null;

  private Object participantServiceRequestActionTaskRecord = null;

  private String participantServiceRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Participant Service instance request service call 
   * @return participantServiceRequestActionTaskReference
  **/

  public String getParticipantServiceRequestActionTaskReference() {
    return participantServiceRequestActionTaskReference;
  }

  public void setParticipantServiceRequestActionTaskReference(String participantServiceRequestActionTaskReference) {
    this.participantServiceRequestActionTaskReference = participantServiceRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Participant Service service request record 
   * @return participantServiceRequestRecordReference
  **/

  public String getParticipantServiceRequestRecordReference() {
    return participantServiceRequestRecordReference;
  }

  public void setParticipantServiceRequestRecordReference(String participantServiceRequestRecordReference) {
    this.participantServiceRequestRecordReference = participantServiceRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

