package com.backend.hrportal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="login_credentials")
public class LoginCredentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Integer id;

    @Column(name="username")
    String username;

    @Column(name="password")
    String password;
}
