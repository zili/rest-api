package com.example.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    UserRepository repo;

    @GetMapping()
    public List<User> getUsers(){
    return repo.findAll();
    }
}
