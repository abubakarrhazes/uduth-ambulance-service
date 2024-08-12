package com.example.uduth_ambulance_service.services;

import com.example.uduth_ambulance_service.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User createUser();

    public List<User> getAllUsers();

    public List<User> getUsersByType(String userType);

    public Optional<User> getUserByUsername(String username);



}
