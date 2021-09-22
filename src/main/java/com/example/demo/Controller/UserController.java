package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.Entity.UserDetail;
import com.example.demo.reponsitory.UserDetailReponsitory;
import com.example.demo.reponsitory.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserReponsitory userRepository;
    @Autowired
    UserDetailReponsitory userDetailRepository;
    @GetMapping(value="/getAllUser")
    List<User> getAll(){
        return userRepository.findAll();
    }
    @DeleteMapping(value="/deleteUser/{id}")
    Long deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
        return id;
    }
    @PostMapping(value = "/addUser")
    User addUser(@RequestBody User user){
        UserDetail detail = new UserDetail();
        detail.setUser(user);
        detail.setPhone("0123456789");
        user.setUserDetail(detail);
        userRepository.save(user);
        return user;
    }
    @PutMapping(value = "/updateUserDetail/{id}")
    User updateUserDetail(@PathVariable Long id,@RequestBody UserDetail detail){
        User user = userRepository.findById(id).get();
        if(user!=null){
            detail.setUser(user);
            user.setUserDetail(detail);
            userRepository.save(user);
        }
        return user;
    }
}
