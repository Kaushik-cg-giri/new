package com.example.lti.CustomerDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lti.model.Customer;

@Repository
public interface CustomerJpaDao extends JpaRepository<Customer,Integer>{

}
