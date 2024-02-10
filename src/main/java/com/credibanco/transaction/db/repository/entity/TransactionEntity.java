package com.credibanco.transaction.db.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_transaction")
public class TransactionEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_transaction")
	private Integer id;
	
	private Integer ammmount;
	
	@ManyToOne
	@JoinColumn(name = "id_transaction_type")
	private TypeTransactionEntity typeTransaction;
	
	@ManyToOne
	@JoinColumn(name = "id_currency")
	private CurrencyEntity currency; 
	
	@ManyToOne
	@JoinColumn(name = "id_card")
	private CardEntity card;
	
	
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
