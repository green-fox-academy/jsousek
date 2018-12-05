package com.jsousek.security.demo.securitydemo.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AppUserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    public AppUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user = userRepository.finfByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("user not found "+username);
        }
        return new UserPrinciple(user);
    }

}
