package com.example.specterbank.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table
public class Account implements Serializable {
	
	@Id
	@Column
	private int accountID;
	@Column
	private String ifsc;
	@Column
	private String accountType;
	@Column
	private String savOrCur;
	@Column
	private int accountBalance;
	
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getSavOrCur() {
		return savOrCur;
	}
	public void setSavOrCur(String savOrCur) {
		this.savOrCur = savOrCur;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
