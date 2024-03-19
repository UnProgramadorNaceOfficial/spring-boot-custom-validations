package com.app.controller;

import com.app.controller.dto.EmployeeDTO;
import com.app.entities.Employee;
import com.app.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid EmployeeDTO employeeDTO){
        return new ResponseEntity<>(this.employeeService.saveEmployee(employeeDTO), HttpStatus.CREATED);
    }
}
