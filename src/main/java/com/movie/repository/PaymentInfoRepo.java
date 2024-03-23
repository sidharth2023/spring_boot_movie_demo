package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.entity.PaymentInfo;

public interface PaymentInfoRepo  extends JpaRepository<PaymentInfo, Long> {
	

}
