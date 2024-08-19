package com.picpaysimplificado.picpaysimplificado.repositories;

import com.picpaysimplificado.picpaysimplificado.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface transactionRepository extends JpaRepository<Transaction, Long> {
}
