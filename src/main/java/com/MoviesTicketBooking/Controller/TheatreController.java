package com.MoviesTicketBooking.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.MoviesTicketBooking.DTO.TheatreDto;
import com.MoviesTicketBooking.Service.TheatreService;

import java.util.List;

@RestController
@RequestMapping("/api/theatre")
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @PostMapping("/add")
    public String addTheatre(@RequestBody TheatreDto dto) {
        return theatreService.addTheatre(dto);
    }

    @GetMapping("/all")
    public List<TheatreDto> getAllTheatres() {
        return theatreService.getAllTheatres();
    }
    
    @PutMapping("/update/{id}")
    public String updateTheatreinfo(@PathVariable Long id, @RequestBody TheatreDto dto) {
    	return theatreService.updateTheatreinfo(id, dto);
    }
    
    @DeleteMapping("delete/{id}")
    public String deleteTheatre(@PathVariable Long id) {
    	return theatreService.deleteTheatre(id);
    }
}

