package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord
 */
public class BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord   {
  private BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction participantAccountPostingTransaction = null;


  /**
   * Get participantAccountPostingTransaction
   * @return participantAccountPostingTransaction
  **/

  public BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction getParticipantAccountPostingTransaction() {
    return participantAccountPostingTransaction;
  }

  public void setParticipantAccountPostingTransaction(BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecordParticipantAccountPostingTransaction participantAccountPostingTransaction) {
    this.participantAccountPostingTransaction = participantAccountPostingTransaction;
  }


}

