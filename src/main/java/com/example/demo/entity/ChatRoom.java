package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "app_chatroom")
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String titre;
    private String description;

    public ChatRoom(){};

    public ChatRoom(String titre, String description){
        this.titre=titre;
        this.description=description;
    }

    public Long getId(){
        return Id;
    }
    public String getTitre(){
        return titre;
    }

    public String getDescription(){
        return description;
    }

    public void setId(){
        this.Id=Id;
    }
    public void setTitre(String titre){
        this.titre=titre;
    }

    public void setDescription(String description){
        this.description=description;
    }







}
