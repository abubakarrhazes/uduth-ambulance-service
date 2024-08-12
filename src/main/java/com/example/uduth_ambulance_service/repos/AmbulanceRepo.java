package com.example.uduth_ambulance_service.repos;

import com.example.uduth_ambulance_service.domain.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmbulanceRepo extends JpaRepository<Ambulance, Long> {

}
