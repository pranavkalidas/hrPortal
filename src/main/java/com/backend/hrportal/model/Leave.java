package com.backend.hrportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Leaves")
public class Leave {
    @Id
    private Integer empId;
    private Date startDate;
    private Date endDate;

}
