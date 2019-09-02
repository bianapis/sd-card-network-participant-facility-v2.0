package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModelCRCardNetworkParticipantFacilityInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateOutputModel
 */
public class CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateOutputModel   {
  private CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModelCRCardNetworkParticipantFacilityInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = null;

  private String cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskReference = null;

  private Object cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
   * @return cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord
  **/

  public CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModelCRCardNetworkParticipantFacilityInstanceRecord getCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord() {
    return cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setCRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord(CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModelCRCardNetworkParticipantFacilityInstanceRecord cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord) {
    this.cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord = cRCardNetworkParticipantFacilityFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getCardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskReference() {
    return cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskReference(String cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskReference) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskReference = cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord() {
    return cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord(Object cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord) {
    this.cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord = cardNetworkParticipantFacilityFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

