package com.infosys.infygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infygo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}