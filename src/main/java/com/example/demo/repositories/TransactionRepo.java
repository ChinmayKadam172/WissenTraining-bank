package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {
  
}
