package com.example.uduth_ambulance_service.services;

import com.example.uduth_ambulance_service.domain.Doctor;

import java.util.List;

public interface DoctorService {


    public Doctor addDoctor(Doctor doctor);
    public List<Doctor> getAllDoctor();

}
