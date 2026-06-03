package com.example.demo.service;

import com.example.demo.dto.request.CreateChatRoomRequest;
import com.example.demo.dto.response.ChatRoomResponse;
import com.example.demo.entity.ChatRoom;
import com.example.demo.repository.ChatRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatRoomService {
    private final ChatRoomRepository chatroomrepository;
    public ChatRoomService(ChatRoomRepository chatroomrepository){
        this.chatroomrepository=chatroomrepository;
    }

    public ChatRoomResponse CreateChatRoom(CreateChatRoomRequest request){
        ChatRoom chatroom = new ChatRoom(
                request.getTitre(),
                request.getDescription()
        );

        ChatRoom chat = chatroomrepository.save(chatroom);

        return new ChatRoomResponse(
                chat.getId(),
                chat.getTitre(),
                chat.getDescription()
        );

    }

    public List<ChatRoomResponse> getAllRooms(){
        return chatroomrepository.findAll()
                .stream()
                .map(chatroom-> new ChatRoomResponse(
                        chatroom.getId(),
                        chatroom.getTitre(),
                        chatroom.getDescription())
                ).toList();

    }
}
