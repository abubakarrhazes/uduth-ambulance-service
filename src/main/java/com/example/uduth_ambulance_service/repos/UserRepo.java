package com.example.uduth_ambulance_service.repos;

import com.example.uduth_ambulance_service.domain.User;
import com.example.uduth_ambulance_service.mappers.enums.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;




@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    List<User> findByUserType(UserType userType);


}
