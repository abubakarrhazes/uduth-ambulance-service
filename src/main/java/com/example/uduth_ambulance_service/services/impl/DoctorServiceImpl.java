package com.example.uduth_ambulance_service.services.impl;

import com.example.uduth_ambulance_service.domain.Doctor;
import com.example.uduth_ambulance_service.repos.DoctorRepo;
import com.example.uduth_ambulance_service.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;
    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctor() {
        return doctorRepo.findAll();
    }
}
