package com.example.uduth_ambulance_service.repos;

import com.example.uduth_ambulance_service.domain.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepo extends JpaRepository<Assignee, Long> {
}
