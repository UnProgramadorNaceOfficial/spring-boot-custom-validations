package com.app.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {
    private String name;
    private String city;
}
