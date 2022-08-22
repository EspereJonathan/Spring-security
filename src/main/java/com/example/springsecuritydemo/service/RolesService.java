package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.model.Role;
import com.example.springsecuritydemo.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class RolesService {
    private RoleRepository roleRepository;

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}
