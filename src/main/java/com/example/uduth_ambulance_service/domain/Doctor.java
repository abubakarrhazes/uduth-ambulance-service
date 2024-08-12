package com.example.uduth_ambulance_service.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "doctors_tbl")
@Entity
@Getter
@Setter
@Builder

public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long doctorId;
    @NotNull(message = "First Name cannot be NULL")
    @Column(nullable = false, name = "first_name")
    @Pattern(regexp = "[A-Za-z.\\s]+", message = "Enter valid characters in first name")
    private String firstName;
    @NotNull(message = "Last Name cannot be NULL")
    @Column(nullable = false, name = "last_name")
    @Pattern(regexp = "[A-Za-z.\\s]+", message = "Enter valid characters in last name")
    private String lastName;
    @NotNull(message = "Doctors Expertise cannot be NULL")
    @Column(nullable = false)
    private String expertise;
}
