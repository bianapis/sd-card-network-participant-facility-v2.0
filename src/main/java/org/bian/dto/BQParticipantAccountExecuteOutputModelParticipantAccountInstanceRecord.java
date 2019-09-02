package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecord
 */
public class BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecord   {
  private BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction participantAccountPostingTransaction = null;


  /**
   * Get participantAccountPostingTransaction
   * @return participantAccountPostingTransaction
  **/

  public BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction getParticipantAccountPostingTransaction() {
    return participantAccountPostingTransaction;
  }

  public void setParticipantAccountPostingTransaction(BQParticipantAccountExecuteOutputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction participantAccountPostingTransaction) {
    this.participantAccountPostingTransaction = participantAccountPostingTransaction;
  }


}

