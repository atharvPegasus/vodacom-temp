package utility;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.tomcat.util.codec.binary.Base64;

import com.azampgw.Base.Response;

public class PasswordDigest {
	
	public Response getSpPasswoord(String spId, String password, String timestamp) {
		Response passwordRes = new Response();
		try {
			String dgStr = spId + password + timestamp;
			byte[] enc = MessageDigest.getInstance("SHA-256").digest(dgStr.getBytes()) ;
			passwordRes.setMessage(new String(Base64.encodeBase64(enc)));
			passwordRes.setSuccess(true);
			
			return passwordRes; 
		} catch (NoSuchAlgorithmException ex) {
			passwordRes.setSuccess(false);
			passwordRes.setMessage(ex.toString());
			return passwordRes;
		}
		
		
	}

}
