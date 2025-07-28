package com.MoviesTicketBooking.Service;

import java.util.List;

import com.MoviesTicketBooking.DTO.TheatreDto;


public interface TheatreInterfaceService {
	String addTheatre(TheatreDto dto);
    List<TheatreDto> getAllTheatres();
    String updateTheatreinfo(Long id,TheatreDto dto);
    String deleteTheatre(Long id);

}
