package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backend.entity.Employee;

//EmployeeRepository which extends JpaRepository interface. so EmployeeRepository gets CRUD methods to perform database operations on Employee JPA Entity
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
