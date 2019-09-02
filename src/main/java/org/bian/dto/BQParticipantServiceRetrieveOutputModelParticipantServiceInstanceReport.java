package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceReport
 */
public class BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceReport   {
  private Object participantServiceInstanceReportRecord = null;

  private String participantServiceInstanceReportType = null;

  private String participantServiceInstanceReportParameters = null;

  private Object participantServiceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return participantServiceInstanceReportRecord
  **/

  public Object getParticipantServiceInstanceReportRecord() {
    return participantServiceInstanceReportRecord;
  }

  public void setParticipantServiceInstanceReportRecord(Object participantServiceInstanceReportRecord) {
    this.participantServiceInstanceReportRecord = participantServiceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return participantServiceInstanceReportType
  **/

  public String getParticipantServiceInstanceReportType() {
    return participantServiceInstanceReportType;
  }

  public void setParticipantServiceInstanceReportType(String participantServiceInstanceReportType) {
    this.participantServiceInstanceReportType = participantServiceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return participantServiceInstanceReportParameters
  **/

  public String getParticipantServiceInstanceReportParameters() {
    return participantServiceInstanceReportParameters;
  }

  public void setParticipantServiceInstanceReportParameters(String participantServiceInstanceReportParameters) {
    this.participantServiceInstanceReportParameters = participantServiceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return participantServiceInstanceReport
  **/

  public Object getParticipantServiceInstanceReport() {
    return participantServiceInstanceReport;
  }

  public void setParticipantServiceInstanceReport(Object participantServiceInstanceReport) {
    this.participantServiceInstanceReport = participantServiceInstanceReport;
  }


}

