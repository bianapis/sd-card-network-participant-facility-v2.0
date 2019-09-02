package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveOutputModelCardNetworkParticipantFacilityFulfillmentArrangementInstanceReportRecord
 */
public class CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveOutputModelCardNetworkParticipantFacilityInstanceReportRecord   {
  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportData = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportType = null;

  private Object cardNetworkParticipantFacilityFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportData
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementInstanceReportData() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportData;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceReportData(String cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportData) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportData = cardNetworkParticipantFacilityFulfillmentArrangementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReport
  **/

  public Object getCardNetworkParticipantFacilityFulfillmentArrangementInstanceReport() {
    return cardNetworkParticipantFacilityFulfillmentArrangementInstanceReport;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementInstanceReport(Object cardNetworkParticipantFacilityFulfillmentArrangementInstanceReport) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementInstanceReport = cardNetworkParticipantFacilityFulfillmentArrangementInstanceReport;
  }


}

