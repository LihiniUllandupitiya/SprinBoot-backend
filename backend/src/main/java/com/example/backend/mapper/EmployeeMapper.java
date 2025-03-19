package com.example.backend.mapper;

import com.example.backend.dto.EmployeeDto;
import com.example.backend.entity.Employee;

//created EmployeeMapper class to map Employ entity to EmployeeDto and EmployeeDto to Employ entity

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
            employeeDto.getId(),
            employeeDto.getFirstName(),
            employeeDto.getLastName(),
            employeeDto.getEmail()
        );
    }

}


