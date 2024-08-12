package com.example.uduth_ambulance_service.domain;


import com.example.uduth_ambulance_service.mappers.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "staffs_tbl")
@Entity
@Getter
@Setter
@Builder

public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long staffId;

    @NotNull(message = "First Name cannot be NULL")
    @Column(nullable = false, name = "first_name")
    @Pattern(regexp = "[A-Za-z.\\s]+", message = "Enter valid characters in first name")
    private String firstName;
    @NotNull(message = "Last Name cannot be NULL")
    @Column(nullable = false, name = "last_name")
    @Pattern(regexp = "[A-Za-z.\\s]+", message = "Enter valid characters in last name")
    private String lastName;
    @NotNull(message = "Staff Speciality cannot be NULL")
    @Column(nullable = false, name = "expertise")
    private String expertise;


    @NotNull(message = "Status cannot be null")
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
}
