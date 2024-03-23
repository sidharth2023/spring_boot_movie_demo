package com.movie.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dto.MovieTicketAcknowledgement;
import com.movie.dto.MovieTicketRequest;
import com.movie.entity.PaymentInfo;
import com.movie.entity.TicketInfo;
import com.movie.repository.PaymentInfoRepo;
import com.movie.repository.TicketinfoRepo;
import com.movie.utility.ValidatePaymentInfo;

import jakarta.transaction.Transactional;

@Service
public class MovieTicketService {
	
	@Autowired
	TicketinfoRepo ticketinfoRepo;
	
	@Autowired
	PaymentInfoRepo paymentInfoRepo;
	
	@Transactional
	public MovieTicketAcknowledgement  bookMovieTicket(MovieTicketRequest request) {
		 TicketInfo ticketInfo= request.getTicketInfo();
		 ticketInfo=ticketinfoRepo.save(ticketInfo);
		 
		 PaymentInfo paymentInfo=request.getPaymentInfo();
		 
		 ValidatePaymentInfo.validateCreditLimit(paymentInfo.getAccountNo(), ticketInfo.getTicketPrice());
		 
		 paymentInfo.setTicketId(ticketInfo.getId());
		 paymentInfo.setAmmount(ticketInfo.getTicketPrice());
		 
		 paymentInfoRepo.save(paymentInfo);
		 
		 return new MovieTicketAcknowledgement("SUCCESS", ticketInfo.getTicketPrice(),UUID.randomUUID().toString().split("-")[0] , ticketInfo);
		 
		 
	}

}
