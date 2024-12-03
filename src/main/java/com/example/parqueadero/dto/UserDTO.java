package com.example.parqueadero.dto;

import com.example.parqueadero.model.UserRole;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String fullName;
    private String email;
    private String identificationNumber;
    private UserRole role;
}