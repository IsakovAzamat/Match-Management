package com.example.mlbb.service;

import com.example.mlbb.dto.CreateUserRequest;
import com.example.mlbb.entity.User;
import com.example.mlbb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUser(){
        return userRepository.findAll();
    }

    public User createUser(CreateUserRequest userRequest){
        User user = new User();

        String username = userRequest.getEmail().split("@")[0];
        user.setUsername(username);
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());

        return userRepository.save(user);
    }
}
