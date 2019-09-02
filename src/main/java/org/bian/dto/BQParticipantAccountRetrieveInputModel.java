package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantAccountRetrieveInputModelParticipantAccountInstanceAnalysis;
import org.bian.dto.BQParticipantAccountRetrieveInputModelParticipantAccountInstanceReport;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountRetrieveInputModel
 */
public class BQParticipantAccountRetrieveInputModel   {
  private Object participantAccountRetrieveActionTaskRecord = null;

  private String participantAccountRetrieveActionRequest = null;

  private BQParticipantAccountRetrieveInputModelParticipantAccountInstanceReport participantAccountInstanceReport = null;

  private BQParticipantAccountRetrieveInputModelParticipantAccountInstanceAnalysis participantAccountInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return participantAccountRetrieveActionTaskRecord
  **/

  public Object getParticipantAccountRetrieveActionTaskRecord() {
    return participantAccountRetrieveActionTaskRecord;
  }

  public void setParticipantAccountRetrieveActionTaskRecord(Object participantAccountRetrieveActionTaskRecord) {
    this.participantAccountRetrieveActionTaskRecord = participantAccountRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return participantAccountRetrieveActionRequest
  **/

  public String getParticipantAccountRetrieveActionRequest() {
    return participantAccountRetrieveActionRequest;
  }

  public void setParticipantAccountRetrieveActionRequest(String participantAccountRetrieveActionRequest) {
    this.participantAccountRetrieveActionRequest = participantAccountRetrieveActionRequest;
  }


  /**
   * Get participantAccountInstanceReport
   * @return participantAccountInstanceReport
  **/

  public BQParticipantAccountRetrieveInputModelParticipantAccountInstanceReport getParticipantAccountInstanceReport() {
    return participantAccountInstanceReport;
  }

  public void setParticipantAccountInstanceReport(BQParticipantAccountRetrieveInputModelParticipantAccountInstanceReport participantAccountInstanceReport) {
    this.participantAccountInstanceReport = participantAccountInstanceReport;
  }


  /**
   * Get participantAccountInstanceAnalysis
   * @return participantAccountInstanceAnalysis
  **/

  public BQParticipantAccountRetrieveInputModelParticipantAccountInstanceAnalysis getParticipantAccountInstanceAnalysis() {
    return participantAccountInstanceAnalysis;
  }

  public void setParticipantAccountInstanceAnalysis(BQParticipantAccountRetrieveInputModelParticipantAccountInstanceAnalysis participantAccountInstanceAnalysis) {
    this.participantAccountInstanceAnalysis = participantAccountInstanceAnalysis;
  }


}

