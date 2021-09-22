package com.example.demo.reponsitory;

import com.example.demo.Entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailReponsitory extends JpaRepository<UserDetail,Long> {
}
