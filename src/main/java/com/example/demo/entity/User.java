package com.example.demo.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;



    @Entity
    @Table(name = "app_user")
    public class User{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String Usernname;
        private String email;
        private String password;
        private LocalDateTime createdAt;

        public User(){}

        public User(String Username,String email,String password, LocalDateTime createdAt){
            this.email = email;
            this.Usernname=Username;
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

        public String getUsernname(){
            return Usernname;
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

        public void setUsernname(String Username) {
            this.Usernname = Usernname;
        }

        public void setPassword(String password){
            this.password=password;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

