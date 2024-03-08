package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Accounts;

public interface AccountsRepo extends JpaRepository<Accounts, Integer> {
  public List<Accounts> findByAccountNo(int accountNo);

  public List<Accounts> findByBalanceLessThan(int amount);

  public List<Accounts> findByBalanceGreaterThan(int amount);
}
