package com.azampgw.Base;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="transaction")
public class Transaction{
	@NotNull(message = "amount is required.")
    public String amount;
	public String commandId;
    @NotNull(message = "initiator is required.")
    public String initiator;
    @NotNull(message = "originatorConversationId is required.")
    public String originatorConversationId;
    @NotNull(message = "recipent is required.")
    public String recipent;
    @NotNull(message = "mpesaRecipt is required.")
    public String mpesaRecipt;
    @NotNull(message = "transactionDate is required.")
    public String transactionDate;
    @NotNull(message = "accountReference is required.")
    public String accountReference;
    @NotNull(message = "transactionId is required.")
    public String transactionId;
    @NotNull(message = "conversationId is required.")
    public String conversationId;

    public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCommandId() {
		return commandId;
	}
	public void setCommandId(String commandId) {
		this.commandId = commandId;
	}
	public String getInitiator() {
		return initiator;
	}
	public void setInitiator(String initiator) {
		this.initiator = initiator;
	}
	public String getOriginatorConversationId() {
		return originatorConversationId;
	}
	public void setOriginatorConversationId(String originatorConversationId) {
		this.originatorConversationId = originatorConversationId;
	}
	public String getRecipent() {
		return recipent;
	}
	public void setRecipent(String recipent) {
		this.recipent = recipent;
	}
	public String getMpesaRecipt() {
		return mpesaRecipt;
	}
	public void setMpesaRecipt(String mpesaRecipt) {
		this.mpesaRecipt = mpesaRecipt;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getAccountReference() {
		return accountReference;
	}
	public void setAccountReference(String accountReference) {
		this.accountReference = accountReference;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	
}
	
