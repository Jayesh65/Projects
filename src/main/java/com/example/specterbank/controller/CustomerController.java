package com.example.specterbank.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.specterbank.model.Customer;
import com.example.specterbank.service.CustomerService;

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
public class CustomerController {
	@Autowired
	CustomerService custService;
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		Customer cust = custService.saveCustomer(customer);
		return cust;
		
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCusts() {
		
		return custService.getAllCustomers();
		
	}
	
	@GetMapping("/customer/{custID}")
	public Customer findCust(@PathVariable("custID") Integer custid) {
		
		Customer cust = custService.findCustomer(custid);
		return cust;
		
	}
	
	@PutMapping("/customer")
	public Customer updateCust(@RequestBody Customer customer) {
		
		Customer cust = custService.updateCustomer(customer);
		return cust;
		
	}
	
	@DeleteMapping("/customer/{custID}")
	public String deleteCust(@PathVariable("custID") Integer custid) {
		
		custService.deleteCustomer(custid);
		return "Customer has been removed from the repository.";
		
	}

}
