package com.backend.hrportal.repository;

import com.backend.hrportal.entity.LoginCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface LoginCredentialsRepository extends JpaRepository<LoginCredentials, Integer> {
    public LoginCredentials findByUsername(String username);

}
