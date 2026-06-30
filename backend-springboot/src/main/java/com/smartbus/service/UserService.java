package com.smartbus.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartbus.dto.UpdateProfileDTO;
import com.smartbus.dto.UserResponseDTO;
import com.smartbus.entity.User;
import com.smartbus.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Get User Profile
    public UserResponseDTO getProfile(Long userId) {

        Optional<User> optionalUser = userRepository.findById(userId);

        if (optionalUser.isPresent()) {

            User user = optionalUser.get();

            UserResponseDTO response = new UserResponseDTO();
            response.setUserId(user.getUserId());
            response.setFullName(user.getFullName());
            response.setRole(user.getRole());

            return response;
        }

        return null;
    }

    // Update User Profile
    public String updateProfile(Long userId, UpdateProfileDTO request) {

        Optional<User> optionalUser = userRepository.findById(userId);

        if (optionalUser.isPresent()) {

            User user = optionalUser.get();

            user.setFullName(request.getFullName());
            user.setEmail(request.getEmail());
            user.setMobileNumber(request.getMobileNumber());

            userRepository.save(user);

            return "Profile Updated Successfully";
        }

        return "User Not Found";
    }
}