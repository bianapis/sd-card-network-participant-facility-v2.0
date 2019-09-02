package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountUpdateOutputModel
 */
public class BQParticipantAccountUpdateOutputModel   {
  private BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord participantAccountInstanceRecord = null;

  private String participantAccountUpdateActionTaskReference = null;

  private Object participantAccountUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return participantAccountUpdateActionTaskReference
  **/

  public String getParticipantAccountUpdateActionTaskReference() {
    return participantAccountUpdateActionTaskReference;
  }

  public void setParticipantAccountUpdateActionTaskReference(String participantAccountUpdateActionTaskReference) {
    this.participantAccountUpdateActionTaskReference = participantAccountUpdateActionTaskReference;
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

