package com.example.uduth_ambulance_service.config.security;

import com.example.uduth_ambulance_service.domain.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GeneratedUserDetails implements UserDetails {
    private static final long serialVersionUID = 1L;



    private String username;
    private String password;
    private List<GrantedAuthority> roles;

    public GeneratedUserDetails(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.roles = Collections.singletonList(new SimpleGrantedAuthority(user.getRole().name()));

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }
}
