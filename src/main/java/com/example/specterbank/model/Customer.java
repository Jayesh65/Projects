package com.example.specterbank.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Customer implements Serializable {
	
	@Id
	@Column
	private int custID;
	@Column
	private String custName;
	@Column
	private String custAddress;
	@Column
	private Long custPhoneNo;
	@OneToMany(targetEntity = Account.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ca_fk", referencedColumnName = "custID")
    private List<Account> accounts;
	
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public Long getCustPhoneNo() {
		return custPhoneNo;
	}
	public void setCustPhoneNo(Long custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
