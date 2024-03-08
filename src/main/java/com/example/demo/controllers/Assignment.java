package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Accounts;
import com.example.demo.entities.Student;
import com.example.demo.entities.Transaction;
import com.example.demo.repositories.AccountsRepo;
import com.example.demo.repositories.StudentRepo;
import com.example.demo.repositories.TransactionRepo;

@RestController
public class Assignment {

        @Autowired
        AccountsRepo accountsInterface;

        @Autowired
        TransactionRepo transactionInterface;

        @PostMapping("/register")
        public String addAccount(@RequestBody Accounts a) {
                if (a != null) {
                        accountsInterface.save(a);
                        return "Account created";
                }

                return "Account not created";
        }

        @GetMapping("/login")
        public boolean loginAccount(int cid, String pwd) {
                Optional<Accounts> a = accountsInterface.findById(cid);
                System.out.println(a.get());
                if (a.get().getPwd() == pwd)
                        return true;
                return false;
        }

        @PostMapping("/changepwd/{cid}/{oldpwd}/{newpwd}")
        public boolean changeAccountPassword(@PathVariable int cid, @PathVariable String oldpwd,
                        @PathVariable String newpwd) {
                Accounts a = accountsInterface.findById(cid).get();
                if (a.getPwd() == oldpwd) {
                        a.setPwd(newpwd);
                        accountsInterface.save(a);
                        return true;
                }
                return false;
        }

        @PostMapping("/transfer")
        public boolean transferAmountFromAccount(@RequestParam int amount, @RequestBody Transaction tr) {
                Accounts sender = accountsInterface.findById(tr.getSenderId()).get();
                Accounts receiver = accountsInterface.findById(tr.getReceiverId()).get();
                if (sender.getBalance() >= amount) {
                        sender.setBalance(sender.getBalance() - amount);
                        receiver.setBalance(receiver.getBalance() + amount);
                        accountsInterface.save(sender);
                        accountsInterface.save(receiver);
                        return true;
                }
                return false;

        }

        @GetMapping("balance/{accountNo}")
        public String getBalance(@PathVariable int accountNo) {
                List<Accounts> a = accountsInterface.findByAccountNo(accountNo);
                return "Account balance is " + a.get(0).getBalance();
        }

        @GetMapping("accounts/below")
        public String getAccountsbelowAmount(int amount) {
                return "Accounts below the amount Rs." + amount + " is " +
                                accountsInterface.findByBalanceLessThan(amount);
        }

        @GetMapping("accounts/above")
        public String getAccountsAboveAmount(int amount) {
                return "Accounts below the amount Rs." + amount + " is " +
                                accountsInterface.findByBalanceGreaterThan(amount);
        }



}
