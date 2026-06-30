package com.smartbus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smartbus.dto.UpdateProfileDTO;
import com.smartbus.dto.UserResponseDTO;
import com.smartbus.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    // Get Profile
    @GetMapping("/profile/{userId}")
    public UserResponseDTO getProfile(@PathVariable Long userId) {

        return userService.getProfile(userId);

    }

    // Update Profile
    @PutMapping("/profile/{userId}")
    public String updateProfile(@PathVariable Long userId,
                                @RequestBody UpdateProfileDTO request) {

        return userService.updateProfile(userId, request);

    }
}