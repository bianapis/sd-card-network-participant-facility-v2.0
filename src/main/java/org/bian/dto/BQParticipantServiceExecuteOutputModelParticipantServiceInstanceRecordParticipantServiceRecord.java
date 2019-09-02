package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecordParticipantServiceRecord
 */
public class BQParticipantServiceExecuteOutputModelParticipantServiceInstanceRecordParticipantServiceRecord   {
  private String networkParticipantServiceCharge = null;

  private String networkParticipantServiceDateTime = null;

  private String networkParticipantNetworkServiceRequestWorkProduct = null;

  private String networkParticipantNetworkServiceRequestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Details of service charge levied against the Network Participant Facility 
   * @return networkParticipantServiceCharge
  **/

  public String getNetworkParticipantServiceCharge() {
    return networkParticipantServiceCharge;
  }

  public void setNetworkParticipantServiceCharge(String networkParticipantServiceCharge) {
    this.networkParticipantServiceCharge = networkParticipantServiceCharge;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Key dates and times associated with the provision of the service (e.g. initiation of service fulfillment) 
   * @return networkParticipantServiceDateTime
  **/

  public String getNetworkParticipantServiceDateTime() {
    return networkParticipantServiceDateTime;
  }

  public void setNetworkParticipantServiceDateTime(String networkParticipantServiceDateTime) {
    this.networkParticipantServiceDateTime = networkParticipantServiceDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the network service delivery (includes charges, service activity log and results etc.) 
   * @return networkParticipantNetworkServiceRequestWorkProduct
  **/

  public String getNetworkParticipantNetworkServiceRequestWorkProduct() {
    return networkParticipantNetworkServiceRequestWorkProduct;
  }

  public void setNetworkParticipantNetworkServiceRequestWorkProduct(String networkParticipantNetworkServiceRequestWorkProduct) {
    this.networkParticipantNetworkServiceRequestWorkProduct = networkParticipantNetworkServiceRequestWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the request in whatever form appropriate 
   * @return networkParticipantNetworkServiceRequestResult
  **/

  public String getNetworkParticipantNetworkServiceRequestResult() {
    return networkParticipantNetworkServiceRequestResult;
  }

  public void setNetworkParticipantNetworkServiceRequestResult(String networkParticipantNetworkServiceRequestResult) {
    this.networkParticipantNetworkServiceRequestResult = networkParticipantNetworkServiceRequestResult;
  }


}

