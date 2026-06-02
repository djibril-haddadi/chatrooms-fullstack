package com.example.demo.dto.request;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.List;

public class CreateUserRequest {
    private String Username;
    private String Email;
    private String Password;
    LocalDateTime createdAt;

    public CreateUserRequest(){}

    public String getUsername(){
        return Username;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public String getEmail(){
        return Email;
    }

    public String getPassword(){
        return Password;
    }

    public void setUsername(String Username){
        this.Username=Username;
    }

    public void setEmail(String Email){
        this.Email=Email;
    }

    public void setPassword(String Password){
        this.Password=Password;
    }

}
