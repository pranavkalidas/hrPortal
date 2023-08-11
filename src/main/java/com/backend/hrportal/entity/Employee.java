package com.backend.hrportal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="emp_Details")
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
