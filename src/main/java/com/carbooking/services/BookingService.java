package com.carbooking.services;

import java.util.List;

import com.carbooking.entities.Booking;

public interface BookingService {
	public Booking save(Booking booking);

	public List<Booking> findAll();

	public Booking findById(Long id);

	public List<Booking> findByUserId(Long userId);

	public void deleteById(Long id);
}
