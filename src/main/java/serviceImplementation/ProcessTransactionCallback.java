package serviceImplementation;


import org.springframework.stereotype.Component;

import com.azampgw.request.ATVMobile;
import com.azampgw.request.TransactionCallback;
import com.azampgw.response.CallbackResponse;

@Component
public class ProcessTransactionCallback {
	
	public CallbackResponse processTransactionalCallback(TransactionCallback request) {
		
		CallbackResponse response = new CallbackResponse();
		
		try {
			// check here if ATV Mobile user exist and transaction is not duplicate
			CheckATVForTransaction atvUser = new CheckATVForTransaction();
			ATVMobile atvRequest = new ATVMobile();
			atvRequest.setMobileNumber("+255710100054");
			atvRequest.setTransactionNumber("Atharv");
			Boolean isUserAvailable = atvUser.checkATVTransactions(atvRequest);
			
			if(isUserAvailable) {
				// here need to hit the final callback for response;
				
			} else {
				
			}
					
		} catch(Exception error) {
			
			// here respond with error
			
		}
		
		return response;
		
	}

}
