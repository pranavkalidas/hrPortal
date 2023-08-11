package com.backend.hrportal.service;

import com.backend.hrportal.entity.LoginCredentials;
import com.backend.hrportal.repository.LoginCredentialsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginService {

    @Autowired
    LoginCredentialsRepository loginCredRepo;

    public String getLoginDetails(String username){
        LoginCredentials credentials = loginCredRepo.findByUsername(username);
        if(credentials==null){
            return "";
        }
        return credentials.getPassword();
    }
}
