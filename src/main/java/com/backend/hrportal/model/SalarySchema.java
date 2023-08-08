package com.backend.hrportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SalarySchema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer salaryId;
    private String designation;
    private Double basic;
    private Double da;
    private Double hra;
    private Double convenience;
    private Double specialAllowance;
    private Double providentFund;
    private Double profTax;
    private Double total;

}
