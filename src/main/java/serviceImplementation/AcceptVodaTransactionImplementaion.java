package serviceImplementation;

import org.springframework.stereotype.Component;
import com.azampgw.Base.Response;
import com.azampgw.Base.VodaBaseResponse;
import com.azampgw.request.GatewayResponseForRegistredRequest;
import com.azampgw.response.IncomingRequest;
import com.azampgw.services.AcceptVodaTransaction;

@Component
public class AcceptVodaTransactionImplementaion implements AcceptVodaTransaction {
	
	public GatewayResponseForRegistredRequest acceptVodaTransaction (IncomingRequest request) {
		
		System.out.println("hiiihihi");
		GatewayResponseForRegistredRequest response = new GatewayResponseForRegistredRequest();
		Response baseResponse = new Response();
		VodaBaseResponse vodaResponse = new VodaBaseResponse();
		try {
			// base response to know whether success or fail
			baseResponse.setMessage("Succesfully registred MPESA request");
			baseResponse.setSuccess(true);
			response.setBaseResponse(baseResponse);
			
			// parameter to be passed for registered response of MPESA
			vodaResponse.setConversationId(request.getTransaction().getConversationId());
			vodaResponse.setOriginatorConversationId(request.getTransaction().getOriginatorConversationId());
			vodaResponse.setTransactionId(request.getTransaction().getTransactionId());
			vodaResponse.setResponseCode("0");
			vodaResponse.setResponseDesc("RECEIVED");
			vodaResponse.setServiceStatus("SUCCESS");
			response.setVodaBaseResponse(vodaResponse);
						
		} catch (Exception ex) {
			// base response to know whether success or fail
			baseResponse.setMessage("failed to register MPESA request");
			baseResponse.setSuccess(false);
			response.setBaseResponse(baseResponse);
			
			// parameter to be passed for registered response of MPESA
			vodaResponse.setConversationId("FAILED");
			vodaResponse.setOriginatorConversationId("FAILED");
			vodaResponse.setTransactionId("FAILED");
			vodaResponse.setResponseCode("0");
			vodaResponse.setResponseDesc("RECEIVED");
			vodaResponse.setServiceStatus("SUCCESS");
			response.setVodaBaseResponse(vodaResponse);
			
		}
		
		
		return response;
		
	}
	
}
