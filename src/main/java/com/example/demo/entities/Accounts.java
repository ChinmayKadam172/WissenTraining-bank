package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accounts {
  @Id
  private int cid;
  private String pwd;
  @Column(name = "accountno")
  private int accountNo;
  private String type;
  @Column(name = "mobileno")
  private long mobileNo;
  private String ifsc;
  private long balance;

  @Override
  public String toString() {
    return "Accounts [cid=" + cid + ", pwd=" + pwd + ", accountNo=" + accountNo + ", type=" + type + ", mobileNo="
        + mobileNo + ", ifsc=" + ifsc + ", balance=" + balance + "]";
  }

  public Accounts() {
  }

  public Accounts(int cid, String pwd, int accountNo, String type, long mobileNo, String ifsc, long balance) {
    this.cid = cid;
    this.pwd = pwd;
    this.accountNo = accountNo;
    this.type = type;
    this.mobileNo = mobileNo;
    this.ifsc = ifsc;
    this.balance = balance;
  }

  public int getCid() {
    return cid;
  }

  public void setCid(int cid) {
    this.cid = cid;
  }

  public String getPwd() {
    return pwd;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public int getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(int accountNo) {
    this.accountNo = accountNo;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(long mobileNo) {
    this.mobileNo = mobileNo;
  }

  public String getIfsc() {
    return ifsc;
  }

  public void setIfsc(String ifsc) {
    this.ifsc = ifsc;
  }

}
