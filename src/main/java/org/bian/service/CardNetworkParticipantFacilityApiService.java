/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardNetworkParticipantFacilityApiService {

	SDCardNetworkParticipantFacilityActivateOutputModel activate(SDCardNetworkParticipantFacilityActivateInputModel request);
	
	SDCardNetworkParticipantFacilityConfigureOutputModel configure(String sdReferenceId, SDCardNetworkParticipantFacilityConfigureInputModel request);
	
	CRCardNetworkParticipantFacilityFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCardNetworkParticipantFacilityFulfillmentArrangementControlInputModel request);
	
	BQParticipantAccountExecuteOutputModel executeParticipantaccount(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipantAccountExecuteInputModel request);
	
	BQParticipantServiceExecuteOutputModel executeParticipantservice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipantServiceExecuteInputModel request);
	
	SDCardNetworkParticipantFacilityFeedbackOutputModel feedback(String sdReferenceId, SDCardNetworkParticipantFacilityFeedbackInputModel request);
	
	CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateInputModel request);
	
	BQParticipantServiceRequestOutputModel requestParticipantservice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipantServiceRequestInputModel request);
	
	CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQParticipantAccountRetrieveOutputModel retrieveParticipantaccount(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQParticipantServiceRetrieveOutputModel retrieveParticipantservice(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCardNetworkParticipantFacilityRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModel request);
	
	BQParticipantAccountUpdateOutputModel updateParticipantaccount(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipantAccountUpdateInputModel request);
	
	BQParticipantServiceUpdateOutputModel updateParticipantservice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipantServiceUpdateInputModel request);
	
}
