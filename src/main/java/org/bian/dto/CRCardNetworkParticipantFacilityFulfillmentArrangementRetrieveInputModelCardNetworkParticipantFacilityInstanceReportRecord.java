package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveInputModelCardNetworkParticipantFacilityFulfillmentArrangementInstanceReportRecord
 */
public class CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveInputModelCardNetworkParticipantFacilityInstanceReportRecord   {
  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportReference = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportType = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportReference
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInstanceReportReference() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportReference;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceReportReference(String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportReference) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportReference = cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportType
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInstanceReportType() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportType;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceReportType(String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportType) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportType = cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportParameters
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInstanceReportParameters() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportParameters;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceReportParameters(String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportParameters) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportParameters = cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportParameters;
  }


}

