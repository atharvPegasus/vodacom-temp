package com.azampgw.response;

import com.azampgw.Base.ServiceProvider;
import com.azampgw.Base.Transaction;

public class IncomingRequest {
	public ServiceProvider serviceProvider;
	public Transaction transaction;
	public ServiceProvider getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
}