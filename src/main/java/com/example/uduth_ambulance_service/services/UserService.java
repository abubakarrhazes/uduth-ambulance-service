package com.example.uduth_ambulance_service.services;

import com.example.uduth_ambulance_service.domain.User;
import com.example.uduth_ambulance_service.mappers.enums.UserType;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User createUser(User user);

    public List<User> getAllUsers();

    public List<User> getUsersByType(UserType userType);

    public Optional<User> getUserByUsername(String username);

    public User authenticate(String username , String password);



}
