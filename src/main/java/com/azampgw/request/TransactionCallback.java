package com.azampgw.request;

import com.azampgw.Base.CallBackTransaction;
import com.azampgw.Base.ServiceProvider;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@JacksonXmlRootElement(localName="request")
public class TransactionCallback {
	public ServiceProvider serviceProvider;
	public CallBackTransaction CallbackTransaction;
	
	public CallBackTransaction getCallbackTransaction() {
		return CallbackTransaction;
	}
	public void setCallbackTransaction(CallBackTransaction callbackTransaction) {
		CallbackTransaction = callbackTransaction;
	}
	public ServiceProvider getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	
}
