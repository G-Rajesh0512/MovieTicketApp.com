package com.MoviesTicketBooking.Service;

import java.util.List;

import com.MoviesTicketBooking.DTO.UserRegisterDto;
import com.MoviesTicketBooking.Model.UserRegisterEntity;


public interface UserRegisterinterfaceService {
	String registerUser(UserRegisterDto dto, String otp, String ipAddress) throws Exception;
    List<UserRegisterEntity> getAllUsers();
    String updateUser(Long id, UserRegisterDto dto);
    String deleteUser(Long id);

}
