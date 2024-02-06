package com.credibanco.transaction.service.impl;

import org.springframework.stereotype.Service;

import com.credibanco.transaction.service.ITransactionService;
import com.credibanco.transaction.service.dto.TransactionRequestDTO;
import com.credibanco.transaction.service.dto.TransactionResponseDTO;


@Service
public class TransactionServiceImpl implements ITransactionService {
	
	
	
	@Override
	public TransactionResponseDTO setBought(TransactionRequestDTO transactionRequestDTO) {
		//Consultar con el numero la entity de la tarjeta
		
		//Actualizar la entity con el nuevo saldo despues de restar la compraal saldo actual
		//devolver la respuesta
		return null;
	}

}
