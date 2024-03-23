package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.dto.MovieTicketAcknowledgement;
import com.movie.dto.MovieTicketRequest;
import com.movie.service.MovieTicketService;

@RestController
public class MovieTicketController {
	
	
	@Autowired
	 private MovieTicketService movieTicketService;
	
	
	@PostMapping("/bookMovieTicket")
	public  MovieTicketAcknowledgement bookTicket(@RequestBody MovieTicketRequest request) {
		
		return movieTicketService.bookMovieTicket(request);
		
	}

}
