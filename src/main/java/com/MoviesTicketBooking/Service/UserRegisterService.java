package com.MoviesTicketBooking.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MoviesTicketBooking.DTO.UserRegisterDto;
import com.MoviesTicketBooking.Model.UserRegisterEntity;
import com.MoviesTicketBooking.Repository.UserRegisterRepository;

import java.util.List;

@Service
public class UserRegisterService {

    @Autowired
    private UserRegisterRepository userRepo;

    @Autowired
    private OtpService otpService;

    @Autowired
    private EmailService emailService;
    
    private static final int MAX_USERS = 10;

    public String sendOtp(String email) {
        return otpService.generateOtp(email);
    }

    public String registerUser(UserRegisterDto dto, String otp, String email) throws Exception {
        if (!otpService.validateOtp(email, otp)) {
            return "Invalid or expired OTP.";
        }
        if (userRepo.count() >= MAX_USERS) {
            return "Maximum user limit reached.";
        }

        UserRegisterEntity user = new UserRegisterEntity();
        user.setUserName(dto.getUserName());
        user.setUserAge(dto.getUserAge());
        user.setUserGender(dto.getUserGender());
        user.setUserEmail(dto.getUserEmail());
        user.setUserMobileno(dto.getUserMobileno());
        user.setUserRegisterationdate(dto.getUserRegisterationdate());
        user.setUserIpaddress(dto.getUserIpaddress());

        userRepo.save(user);
        emailService.sendRegistrationSuccessMail(email, dto.getUserName());

        return "User registered successfully, with valid otp.";
    }

    public List<UserRegisterEntity> getAllUsers() {
        return userRepo.findAll();
    }

    public String updateUser(Long id, UserRegisterDto dto) {
        UserRegisterEntity user = userRepo.findById(id).orElse(null);
        if (user == null) return "User not found.";

        user.setUserName(dto.getUserName());
        user.setUserAge(dto.getUserAge());
        user.setUserGender(dto.getUserGender());
        user.setUserMobileno(dto.getUserMobileno());
        user.setUserEmail(dto.getUserEmail());
        user.setUserRegisterationdate(dto.getUserRegisterationdate());
        user.setUserIpaddress(dto.getUserIpaddress());

        userRepo.save(user);
        return "User updated successfully.";
    }

    public String deleteUser(Long id) {
        userRepo.deleteById(id);
        return "User deleted successfully.";
    }
}