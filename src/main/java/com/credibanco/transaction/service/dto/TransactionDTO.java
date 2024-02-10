package com.credibanco.transaction.service.dto;

import java.util.Date;

import com.credibanco.transaction.db.repository.entity.CardEntity;
import com.credibanco.transaction.db.repository.entity.CurrencyEntity;
import com.credibanco.transaction.db.repository.entity.TypeTransactionEntity;



public class TransactionDTO {
	
	private Integer id;
	private Integer ammmount;
	private TypeTransactionDTO typeTransaction;
	private CurrencyDTO currency; 
	private CardDTO card;
	private Date creationDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAmmmount() {
		return ammmount;
	}
	public void setAmmmount(Integer ammmount) {
		this.ammmount = ammmount;
	}
	
	public CardDTO getCard() {
		return card;
	}
	public void setCard(CardDTO card) {
		this.card = card;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public TypeTransactionDTO getTypeTransaction() {
		return typeTransaction;
	}
	public void setTypeTransaction(TypeTransactionDTO typeTransaction) {
		this.typeTransaction = typeTransaction;
	}
	public CurrencyDTO getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyDTO currency) {
		this.currency = currency;
	}
	
	
	
	
	

}
