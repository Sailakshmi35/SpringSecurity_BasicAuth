package com.example.SecurityCrud.Controller;

import com.example.SecurityCrud.Model.User;
import com.example.SecurityCrud.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestBody User user) {
        service.register(user);
        return "User Registered Successfully";
    }
}
