package com.azampgw.Base;

import javax.validation.constraints.NotNull;

public class CallBackTransaction {
	@NotNull(message = "resultType is required.")
	public String resultType;
	@NotNull(message = "resultCode is required.")
	public String resultCode;
	@NotNull(message = "resultDesc is required.")
	public String resultDesc;
	@NotNull(message = "serviceRecipt is required.")
	public String serviceRecipt;
	@NotNull(message = "serviceDate is required.")
	public String serviceDate;
	@NotNull(message = "serviceId is required.")
	public String serviceId;
	@NotNull(message = "originatorConversationId is required.")
	public String originatorConversationId;
	@NotNull(message = "conversationId is required.")
	public String conversationId;
	@NotNull(message = "transactionId is required.")
	public String transactionId;
	
	
	public String getResultType() {
		return resultType;
	}
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultDesc() {
		return resultDesc;
	}
	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getServiceRecipt() {
		return serviceRecipt;
	}
	public void setServiceRecipt(String serviceRecipt) {
		this.serviceRecipt = serviceRecipt;
	}
	public String getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getOriginatorConversationId() {
		return originatorConversationId;
	}
	public void setOriginatorConversationId(String originatorConversationId) {
		this.originatorConversationId = originatorConversationId;
	}
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getInitiator() {
		return initiator;
	}
	public void setInitiator(String initiator) {
		this.initiator = initiator;
	}
	public String getInitiatorPassword() {
		return initiatorPassword;
	}
	public void setInitiatorPassword(String initiatorPassword) {
		this.initiatorPassword = initiatorPassword;
	}
	public String initiator;
	public String initiatorPassword;

}
