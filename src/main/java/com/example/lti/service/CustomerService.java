package com.example.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lti.CustomerDAO.CustomerJpaDao;
import com.example.lti.model.Customer;



@Service
@Transactional
public class CustomerService {
	@Autowired
	public CustomerJpaDao dao;

	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}

	public String delete(Integer customerId) {
		// TODO Auto-generated method stub
		Customer customer = dao.findById(customerId).get();
		if(customer!=null) {
			dao.delete(customer);
			return "customer detail deleted";
		}
		return "customer detail not available";
	}
	
	public String updateCustomer(Customer customer)
	{
		dao.save(customer);
		return "update sucessfully";
	}

	public List<Customer> viewCustomer() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
