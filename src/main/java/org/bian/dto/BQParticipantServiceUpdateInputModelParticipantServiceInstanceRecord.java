package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecordParticipantServiceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord
 */
public class BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord   {
  private BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecordParticipantServiceRecord participantServiceRecord = null;


  /**
   * Get participantServiceRecord
   * @return participantServiceRecord
  **/

  public BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecordParticipantServiceRecord getParticipantServiceRecord() {
    return participantServiceRecord;
  }

  public void setParticipantServiceRecord(BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecordParticipantServiceRecord participantServiceRecord) {
    this.participantServiceRecord = participantServiceRecord;
  }


}

