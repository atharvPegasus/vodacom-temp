package serviceImplementation;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.azampgw.request.ATVMobile;

@Service
public class CheckATVForTransaction {
	
	public Boolean checkATVTransactions(ATVMobile request) {
		try {
			// hit this endPoint for checking the user in ATV available with no transaction reference
			final String url = "http://localhost:3002/api/getPayment";

		    RestTemplate restTemplate = new RestTemplate();
		    String result = restTemplate.postForObject(url, request, String.class);
		    System.out.println("result"+result);
		    if(result != null) {
		    	return true;	
		    }
			
			return false;
		} catch (Exception error) {
			
			// Log the exceptions 
			return false;
		}
		
		
		
	}

}
