/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardNetworkParticipantFacilityApiServiceImpl implements CardNetworkParticipantFacilityApiService {

	public SDCardNetworkParticipantFacilityActivateOutputModel activate(SDCardNetworkParticipantFacilityActivateInputModel request){
		return JsonReader.read("activate-SDCardNetworkParticipantFacilityActivateOutputModel.json",new TypeReference<SDCardNetworkParticipantFacilityActivateOutputModel>(){});
	}
	
	public SDCardNetworkParticipantFacilityConfigureOutputModel configure(String sdReferenceId, SDCardNetworkParticipantFacilityConfigureInputModel request){
		return JsonReader.read("configure-SDCardNetworkParticipantFacilityConfigureOutputModel.json",new TypeReference<SDCardNetworkParticipantFacilityConfigureOutputModel>(){});
	}
	
	public CRCardNetworkParticipantFacilityFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCardNetworkParticipantFacilityFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRCardNetworkParticipantFacilityFulfillmentArrangementControlOutputModel.json",new TypeReference<CRCardNetworkParticipantFacilityFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQParticipantAccountExecuteOutputModel executeParticipantaccount(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipantAccountExecuteInputModel request){
		return JsonReader.read("execute-BQParticipantAccountExecuteOutputModel.json",new TypeReference<BQParticipantAccountExecuteOutputModel>(){});
	}
	
	public BQParticipantServiceExecuteOutputModel executeParticipantservice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipantServiceExecuteInputModel request){
		return JsonReader.read("execute-BQParticipantServiceExecuteOutputModel.json",new TypeReference<BQParticipantServiceExecuteOutputModel>(){});
	}
	
	public SDCardNetworkParticipantFacilityFeedbackOutputModel feedback(String sdReferenceId, SDCardNetworkParticipantFacilityFeedbackInputModel request){
		return JsonReader.read("feedback-SDCardNetworkParticipantFacilityFeedbackOutputModel.json",new TypeReference<SDCardNetworkParticipantFacilityFeedbackOutputModel>(){});
	}
	
	public CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRCardNetworkParticipantFacilityFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQParticipantServiceRequestOutputModel requestParticipantservice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipantServiceRequestInputModel request){
		return JsonReader.read("request-BQParticipantServiceRequestOutputModel.json",new TypeReference<BQParticipantServiceRequestOutputModel>(){});
	}
	
	public CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRCardNetworkParticipantFacilityFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQParticipantAccountRetrieveOutputModel retrieveParticipantaccount(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQParticipantAccountRetrieveOutputModel.json",new TypeReference<BQParticipantAccountRetrieveOutputModel>(){});
	}
	
	public BQParticipantServiceRetrieveOutputModel retrieveParticipantservice(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQParticipantServiceRetrieveOutputModel.json",new TypeReference<BQParticipantServiceRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCardNetworkParticipantFacilityRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCardNetworkParticipantFacilityRetrieveOutputModel.json",new TypeReference<SDCardNetworkParticipantFacilityRetrieveOutputModel>(){});
	}
	
	public CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRCardNetworkParticipantFacilityFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQParticipantAccountUpdateOutputModel updateParticipantaccount(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipantAccountUpdateInputModel request){
		return JsonReader.read("update-BQParticipantAccountUpdateOutputModel.json",new TypeReference<BQParticipantAccountUpdateOutputModel>(){});
	}
	
	public BQParticipantServiceUpdateOutputModel updateParticipantservice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipantServiceUpdateInputModel request){
		return JsonReader.read("update-BQParticipantServiceUpdateOutputModel.json",new TypeReference<BQParticipantServiceUpdateOutputModel>(){});
	}
	
}
