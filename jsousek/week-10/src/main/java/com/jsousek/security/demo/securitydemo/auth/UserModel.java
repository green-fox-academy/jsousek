package com.jsousek.security.demo.securitydemo.auth;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter

@Entity
@Table(name = "USER")
public class UserModel {
    @Id @GeneratedValue
    @Column(name = "USER_ID")
    private long id;
    @Column(name = "USERNAME", nullable = false, unique = true)
    private String username;
    @Column(name = "PASSWORD")
    private String password;
}
