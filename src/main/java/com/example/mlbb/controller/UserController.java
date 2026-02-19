package com.example.mlbb.controller;

import com.example.mlbb.dto.CreateUserRequest;
import com.example.mlbb.entity.User;
import com.example.mlbb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:8080")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getUser();
    }


    @PostMapping("/auth")
    public User authUser(@RequestBody CreateUserRequest userRequest){
        return userService.createUser(userRequest);
    }
}
