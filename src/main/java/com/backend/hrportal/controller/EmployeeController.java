package com.backend.hrportal.controller;

import com.backend.hrportal.constants.Endpoints;
import com.backend.hrportal.entity.Employee;
import com.backend.hrportal.entity.LoginCredentials;
import com.backend.hrportal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(path = Endpoints.API_ROOT + "/getEmployees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping(path = Endpoints.API_ROOT + "/getEmployee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }


}
