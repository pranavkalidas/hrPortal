package com.backend.hrportal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emp_Details")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @Column(name = "empId")
    private Integer empId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name ="department")
    private int department;

    @Column(name = "location")
    private String  location;

    @Column(name = "salarySchema")
    private Integer salarySchema;
}
