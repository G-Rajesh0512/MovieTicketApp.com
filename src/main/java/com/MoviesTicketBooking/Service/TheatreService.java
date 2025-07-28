package com.MoviesTicketBooking.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MoviesTicketBooking.DTO.TheatreDto;
import com.MoviesTicketBooking.Model.TheatreEntity;
import com.MoviesTicketBooking.Repository.TheatreRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TheatreService implements TheatreInterfaceService {

    @Autowired
    private TheatreRepository theatreRepository;

    @Override
    public String addTheatre(TheatreDto dto) {
        TheatreEntity theatre = new TheatreEntity();
        theatre.setTheatreid(dto.getTheatreid());
        theatre.setTheatreName(dto.getTheatreName());
        theatre.setTheatrelocation(dto.getTheatrelocation());
        theatre.setTheatreseatCount(dto.getTheatreseatCount());;
        theatre.setTheatreseatNumber(dto.getTheatreseatNumber());
        theatreRepository.save(theatre);
        return "Theatre added successfully!";
    }

    @Override
    public List<TheatreDto> getAllTheatres() {
        List<TheatreEntity> theatres = theatreRepository.findAll();
        return theatres.stream().map(theatre -> {
            TheatreDto dto = new TheatreDto();
            dto.setTheatreid(theatre.getTheatreid());
            dto.setTheatreName(theatre.getTheatreName());
            dto.setTheatrelocation(theatre.getTheatrelocation());
            dto.setTheatreseatCount(theatre.getTheatreseatCount());
            dto.setTheatreseatNumber(theatre.getTheatreseatNumber());
            return dto;
        }).collect(Collectors.toList());
    }

	@Override
	public String updateTheatreinfo(Long id, TheatreDto dto) {
		return theatreRepository.findById(id).map(user -> {
            user.setTheatreName(dto.getTheatreName());
            user.setTheatrelocation(dto.getTheatrelocation());
            user.setTheatreseatCount(dto.getTheatreseatCount());
            user.setTheatreseatNumber(dto.getTheatreseatNumber());
            theatreRepository.save(user);
            return "Theatreinfo updated successfully.";
        }).orElse("Theatreinfo not found.");
    };

	@Override
	public String deleteTheatre(Long id) {
			if (theatreRepository.existsById(id)) {
	            theatreRepository.deleteById(id);
	            return "Theatre deleted successfully.";
	        }
	        return "Theatre Not Found.";
	}
}
