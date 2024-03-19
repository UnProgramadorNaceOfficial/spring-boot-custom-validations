package com.app.service;

import com.app.controller.dto.EmployeeDTO;
import com.app.entities.Department;
import com.app.entities.Employee;
import com.app.persistence.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = Employee.builder()
                .name(employeeDTO.getName())
                .lastName(employeeDTO.getLastName())
                .email(employeeDTO.getEmail())
                .age(employeeDTO.getAge())
                .phone(employeeDTO.getPhone())
                .height(employeeDTO.getHeight())
                .married(employeeDTO.isMarried())
                .dateOfBirth(employeeDTO.getDateOfBirth())
                .department(Department.builder()
                        .city(employeeDTO.getDepartmentDTO().getCity())
                        .name(employeeDTO.getDepartmentDTO().getName())
                        .build())
                .build();
        return this.employeeRepository.save(employee);
    }
}
