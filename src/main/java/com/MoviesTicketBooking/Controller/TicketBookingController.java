package com.MoviesTicketBooking.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.MoviesTicketBooking.DTO.TicketBookingDto;
import com.MoviesTicketBooking.Model.TicketBookingEntity;
import com.MoviesTicketBooking.Service.TicketBookingService;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketBookingController {

    @Autowired
    private TicketBookingService ticketService;

    @PostMapping("/book")
    public String bookTicket(@RequestBody TicketBookingDto dto) {
        return ticketService.bookTicket(dto);
    }

    @GetMapping("/all")
    public List<TicketBookingEntity> getAllTickets() {
        return ticketService.getAllTickets();
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateTicket(
            @PathVariable Long id,
            @RequestBody TicketBookingDto dto) {
        String response = ticketService.updateTicket(id, dto);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        String response = ticketService.deleteTicket(id);
        return ResponseEntity.ok(response);
    }

}

