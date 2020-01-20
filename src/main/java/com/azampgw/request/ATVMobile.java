package com.azampgw.request;

public class ATVMobile {
	
	public String mobileNumber;
	// This is set to be MPESA Receipt which is unique
	public String transactionNumber;
	

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
