package com.credibanco.transaction.db.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_transaction_type")
public class TypeTransactionEntity {
	
	
	@Id
	@Column(name = "id_transaction_type")
	private Integer id;
	
	@Column(name = "name_transaction_type")
	private String typeName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	

}
