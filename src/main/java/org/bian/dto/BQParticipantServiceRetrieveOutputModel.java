package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipantServiceRetrieveOutputModelCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceAnalysis;
import org.bian.dto.BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceReport;
import org.bian.dto.BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceRetrieveOutputModel
 */
public class BQParticipantServiceRetrieveOutputModel   {
  private BQParticipantServiceRetrieveOutputModelCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = null;

  private BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord participantServiceInstanceRecord = null;

  private String participantServiceRetrieveActionTaskReference = null;

  private Object participantServiceRetrieveActionTaskRecord = null;

  private String participantServiceRetrieveActionResponse = null;

  private BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceReport participantServiceInstanceReport = null;

  private BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceAnalysis participantServiceInstanceAnalysis = null;


  /**
   * Get cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
   * @return cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
  **/

  public BQParticipantServiceRetrieveOutputModelCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord getCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord() {
    return cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }
  
  @JsonProperty("cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord")
  public void setCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord(BQParticipantServiceRetrieveOutputModelCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord) {
    this.cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get participantServiceInstanceRecord
   * @return participantServiceInstanceRecord
  **/

  public BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord getParticipantServiceInstanceRecord() {
    return participantServiceInstanceRecord;
  }

  public void setParticipantServiceInstanceRecord(BQParticipantServiceUpdateInputModelParticipantServiceInstanceRecord participantServiceInstanceRecord) {
    this.participantServiceInstanceRecord = participantServiceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Participant Service instance retrieve service call 
   * @return participantServiceRetrieveActionTaskReference
  **/

  public String getParticipantServiceRetrieveActionTaskReference() {
    return participantServiceRetrieveActionTaskReference;
  }

  public void setParticipantServiceRetrieveActionTaskReference(String participantServiceRetrieveActionTaskReference) {
    this.participantServiceRetrieveActionTaskReference = participantServiceRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return participantServiceRetrieveActionResponse
  **/

  public String getParticipantServiceRetrieveActionResponse() {
    return participantServiceRetrieveActionResponse;
  }

  public void setParticipantServiceRetrieveActionResponse(String participantServiceRetrieveActionResponse) {
    this.participantServiceRetrieveActionResponse = participantServiceRetrieveActionResponse;
  }


  /**
   * Get participantServiceInstanceReport
   * @return participantServiceInstanceReport
  **/

  public BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceReport getParticipantServiceInstanceReport() {
    return participantServiceInstanceReport;
  }

  public void setParticipantServiceInstanceReport(BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceReport participantServiceInstanceReport) {
    this.participantServiceInstanceReport = participantServiceInstanceReport;
  }


  /**
   * Get participantServiceInstanceAnalysis
   * @return participantServiceInstanceAnalysis
  **/

  public BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceAnalysis getParticipantServiceInstanceAnalysis() {
    return participantServiceInstanceAnalysis;
  }

  public void setParticipantServiceInstanceAnalysis(BQParticipantServiceRetrieveOutputModelParticipantServiceInstanceAnalysis participantServiceInstanceAnalysis) {
    this.participantServiceInstanceAnalysis = participantServiceInstanceAnalysis;
  }


}

