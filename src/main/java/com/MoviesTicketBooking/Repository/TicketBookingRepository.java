package com.MoviesTicketBooking.Repository;


import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MoviesTicketBooking.Model.TicketBookingEntity;
import com.MoviesTicketBooking.Model.UserRegisterEntity;


public interface TicketBookingRepository extends JpaRepository <TicketBookingEntity, Long> {

    long countByUserAndBookingDate(UserRegisterEntity user, LocalDate bookingDate);

    long countByBookingDate(LocalDate bookingDate);
}


