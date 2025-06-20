package com.carbooking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.carbooking.entities.Booking;
import com.carbooking.repositories.BookingRepository;
import com.carbooking.services.BookingService;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin("*")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private BookingRepository bookingRepository;

    // Create a new booking
    @PostMapping
    public ResponseEntity<Booking> bookService(@RequestBody Booking request) {
        Booking savedBooking = bookingService.save(request);
        return new ResponseEntity<>(savedBooking, HttpStatus.CREATED);
    }

    // Get all bookings
    @GetMapping
    public List<Booking> findAllBooking() {
        return bookingService.findAll();
    }

    // Get a booking by ID
    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Long id) {
        return bookingService.findById(id);
    }

    // Get bookings by user ID
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Booking>> getUserBookings(@PathVariable Long userId) {
        List<Booking> bookings = bookingRepository.findByUserId(userId);
        return ResponseEntity.ok(bookings);
    }

    // Delete a booking
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBooking(@PathVariable Long id) {
        bookingService.deleteById(id);
    }
}
