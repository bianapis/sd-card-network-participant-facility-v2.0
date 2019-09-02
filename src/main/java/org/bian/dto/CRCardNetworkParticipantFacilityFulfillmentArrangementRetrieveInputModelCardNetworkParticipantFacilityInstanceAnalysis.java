package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveInputModelCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysis
 */
public class CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveInputModelCardNetworkParticipantFacilityInstanceAnalysis   {
  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReference = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReportType = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReference() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReference(String cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReference) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReference = cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisParameters() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisParameters(String cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisParameters) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisParameters = cardNetworkParticipantFacilityFulfillmentArrangementInstanceAnalysisParameters;
  }


}

