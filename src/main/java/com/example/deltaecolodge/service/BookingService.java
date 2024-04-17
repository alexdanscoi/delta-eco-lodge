package com.example.deltaecolodge.service;

import com.example.deltaecolodge.model.BookedRoom;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface BookingService {


    void cancelBooking(Long bookingId);

    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBookings();

    List<BookedRoom> getBookingsByUserEmail(String email);
}
