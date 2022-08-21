package com.infosys.infygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.infygo.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Double> {

}
