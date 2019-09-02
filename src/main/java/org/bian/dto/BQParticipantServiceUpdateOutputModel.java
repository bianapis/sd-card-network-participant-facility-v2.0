package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceUpdateOutputModel
 */
public class BQParticipantServiceUpdateOutputModel   {
  private BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord participantServiceInstanceRecord = null;

  private String participantServiceUpdateActionTaskReference = null;

  private Object participantServiceUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return participantServiceUpdateActionTaskReference
  **/

  public String getParticipantServiceUpdateActionTaskReference() {
    return participantServiceUpdateActionTaskReference;
  }

  public void setParticipantServiceUpdateActionTaskReference(String participantServiceUpdateActionTaskReference) {
    this.participantServiceUpdateActionTaskReference = participantServiceUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

