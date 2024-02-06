package com.credibanco.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.transaction.service.ITransactionService;
import com.credibanco.transaction.service.dto.TransactionRequestDTO;
import com.credibanco.transaction.service.dto.TransactionResponseDTO;

@RestController
@RequestMapping(value = "transaction")
public class TransactionController {
	
	@Autowired	
	private ITransactionService service;
	
	@PostMapping(value = "purchase")
	public TransactionResponseDTO setBought(TransactionRequestDTO ransactionRequestDTO) {
		TransactionResponseDTO transactionResponseDTO = 
				this.service.setBought(ransactionRequestDTO);
		return transactionResponseDTO;
	}

}
