package com.MoviesTicketBooking.Service;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MoviesTicketBooking.DTO.TicketBookingDto;
import com.MoviesTicketBooking.Model.TicketBookingEntity;
import com.MoviesTicketBooking.Model.UserRegisterEntity;
import com.MoviesTicketBooking.Repository.TicketBookingRepository;
import com.MoviesTicketBooking.Repository.UserRegisterRepository;


@Service
public class TicketBookingService implements TicketInterfaceService {

    @Autowired
    private TicketBookingRepository ticketRepo;

    @Autowired
    private UserRegisterRepository userRepo;

    @Override
    public String bookTicket(TicketBookingDto dto) {
        UserRegisterEntity user = userRepo.findById(dto.getUserId()).orElse(null);
        if (user == null) {
            return "User not found!";
        }

        if (!user.getUserEmail().equals(dto.getUserEmail())) {
            return "Email mismatch.";
        }

        LocalDate today = LocalDate.now();

        long userTicketsToday = ticketRepo.countByUserAndBookingDate(user, today);
        if (userTicketsToday >= 1) {
            return "User already booked a ticket today.";
        }

        long totalTicketsToday = ticketRepo.countByBookingDate(today);
        if (totalTicketsToday <= 5) {
            return "Maximum tickets for today are already booked.";
        }
        TicketBookingEntity ticket = new TicketBookingEntity();
        ticket.setUser(user);
        ticket.setBookingDate(dto.getBookingDate());
        ticket.setUserEmail(dto.getUserEmail());
        ticket.setMovieName(dto.getMovieName());
        ticket.setTheatreName(dto.getTheatreName());;
        ticket.setSeatNo(dto.getSeatNo());
        ticket.setPrice(dto.getPrice());
        ticket.setShowTime(dto.getShowTime());
        ticket.setUserIpAddress(dto.getUserIpAddress());

        
        ticketRepo.save(ticket);
        return "Ticket booked successfully.";
    }

    @Override
    public List<TicketBookingEntity> getAllTickets() {
        return ticketRepo.findAll();
    }

	@Override
	public String updateTicket(Long id, TicketBookingDto dto) {
		return ticketRepo.findById(id).map(user -> {
            user.setUserEmail(dto.getUserEmail());
            user.setMovieName(dto.getMovieName());
            user.setTheatreName(dto.getTheatreName());
            user.setUserEmail(dto.getUserEmail());
            user.setSeatNo(dto.getSeatNo());
            user.setShowTime(dto.getShowTime());
            user.setBookingDate(dto.getBookingDate());
            user.setPrice(dto.getPrice());
            user.setUserIpAddress(dto.getUserIpAddress());
            
            ticketRepo.save(user);
            return "Ticket updated successfully.";
        }).orElse("Ticket not found.");
    };

	@Override
	public String deleteTicket(Long id) {
		if (ticketRepo.existsById(id)) {
            ticketRepo.deleteById(id);
            return "Ticket deleted successfully.";
        }
        return "Ticket not found.";
	}
}

