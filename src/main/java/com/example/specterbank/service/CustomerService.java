package com.example.specterbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.specterbank.model.Customer;
import com.example.specterbank.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository custrepo;
	
	public Customer saveCustomer(Customer customer) {
		
		return custrepo.save(customer);
		
	}
	
	public Customer findCustomer(Integer custid) {
		
		return custrepo.findById(custid).get();
		
	}

	public List<Customer> getAllCustomers() {
		
		List<Customer> customers = new ArrayList<Customer>();
		custrepo.findAll().forEach(customers1 ->customers.add(customers1));
		return customers;
		
	}

	public Customer updateCustomer(Customer customer) {
		
		return custrepo.save(customer);
		
	}

	public void deleteCustomer(Integer custid) {
		
		custrepo.deleteById(custid);
		
	}

}
