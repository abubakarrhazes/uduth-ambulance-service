package com.example.uduth_ambulance_service.services;

import com.example.uduth_ambulance_service.domain.Assignee;

import java.util.List;

public interface AssigneeService {

    public Assignee addAssignee(Assignee assignee);
    public List<Assignee> getAllAssignee();
}
