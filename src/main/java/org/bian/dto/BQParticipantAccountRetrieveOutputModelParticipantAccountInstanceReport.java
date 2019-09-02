package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceReport
 */
public class BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceReport   {
  private Object participantAccountInstanceReportRecord = null;

  private String participantAccountInstanceReportType = null;

  private String participantAccountInstanceReportParameters = null;

  private Object participantAccountInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return participantAccountInstanceReportRecord
  **/

  public Object getParticipantAccountInstanceReportRecord() {
    return participantAccountInstanceReportRecord;
  }

  public void setParticipantAccountInstanceReportRecord(Object participantAccountInstanceReportRecord) {
    this.participantAccountInstanceReportRecord = participantAccountInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return participantAccountInstanceReportType
  **/

  public String getParticipantAccountInstanceReportType() {
    return participantAccountInstanceReportType;
  }

  public void setParticipantAccountInstanceReportType(String participantAccountInstanceReportType) {
    this.participantAccountInstanceReportType = participantAccountInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return participantAccountInstanceReportParameters
  **/

  public String getParticipantAccountInstanceReportParameters() {
    return participantAccountInstanceReportParameters;
  }

  public void setParticipantAccountInstanceReportParameters(String participantAccountInstanceReportParameters) {
    this.participantAccountInstanceReportParameters = participantAccountInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return participantAccountInstanceReport
  **/

  public Object getParticipantAccountInstanceReport() {
    return participantAccountInstanceReport;
  }

  public void setParticipantAccountInstanceReport(Object participantAccountInstanceReport) {
    this.participantAccountInstanceReport = participantAccountInstanceReport;
  }


}

