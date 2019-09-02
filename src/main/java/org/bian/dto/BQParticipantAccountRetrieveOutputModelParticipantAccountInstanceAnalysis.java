package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceAnalysis
 */
public class BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceAnalysis   {
  private Object participantAccountInstanceAnalysisRecord = null;

  private String participantAccountInstanceAnalysisReportType = null;

  private String participantAccountInstanceAnalysisParameters = null;

  private Object participantAccountInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return participantAccountInstanceAnalysisRecord
  **/

  public Object getParticipantAccountInstanceAnalysisRecord() {
    return participantAccountInstanceAnalysisRecord;
  }

  public void setParticipantAccountInstanceAnalysisRecord(Object participantAccountInstanceAnalysisRecord) {
    this.participantAccountInstanceAnalysisRecord = participantAccountInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return participantAccountInstanceAnalysisReportType
  **/

  public String getParticipantAccountInstanceAnalysisReportType() {
    return participantAccountInstanceAnalysisReportType;
  }

  public void setParticipantAccountInstanceAnalysisReportType(String participantAccountInstanceAnalysisReportType) {
    this.participantAccountInstanceAnalysisReportType = participantAccountInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return participantAccountInstanceAnalysisParameters
  **/

  public String getParticipantAccountInstanceAnalysisParameters() {
    return participantAccountInstanceAnalysisParameters;
  }

  public void setParticipantAccountInstanceAnalysisParameters(String participantAccountInstanceAnalysisParameters) {
    this.participantAccountInstanceAnalysisParameters = participantAccountInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return participantAccountInstanceAnalysisReport
  **/

  public Object getParticipantAccountInstanceAnalysisReport() {
    return participantAccountInstanceAnalysisReport;
  }

  public void setParticipantAccountInstanceAnalysisReport(Object participantAccountInstanceAnalysisReport) {
    this.participantAccountInstanceAnalysisReport = participantAccountInstanceAnalysisReport;
  }


}

