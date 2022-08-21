package com.infosys.infygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infygo.entity.CreditCardDetails;

public interface CreditCardRepository extends JpaRepository<CreditCardDetails, String> {

}

