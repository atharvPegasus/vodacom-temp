package com.azampgw.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azampgw.Base.VodaBaseResponse;
import com.azampgw.request.GatewayResponseForRegistredRequest;
import com.azampgw.response.IncomingRequest;
import com.azampgw.services.AcceptVodaTransaction;


@RestController
@RequestMapping(path="/vodacom")

public class VodacomController {

	
	@Autowired
	private AcceptVodaTransaction acceptVodaTransactions; 
	
	@Autowired
	private GatewayResponseForRegistredRequest responseForRegistredRequest;

	@PostMapping("/incomingRequest")
	public ResponseEntity AcceptVodacomRequest(@Valid @RequestBody IncomingRequest incomingRequest, BindingResult bindingResult){
		responseForRegistredRequest = acceptVodaTransactions.acceptVodaTransaction(incomingRequest);
		if(bindingResult.hasErrors()) {
			// Failed Error Condition
			
		}
		return ResponseEntity.badRequest().body(false);
		
//		else if(responseForRegistredRequest.getBaseResponse().getSuccess()) {
//			//Success Conditions
////			return 
//			
//		} else {
//			// Failed condition in catched Exception
//			
//		}
		
		
//		return responseForRegistredRequest.getBaseResponse().getSuccess();
	}
	
	
	@PostMapping("/response/callback")
	public ResponseEntity VodacmCallback(@Valid @RequestBody VodaBaseResponse vodaBaseResponse, BindingResult bindingResult) {
		return ResponseEntity.badRequest().body(false);
		
	}

}
