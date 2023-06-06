package com.example.mongocrud.controller;

import com.example.mongocrud.model.User;
import com.example.mongocrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping
    private List<User> getAll(){
        return userService.getAll();
    }
}
