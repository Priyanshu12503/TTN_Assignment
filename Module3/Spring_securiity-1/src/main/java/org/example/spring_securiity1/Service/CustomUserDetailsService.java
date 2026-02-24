package org.example.spring_securiity1.Service;

import org.example.spring_securiity1.Entity.User;
import org.example.spring_securiity1.Repo.UserRepo;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

//Q2-Custom User details service

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;

    public CustomUserDetailsService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public UserDetails loadUserByUsername(String username) {

        User user = userRepo.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("not found"));

        return org.springframework.security.core.userdetails.User
                .builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .roles(user.getRole())
                .build();
    }
}