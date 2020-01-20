package com.azampgw.services;

import org.springframework.stereotype.Service;

import com.azampgw.request.GatewayResponseForRegistredRequest;

@Service
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
