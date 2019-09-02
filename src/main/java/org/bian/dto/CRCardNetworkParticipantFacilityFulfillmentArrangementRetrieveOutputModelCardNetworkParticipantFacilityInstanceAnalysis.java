package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveOutputModelCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysis
 */
public class CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveOutputModelCardNetworkParticipantFacilityInstanceAnalysis   {
  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisData = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisData
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisData() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisData(String cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisData) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisData = cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReportType() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReportType(String cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReportType) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReportType = cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReport() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReport(Object cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReport) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReport = cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReport;
  }


}

