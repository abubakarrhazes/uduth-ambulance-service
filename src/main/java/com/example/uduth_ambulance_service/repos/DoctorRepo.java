package com.example.uduth_ambulance_service.repos;

import com.example.uduth_ambulance_service.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {

}
