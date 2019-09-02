package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantServiceRetrieveInputModelParticipantServiceInstanceAnalysis;
import org.bian.dto.BQParticipantServiceRetrieveInputModelParticipantServiceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceRetrieveInputModel
 */
public class BQParticipantServiceRetrieveInputModel   {
  private Object participantServiceRetrieveActionTaskRecord = null;

  private String participantServiceRetrieveActionRequest = null;

  private BQParticipantServiceRetrieveInputModelParticipantServiceInstanceReport participantServiceInstanceReport = null;

  private BQParticipantServiceRetrieveInputModelParticipantServiceInstanceAnalysis participantServiceInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return participantServiceRetrieveActionTaskRecord
  **/

  public Object getParticipantServiceRetrieveActionTaskRecord() {
    return participantServiceRetrieveActionTaskRecord;
  }

  public void setParticipantServiceRetrieveActionTaskRecord(Object participantServiceRetrieveActionTaskRecord) {
    this.participantServiceRetrieveActionTaskRecord = participantServiceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return participantServiceRetrieveActionRequest
  **/

  public String getParticipantServiceRetrieveActionRequest() {
    return participantServiceRetrieveActionRequest;
  }

  public void setParticipantServiceRetrieveActionRequest(String participantServiceRetrieveActionRequest) {
    this.participantServiceRetrieveActionRequest = participantServiceRetrieveActionRequest;
  }


  /**
   * Get participantServiceInstanceReport
   * @return participantServiceInstanceReport
  **/

  public BQParticipantServiceRetrieveInputModelParticipantServiceInstanceReport getParticipantServiceInstanceReport() {
    return participantServiceInstanceReport;
  }

  public void setParticipantServiceInstanceReport(BQParticipantServiceRetrieveInputModelParticipantServiceInstanceReport participantServiceInstanceReport) {
    this.participantServiceInstanceReport = participantServiceInstanceReport;
  }


  /**
   * Get participantServiceInstanceAnalysis
   * @return participantServiceInstanceAnalysis
  **/

  public BQParticipantServiceRetrieveInputModelParticipantServiceInstanceAnalysis getParticipantServiceInstanceAnalysis() {
    return participantServiceInstanceAnalysis;
  }

  public void setParticipantServiceInstanceAnalysis(BQParticipantServiceRetrieveInputModelParticipantServiceInstanceAnalysis participantServiceInstanceAnalysis) {
    this.participantServiceInstanceAnalysis = participantServiceInstanceAnalysis;
  }


}

