package com.example.uduth_ambulance_service.services.impl;

import com.example.uduth_ambulance_service.domain.Assignee;
import com.example.uduth_ambulance_service.repos.AssigneeRepo;
import com.example.uduth_ambulance_service.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssigneeImpl implements AssigneeService {

    @Autowired
    private AssigneeRepo assigneeRepo;
    @Override
    public Assignee addAssignee(Assignee assignee) {
        return assigneeRepo.save(assignee);
    }

    @Override
    public List<Assignee> getAllAssignee() {
        return assigneeRepo.findAll();
    }
}
