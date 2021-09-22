package com.example.demo.Controller;

import com.example.demo.Model.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class hello {
    @RequestMapping(value = "/")
    String nullPoint(){
        return "hello";
    }

}
