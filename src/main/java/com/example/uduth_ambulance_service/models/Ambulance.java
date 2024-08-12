package com.example.uduth_ambulance_service.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ambulances_tbl")
@Entity
@Getter
@Setter
@Builder
public class Ambulance {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ambulanceId;

    @NotNull
    @Column(nullable = false, name = "plate_number" , unique = true)
    private String plateNumber;

    @Column(nullable = false, name = "status")

    private String status = "AVAILABLE";
    @Column(nullable = false, name = "location")
    private String location;


}
