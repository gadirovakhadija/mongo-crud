package com.example.mongocrud.service;

import com.example.mongocrud.model.User;
import com.example.mongocrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepo;

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }
}
