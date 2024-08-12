package com.example.uduth_ambulance_service.services.impl;

import com.example.uduth_ambulance_service.domain.User;
import com.example.uduth_ambulance_service.repos.UserRepo;
import com.example.uduth_ambulance_service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {




    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User createUser() {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public List<User> getUsersByType(String userType) {
        return null;
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return Optional.empty();
    }
}
