package com.example.uduth_ambulance_service.services;

import com.example.uduth_ambulance_service.domain.Staff;

import java.util.List;

public interface StaffService {


    public Staff addStaff(Staff staff);
    public List<Staff> getAllStaffs();


}
