package com.example.demo.dto.response;

public class ChatRoomResponse {
    private Long Id;
    private String titre;
    private String description;


    public ChatRoomResponse(Long Id, String titre, String description){
        this.Id=Id;
        this.titre=titre;
        this.description= description;
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
}
