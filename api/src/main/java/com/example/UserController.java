package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("api/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        return List.of(
                new User(),
                new User());
    }

    @PostMapping
    public String postUser() {
        return "User posted to database!";
    }
}
