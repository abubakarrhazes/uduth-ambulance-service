package com.example.uduth_ambulance_service.config.security;


import com.example.uduth_ambulance_service.domain.User;
import com.example.uduth_ambulance_service.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

@Configuration
public class GeneratedUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepo.findByUsername(username);
        return user.map(GeneratedUserDetails::new).orElseThrow(()->new UsernameNotFoundException("User Not Found"));
    }
}
