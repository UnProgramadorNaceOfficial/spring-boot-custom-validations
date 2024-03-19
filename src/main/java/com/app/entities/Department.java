package com.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;

    @OneToMany(targetEntity = Employee.class, fetch = FetchType.LAZY, mappedBy = "department")
    @JsonIgnore
    private List<Employee> employeeList;
}
