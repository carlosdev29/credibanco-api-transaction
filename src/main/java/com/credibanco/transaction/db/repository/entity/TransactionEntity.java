package com.credibanco.transaction.db.repository.entity;

public class TransactionEntity {
	
	private String id;
	private Integer ammmount;
	private TypeTransactionEntity typeTransaction;
	private CurrencyEntity currency; 
	private CardEntity card;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getAmmmount() {
		return ammmount;
	}
	public void setAmmmount(Integer ammmount) {
		this.ammmount = ammmount;
	}
	public TypeTransactionEntity getTypeTransaction() {
		return typeTransaction;
	}
	public void setTypeTransaction(TypeTransactionEntity typeTransaction) {
		this.typeTransaction = typeTransaction;
	}
	public CurrencyEntity getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyEntity currency) {
		this.currency = currency;
	}
	public CardEntity getCard() {
		return card;
	}
	public void setCard(CardEntity card) {
		this.card = card;
	}
	
	
	

}
