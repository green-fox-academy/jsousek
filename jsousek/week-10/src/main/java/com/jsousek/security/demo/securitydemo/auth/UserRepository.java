package com.jsousek.security.demo.securitydemo.auth;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long > {
    UserModel finfByUsername(String username);

}
