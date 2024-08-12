package com.example.uduth_ambulance_service.domain;


import com.example.uduth_ambulance_service.mappers.enums.Role;
import com.example.uduth_ambulance_service.mappers.enums.UserType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users_tbl")
@Entity
@Getter
@Setter
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @NotNull(message = "Username cannot empty")
    @Column(nullable = false, unique = true, name = "user_name")
    @Pattern(regexp = "[A-Za-z.\\s]+", message = "Enter valid characters in username")
    private String username;

    @NotNull(message = "Please enter password")
    @Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,15}", message = "Password must be 8-15 characters in length and can include A-Z, a-z, 0-9, or special characters !@#$%^&*_")
    private String password;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
    @Enumerated(EnumType.STRING)
    private UserType userType;
    private LocalDateTime createdOn;
}
