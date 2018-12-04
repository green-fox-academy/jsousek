package com.jsousek.security.demo.securitydemo.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long > {
    User finfByUsername(String username);

}
