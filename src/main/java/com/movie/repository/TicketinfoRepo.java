package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.entity.TicketInfo;

public interface TicketinfoRepo extends JpaRepository<TicketInfo, Integer> {

	
}
