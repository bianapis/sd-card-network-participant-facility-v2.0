package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceAnalysis
 */
public class BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceAnalysis   {
  private Object participantServiceInstanceAnalysisRecord = null;

  private String participantServiceInstanceAnalysisReportType = null;

  private String participantServiceInstanceAnalysisParameters = null;

  private Object participantServiceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return participantServiceInstanceAnalysisRecord
  **/

  public Object getParticipantServiceInstanceAnalysisRecord() {
    return participantServiceInstanceAnalysisRecord;
  }

  public void setParticipantServiceInstanceAnalysisRecord(Object participantServiceInstanceAnalysisRecord) {
    this.participantServiceInstanceAnalysisRecord = participantServiceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return participantServiceInstanceAnalysisReportType
  **/

  public String getParticipantServiceInstanceAnalysisReportType() {
    return participantServiceInstanceAnalysisReportType;
  }

  public void setParticipantServiceInstanceAnalysisReportType(String participantServiceInstanceAnalysisReportType) {
    this.participantServiceInstanceAnalysisReportType = participantServiceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return participantServiceInstanceAnalysisParameters
  **/

  public String getParticipantServiceInstanceAnalysisParameters() {
    return participantServiceInstanceAnalysisParameters;
  }

  public void setParticipantServiceInstanceAnalysisParameters(String participantServiceInstanceAnalysisParameters) {
    this.participantServiceInstanceAnalysisParameters = participantServiceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return participantServiceInstanceAnalysisReport
  **/

  public Object getParticipantServiceInstanceAnalysisReport() {
    return participantServiceInstanceAnalysisReport;
  }

  public void setParticipantServiceInstanceAnalysisReport(Object participantServiceInstanceAnalysisReport) {
    this.participantServiceInstanceAnalysisReport = participantServiceInstanceAnalysisReport;
  }


}

