package com.example.uduth_ambulance_service.repos;

import com.example.uduth_ambulance_service.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<Staff , Long> {
}
