package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.model.User;
import com.example.springsecuritydemo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository userRepository;

    public User save(User user){
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userRepository.save(user);
    }

    public List<User> getUser(){
        return userRepository.findAll();
    }
}
