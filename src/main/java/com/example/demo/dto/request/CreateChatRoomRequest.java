package com.example.demo.dto.request;

public class CreateChatRoomRequest {
    private Long Id;
    private String titre;
    private String description;

    public CreateChatRoomRequest(){};

    public Long getId(){
        return Id;
    }

    public String getTitre(){
        return titre;
    }

    public String getDescription(){
        return description;
    }

    public void setTitre(){
        this.titre=titre;
    }

    public void setDescription(){
        this.description=description;
    }

}
