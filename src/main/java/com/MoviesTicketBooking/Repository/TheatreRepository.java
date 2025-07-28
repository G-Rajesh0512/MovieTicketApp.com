package com.MoviesTicketBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MoviesTicketBooking.Model.TheatreEntity;

public interface TheatreRepository extends JpaRepository<TheatreEntity,Long> {

}
