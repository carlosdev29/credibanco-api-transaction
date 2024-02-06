package com.credibanco.transaction.db.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ITransactionRepository extends JpaRepository<TransactionEntity, Integer>{

}
