package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecordParticipantServiceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecord
 */
public class BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecord   {
  private BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecordParticipantServiceRecord participantServiceRecord = null;


  /**
   * Get participantServiceRecord
   * @return participantServiceRecord
  **/

  public BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecordParticipantServiceRecord getParticipantServiceRecord() {
    return participantServiceRecord;
  }

  public void setParticipantServiceRecord(BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecordParticipantServiceRecord participantServiceRecord) {
    this.participantServiceRecord = participantServiceRecord;
  }


}

