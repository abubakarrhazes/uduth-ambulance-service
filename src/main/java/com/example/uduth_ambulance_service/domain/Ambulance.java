package com.example.uduth_ambulance_service.domain;


import com.example.uduth_ambulance_service.mappers.enums.Status;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ambulanceId;

    @NotNull
    @Column(nullable = false, name = "plate_number" , unique = true)
    private String plateNumber;

    @NotNull(message = "Status cannot be null")
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(nullable = false, name = "location")
    private String location;


}
