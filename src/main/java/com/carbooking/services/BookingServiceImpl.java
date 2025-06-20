package com.carbooking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carbooking.entities.Booking;
import com.carbooking.repositories.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public Booking save(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public List<Booking> findAll() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking findById(Long id) {
		return bookingRepository.findById(id).orElse(null);
	}

	@Override
	public List<Booking> findByUserId(Long userId) {
		return bookingRepository.findByUserId(userId);
	}

	@Override
	public void deleteById(Long id) {
		bookingRepository.deleteById(id);
	}

}
