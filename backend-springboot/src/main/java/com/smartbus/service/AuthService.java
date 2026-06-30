package com.smartbus.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartbus.dto.LoginRequestDTO;
import com.smartbus.dto.RegisterRequestDTO;
import com.smartbus.dto.UserResponseDTO;
import com.smartbus.entity.User;
import com.smartbus.repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    // Register User
    public String register(RegisterRequestDTO request) {

        Optional<User> existingUser = userRepository.findByEmail(request.getEmail());

        if (existingUser.isPresent()) {
            return "Email already exists!";
        }

        User user = new User();

        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setMobileNumber(request.getMobileNumber());
        user.setPassword(request.getPassword());
        user.setRole(request.getRole());

        user.setStatus("ACTIVE");
        user.setCreatedDate(LocalDate.now());

        userRepository.save(user);

        return "Registration Successful";
    }

    // Login User
    public UserResponseDTO login(LoginRequestDTO request) {

        Optional<User> optionalUser = userRepository.findByEmail(request.getEmail());

        if (optionalUser.isPresent()) {

            User user = optionalUser.get();

            if (user.getPassword().equals(request.getPassword())) {

                UserResponseDTO response = new UserResponseDTO();

                response.setUserId(user.getUserId());
                response.setFullName(user.getFullName());
                response.setRole(user.getRole());

                return response;
            }
        }

        return null;
    }

}