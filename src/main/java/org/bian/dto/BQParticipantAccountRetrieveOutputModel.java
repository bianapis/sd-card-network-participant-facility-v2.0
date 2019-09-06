package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantAccountRetrieveOutputModelCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceAnalysis;
import org.bian.dto.BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceReport;
import org.bian.dto.BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantAccountRetrieveOutputModel
 */
public class BQParticipantAccountRetrieveOutputModel   {
  private BQParticipantAccountRetrieveOutputModelCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = null;

  private BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord participantAccountInstanceRecord = null;

  private String participantAccountRetrieveActionTaskReference = null;

  private Object participantAccountRetrieveActionTaskRecord = null;

  private String participantAccountRetrieveActionResponse = null;

  private BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceReport participantAccountInstanceReport = null;

  private BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceAnalysis participantAccountInstanceAnalysis = null;


  /**
   * Get cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
   * @return cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
  **/

  public BQParticipantAccountRetrieveOutputModelCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord getCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord() {
    return cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }
  
  @JsonProperty("cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord")
  public void setCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord(BQParticipantAccountRetrieveOutputModelCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord) {
    this.cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get participantAccountInstanceRecord
   * @return participantAccountInstanceRecord
  **/

  public BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord getParticipantAccountInstanceRecord() {
    return participantAccountInstanceRecord;
  }

  public void setParticipantAccountInstanceRecord(BQParticipantAccountUpdateInputModelParticipantAccountInstanceRecord participantAccountInstanceRecord) {
    this.participantAccountInstanceRecord = participantAccountInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Participant Account instance retrieve service call 
   * @return participantAccountRetrieveActionTaskReference
  **/

  public String getParticipantAccountRetrieveActionTaskReference() {
    return participantAccountRetrieveActionTaskReference;
  }

  public void setParticipantAccountRetrieveActionTaskReference(String participantAccountRetrieveActionTaskReference) {
    this.participantAccountRetrieveActionTaskReference = participantAccountRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return participantAccountRetrieveActionResponse
  **/

  public String getParticipantAccountRetrieveActionResponse() {
    return participantAccountRetrieveActionResponse;
  }

  public void setParticipantAccountRetrieveActionResponse(String participantAccountRetrieveActionResponse) {
    this.participantAccountRetrieveActionResponse = participantAccountRetrieveActionResponse;
  }


  /**
   * Get participantAccountInstanceReport
   * @return participantAccountInstanceReport
  **/

  public BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceReport getParticipantAccountInstanceReport() {
    return participantAccountInstanceReport;
  }

  public void setParticipantAccountInstanceReport(BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceReport participantAccountInstanceReport) {
    this.participantAccountInstanceReport = participantAccountInstanceReport;
  }


  /**
   * Get participantAccountInstanceAnalysis
   * @return participantAccountInstanceAnalysis
  **/

  public BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceAnalysis getParticipantAccountInstanceAnalysis() {
    return participantAccountInstanceAnalysis;
  }

  public void setParticipantAccountInstanceAnalysis(BQParticipantAccountRetrieveOutputModelParticipantAccountInstanceAnalysis participantAccountInstanceAnalysis) {
    this.participantAccountInstanceAnalysis = participantAccountInstanceAnalysis;
  }


}

