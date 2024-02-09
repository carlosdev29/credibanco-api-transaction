package com.credibanco.transaction.client.dto;

public class CardBalanceResponseDTO {
	
	private Integer balance;
	private StatusClientResponseDTO statusResponseDTO;
	
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public StatusClientResponseDTO getStatusResponseDTO() {
		return statusResponseDTO;
	}
	public void setStatusResponseDTO(StatusClientResponseDTO statusResponseDTO) {
		this.statusResponseDTO = statusResponseDTO;
	}
	
	
	

}
