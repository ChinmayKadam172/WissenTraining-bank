package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transaction {
  @Id
  @Column(name="senderId")
  private int senderId;
  @Column(name="receiverId")
  private int receiverId;
  private int amount;
  private String ifsc;

  public Transaction() {
  }

  public Transaction(int senderId, int receiverId, int amount, String ifsc) {
    this.senderId = senderId;
    this.receiverId = receiverId;
    this.amount = amount;
    this.ifsc = ifsc;
  }

  public String getIfsc() {
    return ifsc;
  }

  public void setIfsc(String ifsc) {
    this.ifsc = ifsc;
  }

  public int getSenderId() {
    return senderId;
  }

  public void setSenderId(int senderId) {
    this.senderId = senderId;
  }

  public int getReceiverId() {
    return receiverId;
  }

  public void setReceiverId(int receiverId) {
    this.receiverId = receiverId;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

}
