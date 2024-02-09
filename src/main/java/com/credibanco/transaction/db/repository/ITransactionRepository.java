package com.credibanco.transaction.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credibanco.transaction.db.repository.entity.TransactionEntity;


@Repository
public interface ITransactionRepository extends JpaRepository<TransactionEntity, Integer>{

}
