package com.example.demo.dto.response;

import java.time.LocalDateTime;

public class UserResponse {
    private Long id;
    private String Username;
    private String Email;
    private LocalDateTime createdAt;



    public UserResponse(Long id, String Username, String Email, LocalDateTime createdAt){
        this.id=id;
        this.Username=Username;
        this.Email=Email;
        this.createdAt = createdAt;
    }


    public Long getId() {
        return id;
    }

    public String getUsername() {
        return Username;
    }

    public String getEmail() {
        return Email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
