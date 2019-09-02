package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecord
 */
public class BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecord   {
  private BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction participantAccountPostingTransaction = null;


  /**
   * Get participantAccountPostingTransaction
   * @return participantAccountPostingTransaction
  **/

  public BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction getParticipantAccountPostingTransaction() {
    return participantAccountPostingTransaction;
  }

  public void setParticipantAccountPostingTransaction(BQParticipantAccountExecuteInputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction participantAccountPostingTransaction) {
    this.participantAccountPostingTransaction = participantAccountPostingTransaction;
  }


}

