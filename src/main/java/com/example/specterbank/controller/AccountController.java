package com.example.specterbank.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.specterbank.model.Account;
import com.example.specterbank.model.Customer;
import com.example.specterbank.service.AccountService;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accService;
	
	@PostMapping("/account")
	public Account addAccount(@RequestBody Account account) {
		
		Account acc = accService.saveAccount(account);
		return acc;
		
	}
	
	@GetMapping("/accounts")
	public List<Account> getAllAccs() {
		
		return accService.getAllAccs();
		
	}
	
	@GetMapping("/account/accountID}")
	public Account findAcc(@PathVariable("accountID") Integer accid) {
		
		Account acc = accService.findAccount(accid);
		return acc;
		
	}
	
	@PutMapping("/account")
	public Account updateAcc(@RequestBody Account account) {
		
		Account acc = accService.updateAccount(account);
		return acc;
		
	}
	
	@DeleteMapping("/account/{accountID}")
	public String deleteAcc(@PathVariable("accountID") Integer accid) {
		
		accService.deleteAccount(accid);
		return "Account has been removed from the repository.";
		
	}
	
	@PutMapping("/transfer/{accountid1}/{accountid2}/{transamount}")
	public Account transfer(@PathVariable("accountid1") Integer accountid1, @PathVariable("accountid2") Integer accountid2, @PathVariable("transamount") Integer transamount) {
		System.out.println("Transfer Amount");
		Account acc = accService.transfermoney(accountid1, accountid2, transamount);
		return acc;
		
	}

}
