package com.credibanco.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.transaction.client.ICardClient;
import com.credibanco.transaction.client.dto.CardBalanceRequestDTO;
import com.credibanco.transaction.client.dto.CardBalanceResponseDTO;
import com.credibanco.transaction.db.repository.ITransactionRepository;
import com.credibanco.transaction.db.repository.entity.TransactionEntity;
import com.credibanco.transaction.service.ITransactionService;
import com.credibanco.transaction.service.dto.StatusTransactionDTO;
import com.credibanco.transaction.service.dto.TransactionRequestDTO;
import com.credibanco.transaction.service.dto.TransactionResponseCancelTRDTO;
import com.credibanco.transaction.service.dto.TransactionResponseDTO;
import com.credibanco.transaction.service.dto.TransactionResponseGetDTO;


@Service
public class TransactionServiceImpl implements ITransactionService {
	
	private static final String TYPE_TRANSACTION = "C";
	
	
	@Autowired
	private ITransactionRepository repository;
	
	@Autowired
	private ICardClient apiServiceCard;
	
	
	@Override
	public TransactionResponseDTO setBought(TransactionRequestDTO transactionRequestDTO) {
		TransactionResponseDTO transactionResponseDTO = new TransactionResponseDTO();
		CardBalanceRequestDTO cardBalanceRequestDTO = new CardBalanceRequestDTO();
		//Consultar la entity con el id-substraer el id con  substring
		String transactionId = transactionRequestDTO.getCardId().substring(0,6);
		TransactionEntity transactionEntity = 
				this.repository.findById(Integer.valueOf(transactionId)).orElse(null);
		cardBalanceRequestDTO.setAmmount(transactionRequestDTO.getPrice());
		cardBalanceRequestDTO.setTypeTrans(TYPE_TRANSACTION);
		cardBalanceRequestDTO.setCardNumber(transactionRequestDTO.getCardId());
		CardBalanceResponseDTO responseClientCard  = this.apiServiceCard.updateBalance(cardBalanceRequestDTO);
		transactionResponseDTO.setBalance(responseClientCard.getBalance());
		StatusTransactionDTO statusTransactionDTO = new StatusTransactionDTO();
		statusTransactionDTO.setCod(responseClientCard.getStatusResponseDTO().getCode());
		statusTransactionDTO.setCod(responseClientCard.getStatusResponseDTO().getMessage());
		transactionResponseDTO.setStatusransaction(statusTransactionDTO);
		return transactionResponseDTO;
	}
	
	
	@Override
	public TransactionResponseGetDTO getTransactionById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	@Override
	public TransactionResponseCancelTRDTO setCancelTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

}
