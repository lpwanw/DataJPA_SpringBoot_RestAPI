package com.example.demo.Controller;

import com.example.demo.Entity.Role;
import com.example.demo.reponsitory.RoleReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    RoleReponsitory roleRepository;
    @GetMapping("/getRole")
    List<Role> getRole(){
        return roleRepository.findAll();
    }
}
