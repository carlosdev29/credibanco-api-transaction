package com.credibanco.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.transaction.service.ITransactionService;
import com.credibanco.transaction.service.dto.TransactionRequestDTO;
import com.credibanco.transaction.service.dto.TransactionResponseCancelTRDTO;
import com.credibanco.transaction.service.dto.TransactionRequestCancelTRDTO;
import com.credibanco.transaction.service.dto.TransactionResponseDTO;
import com.credibanco.transaction.service.dto.TransactionResponseGetDTO;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController {
	
	@Autowired	
	private ITransactionService service;
	
	
	
	@PostMapping(value = "/purchase")
	public TransactionResponseDTO setBought(TransactionRequestDTO ransactionRequestDTO) {
		TransactionResponseDTO transactionResponseDTO = 
				this.service.setBought(ransactionRequestDTO);
		return transactionResponseDTO;
	}
	
	
	@GetMapping(value = "/{transactionId}")
	public TransactionResponseGetDTO getTransaction(@PathVariable Integer transactionId) {
		TransactionResponseGetDTO transactionResponseGetDTO = 
				this.service.getTransactionById(transactionId);
		return transactionResponseGetDTO;
	}
	
	@PostMapping(value = "/anulation")
	public TransactionResponseCancelTRDTO setNullification(
			TransactionRequestCancelTRDTO trRequest ) {
		TransactionResponseCancelTRDTO responseService = this.service.setCancelTransaction();
		return responseService;
	}
	
	

}
