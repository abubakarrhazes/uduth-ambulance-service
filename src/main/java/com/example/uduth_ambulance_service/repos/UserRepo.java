package com.example.uduth_ambulance_service.repos;

import com.example.uduth_ambulance_service.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    List<User> findByUserType(String type);


}
