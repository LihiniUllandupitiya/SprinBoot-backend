package com.example.backend.dto;

//Created EmployeeDto class to transfer data between client and server

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class EmployeeDto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;

}
