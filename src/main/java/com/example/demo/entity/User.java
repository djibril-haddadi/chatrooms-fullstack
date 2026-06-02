package com.example.demo.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;



    @Entity
    @Table(name = "app_user")
    public class User{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String Username;
        private String Email;
        private String password;
        private LocalDateTime createdAt;

        public User(){}

        public User(String Username,String Email,String password, LocalDateTime createdAt){
            this.Email = Email;
            this.Username=Username;
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
            return Username;
        }

        public String getEmail() {
            return Email;
        }

        public String getPassword(){
            return password;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        public void setUsername(String Username) {
            this.Username = Username;
        }

        public void setPassword(String password){
            this.password=password;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }
    }

