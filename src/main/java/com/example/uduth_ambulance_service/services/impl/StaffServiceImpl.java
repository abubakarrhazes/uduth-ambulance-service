package com.example.uduth_ambulance_service.services.impl;

import com.example.uduth_ambulance_service.domain.Staff;
import com.example.uduth_ambulance_service.repos.StaffRepo;
import com.example.uduth_ambulance_service.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepo staffRepo;
    @Override
    public Staff addStaff(Staff staff) {
        return staffRepo.save(staff);
    }

    @Override
    public List<Staff> getAllStaffs() {
        return staffRepo.findAll();
    }
}
