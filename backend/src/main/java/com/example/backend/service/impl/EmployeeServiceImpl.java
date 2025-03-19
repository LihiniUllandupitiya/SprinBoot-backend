package com.example.backend.service.impl;

import org.springframework.stereotype.Service;
import com.example.backend.dto.EmployeeDto;
import com.example.backend.entity.Employee;
import com.example.backend.exception.ResourceNotFoundException;
import com.example.backend.mapper.EmployeeMapper;
import com.example.backend.repository.EmployeeRepository;
import com.example.backend.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = new Employee();
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());

        Employee savedEmployee = employeeRepository.save(employee);

        return new EmployeeDto(savedEmployee.getId(), savedEmployee.getFirstName(), savedEmployee.getLastName(), savedEmployee.getEmail());

    }

    @Override
    public EmployeeDto getEmployeeId(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
            .orElseThrow(() ->
                new ResourceNotFoundException("Employee is not exists with given id : " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

}
