package com.azampgw.Base;

import javax.validation.constraints.NotNull;

public class VodaBaseResponse {
	
	@NotNull(message = "conversationId is required.")
	public String conversationId;
	@NotNull(message = "originatorConversationId is required.")
	public String originatorConversationId;
	@NotNull(message = "transactionId is required.")
	public String transactionId;
	@NotNull(message = "responseCode is required.")
	public String responseCode;
	@NotNull(message = "responseDesc is required.")
	public String responseDesc;
	@NotNull(message = "serviceStatus is required.")
	public String serviceStatus;
	
	
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	public String getOriginatorConversationId() {
		return originatorConversationId;
	}
	public void setOriginatorConversationId(String originatorConversationId) {
		this.originatorConversationId = originatorConversationId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDesc() {
		return responseDesc;
	}
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}


}
