package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecordParticipantServiceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecord
 */
public class BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecord   {
  private BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecordParticipantServiceRecord participantServiceRecord = null;


  /**
   * Get participantServiceRecord
   * @return participantServiceRecord
  **/

  public BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecordParticipantServiceRecord getParticipantServiceRecord() {
    return participantServiceRecord;
  }

  public void setParticipantServiceRecord(BQParticipantServiceExecuteInputModelParticipantServiceInstanceRecordParticipantServiceRecord participantServiceRecord) {
    this.participantServiceRecord = participantServiceRecord;
  }


}

