package com.movie.dto;

import com.movie.entity.PaymentInfo;
import com.movie.entity.TicketInfo;

public class MovieTicketRequest {
	
	private TicketInfo ticketInfo;
	private PaymentInfo paymentInfo;
	public TicketInfo getTicketInfo() {
		return ticketInfo;
	}
	public void setTicketInfo(TicketInfo ticketInfo) {
		this.ticketInfo = ticketInfo;
	}
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	@Override
	public String toString() {
		return "MovieTicketRequest [ticketInfo=" + ticketInfo + ", paymentInfo=" + paymentInfo + "]";
	}
	
	

}
