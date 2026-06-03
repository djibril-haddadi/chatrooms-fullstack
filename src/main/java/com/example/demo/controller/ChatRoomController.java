package com.example.demo.controller;

import com.example.demo.dto.request.CreateChatRoomRequest;
import com.example.demo.dto.response.ChatRoomResponse;
import com.example.demo.service.ChatRoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Room")
public class ChatRoomController {
    private final ChatRoomService chatroomservice;
    public  ChatRoomController(ChatRoomService chatroomservice){
            this.chatroomservice=chatroomservice;
        }
        @PostMapping
        public ChatRoomResponse CreateChatRoom(@RequestBody CreateChatRoomRequest request){
            return chatroomservice.CreateChatRoom(request);
        }
        @GetMapping
        public List<ChatRoomResponse> getAllRooms(){
            return chatroomservice.getAllRooms();
        }



    }




