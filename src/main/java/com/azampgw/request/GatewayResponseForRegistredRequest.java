package com.azampgw.request;

import com.azampgw.Base.Response;
import com.azampgw.Base.VodaBaseResponse;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="response")
public class GatewayResponseForRegistredRequest {
	
	public Response baseResponse;
	public VodaBaseResponse vodaResponse;
	
	
	public Response getBaseResponse() {
		return baseResponse;
	}

	public void setBaseResponse(Response baseResponse) {
		this.baseResponse = baseResponse;
	}



	public VodaBaseResponse getVodaBaseResponse() {
		return vodaResponse;
	}

	public void setVodaBaseResponse(VodaBaseResponse response) {
		this.vodaResponse = response;
	}

}
