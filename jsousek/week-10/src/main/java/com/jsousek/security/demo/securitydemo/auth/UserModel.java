package com.jsousek.security.demo.securitydemo.auth;

import com.jsousek.security.demo.securitydemo.ToDoFunctionality.ToDoModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "USER")
public class UserModel {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    List<ToDoModel> toDoesOfOneUser;
    @Id @GeneratedValue
    @Column(name = "USER_ID")
    private long id;
    @Column(name = "USERNAME", nullable = false, unique = true)
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "EMAIL")
    private String userEmail;
}
