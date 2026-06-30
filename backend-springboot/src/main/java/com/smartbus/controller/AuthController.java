package com.smartbus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smartbus.dto.LoginRequestDTO;
import com.smartbus.dto.RegisterRequestDTO;
import com.smartbus.dto.UserResponseDTO;
import com.smartbus.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private AuthService authService;

    // Register API
    @PostMapping("/register")
    public String register(@RequestBody RegisterRequestDTO request) {

        return authService.register(request);

    }

    // Login API
    @PostMapping("/login")
    public UserResponseDTO login(@RequestBody LoginRequestDTO request) {

        return authService.login(request);

    }

}