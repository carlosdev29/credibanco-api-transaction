package com.credibanco.transaction.service;

import com.credibanco.transaction.service.dto.TransactionRequestDTO;
import com.credibanco.transaction.service.dto.TransactionResponseDTO;

public interface ITransactionService {
	
	public TransactionResponseDTO setBought(TransactionRequestDTO transactionRequestDTO);
	
	
}
