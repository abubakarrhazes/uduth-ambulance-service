package com.example.uduth_ambulance_service.services;

import com.example.uduth_ambulance_service.domain.Ambulance;
import com.example.uduth_ambulance_service.domain.RequestAmbulance;

import java.util.List;

public interface AmbulanceService {

    public Ambulance addAmbulance(Ambulance ambulance);

    public List<Ambulance> getAllAmbulances();

    public Ambulance updateAmbulance(Long ambulanceId,Ambulance ambulance);

    public RequestAmbulance requestAmbulance(Long ambulanceId, String username);

    public RequestAmbulance getAmbulance(Long ambulanceId);

    public RequestAmbulance getAmbulanceUsingIdAndUser(Long ambulanceId, String username);

    public List<RequestAmbulance> getAllAmbulanceRequests();
}
