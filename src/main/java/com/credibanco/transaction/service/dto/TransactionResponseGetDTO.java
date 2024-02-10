package com.credibanco.transaction.service.dto;

public class TransactionResponseGetDTO {
	
	private TransactionDTO transaction;	
	private StatusTransactionDTO statusTransactionDTO;
	
	public TransactionDTO getTransaction() {
		return transaction;
	}
	public void setTransaction(TransactionDTO transaction) {
		this.transaction = transaction;
	}
	public StatusTransactionDTO getStatusTransactionDTO() {
		return statusTransactionDTO;
	}
	public void setStatusTransactionDTO(StatusTransactionDTO statusTransactionDTO) {
		this.statusTransactionDTO = statusTransactionDTO;
	}
	
	

}
