package com.MoviesTicketBooking.Service;

import java.util.List;

import com.MoviesTicketBooking.DTO.TicketBookingDto;
import com.MoviesTicketBooking.Model.TicketBookingEntity;



public interface TicketInterfaceService {
	 String bookTicket(TicketBookingDto dto);
	    List<TicketBookingEntity> getAllTickets();
	    String updateTicket(Long id, TicketBookingDto dto);
	    String deleteTicket(Long id);

}
