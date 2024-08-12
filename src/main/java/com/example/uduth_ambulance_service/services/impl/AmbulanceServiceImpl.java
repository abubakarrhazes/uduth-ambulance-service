package com.example.uduth_ambulance_service.services.impl;

import com.example.uduth_ambulance_service.domain.Ambulance;
import com.example.uduth_ambulance_service.domain.RequestAmbulance;
import com.example.uduth_ambulance_service.domain.User;
import com.example.uduth_ambulance_service.mappers.enums.Status;
import com.example.uduth_ambulance_service.repos.*;
import com.example.uduth_ambulance_service.services.AmbulanceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AmbulanceServiceImpl implements AmbulanceService {

    @Autowired
    private AmbulanceRepo ambulanceRepository;

    @Autowired
    private RequestAmbulanceRepo ambulanceRequestRepo;

    @Autowired
    private UserRepo userRepository;

    @Autowired
    private AssigneeRepo assigneeRepo;

    @Autowired
    private StaffRepo staffRepo;
    @Override
    public Ambulance addAmbulance(Ambulance ambulance) {
        return ambulanceRepository.save(ambulance);
    }

    @Override
    public List<Ambulance> getAllAmbulances() {
        return ambulanceRepository.findAll();
    }

    @Override
    public Ambulance updateAmbulance(Long ambulanceId, Ambulance ambulanceDetails) {
        Ambulance ambulance = ambulanceRepository.findById(ambulanceId)
                .orElseThrow(() -> new RuntimeException("Ambulance not found with id: " + ambulanceId));
        ambulance.setPlateNumber(ambulanceDetails.getPlateNumber());
        ambulance.setStatus(ambulanceDetails.getStatus());
        ambulance.setLocation(ambulanceDetails.getLocation());
        return ambulanceRepository.save(ambulance);
    }

    @Override
    public RequestAmbulance requestAmbulance(Long ambulanceId, String username) {
        Ambulance ambulance = ambulanceRepository.findById(ambulanceId)
                .orElseThrow(() -> new RuntimeException("Ambulance not found with id: " + ambulanceId));

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found with username: " + username));

        if (!ambulance.getStatus().equals(Status.AVAILABLE)) {
            throw new RuntimeException("Ambulance is not available");
        }

        ambulance.setStatus(Status.ON_CALL);

        RequestAmbulance request = new RequestAmbulance();
        request.setAmbulance(ambulance);
        request.setUser(user);
        request.setStatus(Status.AVAILABLE);

        ambulanceRepository.save(ambulance);
        return ambulanceRequestRepo.save(request);
    }

    @Override
    public RequestAmbulance getAmbulance(Long ambulanceId) {
        Optional<RequestAmbulance> optionalRequest = ambulanceRequestRepo.findById(ambulanceId);
        if (optionalRequest.isPresent()) {
            return optionalRequest.get();
        } else {
            throw new RuntimeException("Request not found");
        }
    }

    @Override
    public RequestAmbulance getAmbulanceUsingIdAndUser(Long ambulanceId, String username) {
        Optional<RequestAmbulance> optionalRequest = ambulanceRequestRepo.findById(ambulanceId);
        if (optionalRequest.isPresent()) {
            RequestAmbulance request = optionalRequest.get();
            if (request.getUser().getUsername().equals(username)) {
                return request;
            } else {
                throw new RuntimeException("Access denied: Unauthorised Access !!");
            }
        } else {
            throw new RuntimeException("Request not found");
        }
    }

    @Override
    public List<RequestAmbulance> getAllAmbulanceRequests() {
        return ambulanceRequestRepo.findAll();
    }
}
