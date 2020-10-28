package com.example.specterbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.specterbank.model.Account;
import com.example.specterbank.model.Customer;
import com.example.specterbank.repository.AccountRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository accrepo;
	
    public Account saveAccount(Account account) {
		
		return accrepo.save(account);
		
	}
	
	public Account findAccount(Integer accountid) {
		
		return accrepo.findById(accountid).get();
		
	}

	public List<Account> getAllAccs() {
		
		List<Account> accounts = new ArrayList<Account>();
		accrepo.findAll().forEach(accounts1 ->accounts.add(accounts1));
		return accounts;
		
	}

	public Account updateAccount(Account account) {
		
		return accrepo.save(account);
		
	}

	public void deleteAccount(Integer accountid) {
		
		accrepo.deleteById(accountid);
		
	}
	
	public Account transfermoney(Integer accountid1, Integer accountid2, Integer transamount) {
		int accountbal1;
		int accountbal2;
		Account acc1, acc2;
		acc1 = accrepo.findById(accountid1).get();
		acc2 = accrepo.findById(accountid2).get();
		accountbal1 = acc1.getAccountBalance();
		accountbal1 = accountbal1 - transamount;
		accountbal2 = acc2.getAccountBalance();
		accountbal2 = accountbal2 + transamount;
		acc1.setAccountBalance(accountbal1);
		acc2.setAccountBalance(accountbal2);
		accrepo.save(acc2);
		return accrepo.save(acc1);
	}

}
