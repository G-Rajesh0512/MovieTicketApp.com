package com.MoviesTicketBooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.MoviesTicketBooking.DTO.UserRegisterDto;
import com.MoviesTicketBooking.Model.UserRegisterEntity;
import com.MoviesTicketBooking.Service.UserRegisterService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRegisterController {

    @Autowired
    private UserRegisterService userService;

    @PostMapping("/send-otp")
    public ResponseEntity<String> sendOtp(@RequestParam String email) {
        String message = userService.sendOtp(email);
        return ResponseEntity.ok(message);
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(
            @RequestParam String otp,
            @RequestParam String userEmail,
            @RequestBody UserRegisterDto dto) throws Exception {
        String result = userService.registerUser(dto, otp, userEmail);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/get")
    public List<UserRegisterEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody UserRegisterDto dto) {
        String response = userService.updateUser(id, dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        String response = userService.deleteUser(id);
        return ResponseEntity.ok(response);
    }
}

