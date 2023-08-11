package com.backend.hrportal.controller;

import com.backend.hrportal.constants.Endpoints;
import com.backend.hrportal.entity.LoginCredentials;
import com.backend.hrportal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping(path = Endpoints.API_ROOT + "/getPassword")
    public String getPassword(@RequestBody LoginCredentials username){
        return loginService.getLoginDetails(username.getUsername());
    }
}
