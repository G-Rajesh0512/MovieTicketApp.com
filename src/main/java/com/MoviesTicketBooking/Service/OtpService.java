package com.MoviesTicketBooking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class OtpService {

    @Autowired
    private JavaMailSender mailSender;

    private static final int EXPIRY_MINUTES = 10;

    private static class OtpEntry {
        String otp;
        LocalDateTime expiry;

        OtpEntry(String otp, LocalDateTime expiry) {
            this.otp = otp;
            this.expiry = expiry;
        }
    }

    private final Map<String, OtpEntry> otpMap = new HashMap<>();

    public String generateOtp(String email) {
        String otp = String.valueOf((int) (Math.random() * 900000) + 100000);
        otpMap.put(email, new OtpEntry(otp, LocalDateTime.now().plusMinutes(EXPIRY_MINUTES)));
        sendOtpEmail(email, otp);
        return "OTP sent to " + email;
    }

    private void sendOtpEmail(String toEmail, String otp) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Your OTP Code");
        message.setText("Your OTP for registration is: " + otp + "\nThis OTP is valid for 10 minutes.");
        mailSender.send(message);
    }

    public boolean validateOtp(String email, String otp) {
        OtpEntry entry = otpMap.get(email);
        if (entry == null) return false;

        boolean valid = otp.equals(entry.otp) && LocalDateTime.now().isBefore(entry.expiry);
        if (valid) otpMap.remove(email);
        return valid;
    }
    public void sendConfirmationEmail(String toEmail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Registration Successful");
        message.setText("Dear user,\n\nYour registration to Movie Ticket Booking App was successful.\n\nThank you!");
        mailSender.send(message);
    } 
}
