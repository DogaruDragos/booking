package com.challenge.booking;

import com.challenge.booking.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingApplication {


	@Autowired
	Service service;

	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}

}
