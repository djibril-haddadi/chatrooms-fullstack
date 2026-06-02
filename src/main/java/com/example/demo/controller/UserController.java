package com.example.demo.controller;
import com.example.demo.dto.request.CreateUserRequest;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    @PostMapping
    public UserResponse CreateUser(@RequestBody CreateUserRequest user){
        return userService.CreateUser(user);
    }
    @GetMapping
    public List<UserResponse> getAllUsers(){
        return userService.getAllusers();
    }
}
