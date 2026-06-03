package com.example.demo.dto.request;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.List;

public class CreateUserRequest {
    private String username;
    private String email;
    private String password;
    LocalDateTime createdAt;

    public CreateUserRequest(){}

    public String getUsername(){
        return username;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setPassword(String password){
        this.password=password;
    }

}
