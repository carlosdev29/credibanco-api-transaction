package com.credibanco.transaction.service;

import com.credibanco.transaction.service.dto.TransactionRequestDTO;
import com.credibanco.transaction.service.dto.TransactionResponseCancelTRDTO;
import com.credibanco.transaction.service.dto.TransactionResponseDTO;
import com.credibanco.transaction.service.dto.TransactionResponseGetDTO;

public interface ITransactionService {
	
	public TransactionResponseDTO setBought(TransactionRequestDTO transactionRequestDTO);
	
	public TransactionResponseGetDTO getTransactionById(Integer id);
	
	public TransactionResponseCancelTRDTO setCancelTransaction ();
	
	
	
	
}
