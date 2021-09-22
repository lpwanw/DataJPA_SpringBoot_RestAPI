package com.example.demo.reponsitory;

import com.example.demo.Entity.Role;
import com.example.demo.common.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleReponsitory extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
