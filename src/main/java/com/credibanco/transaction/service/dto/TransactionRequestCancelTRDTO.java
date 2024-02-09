package com.credibanco.transaction.service.dto;

public class TransactionRequestCancelTRDTO {
	
	private Integer transactionId;
	private String cardId;
	
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
	
	
	

}
