package com.example.demo.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;



    @Entity
    @Table(name = "app_user")
    public class User{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String username;
        private String email;
        private String password;
        private LocalDateTime createdAt;

        public User(){}

        public User(String username,String email,String password, LocalDateTime createdAt){
            this.email = email;
            this.username=username;
            this.id=id;
            this.password=password;
            this.createdAt=createdAt;
        }

        @PrePersist
        public void prePersist(){
            this.createdAt=LocalDateTime.now();
        }

        public Long getId(){
            return id;
        }

        public String getUsername(){
            return username;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword(){
            return password;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password){
            this.password=password;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

