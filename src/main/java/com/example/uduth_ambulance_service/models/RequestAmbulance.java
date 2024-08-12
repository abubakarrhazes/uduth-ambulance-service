package com.example.uduth_ambulance_service.models;

import com.example.uduth_ambulance_service.mappers.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ambulance_requests_tbl")
@Entity
@Getter
@Setter
@Builder

public class RequestAmbulance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long requestAmbulanceId;

    // Let Create a Join Column Relationship Here

    //This is a ONE-TO-MANY RELATIONSHIP
    @ManyToOne
    @JoinColumn(name = "ambulance_id", nullable = false)
    private Ambulance ambulance;

    @NotNull
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne
    @JoinColumn(name = "assignee_id")
    private Assignee assignee;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;






}
