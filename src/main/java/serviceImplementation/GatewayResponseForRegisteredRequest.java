package serviceImplementation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.azampgw.request.GatewayResponseForRegistredRequest;

@Component
public class GatewayResponseForRegisteredRequest {
	
	public void respondForRegisteredRequest(GatewayResponseForRegistredRequest requestToIntimateRegistration) {
		
		try {
			if(requestToIntimateRegistration.getBaseResponse().getSuccess()) {
			// respond the callback URL 	
			} else {
				// fail the callback URL
			}

		} catch (Exception ex) {
			// fail the callback URL
			
		}
		
		
		
		
	}

}
