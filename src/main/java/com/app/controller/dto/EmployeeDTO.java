package com.app.controller.dto;

import com.app.advice.validation.anotation.ValidName;
import com.app.advice.validation.anotation.ValueRequired;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @ValidName
    private String name;

    @ValueRequired
    private String lastName;
    private String email;
    private Long phone;
    private byte age;
    private double height;
    private boolean married;
    private LocalDate dateOfBirth;
    private DepartmentDTO departmentDTO;
}
