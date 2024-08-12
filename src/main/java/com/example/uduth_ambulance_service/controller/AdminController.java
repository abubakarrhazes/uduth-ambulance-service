package com.example.uduth_ambulance_service.controller;


import com.example.uduth_ambulance_service.services.AssigneeService;
import com.example.uduth_ambulance_service.services.DoctorService;
import com.example.uduth_ambulance_service.services.StaffService;
import com.example.uduth_ambulance_service.services.impl.AssigneeImpl;
import com.example.uduth_ambulance_service.services.impl.DoctorServiceImpl;
import com.example.uduth_ambulance_service.services.impl.StaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    // Dependency Injection Of all Service Here

    @Autowired
    private StaffServiceImpl staffService;

    @Autowired
    private DoctorServiceImpl doctorService;

    @Autowired
    private AssigneeImpl assigneeService;

}
