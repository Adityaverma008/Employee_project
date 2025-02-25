package com.bridgelabz.employeepayrollapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_payroll")
public class Employee {

//    UC1 codefiles
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int salary;

//UC2 codefiles
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id2;

    @NotBlank(message = "Name is required")
    private String name2;

    @Min(value = 1000, message = "Salary must be at least 1000")
    private int salary2;
}
