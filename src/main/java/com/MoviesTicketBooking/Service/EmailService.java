package com.MoviesTicketBooking.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	    @Autowired
	    private JavaMailSender mailSender;

	    public void sendRegistrationSuccessMail(String toEmail, String userName) throws Exception {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(toEmail);
	        message.setSubject("User Registration Success");
	        message.setText("Dear " + userName + ",\n\nYour registration was successful.\n\nThank you!\nMovie Ticket Booking Team");
	        mailSender.send(message);
	    }
	}
