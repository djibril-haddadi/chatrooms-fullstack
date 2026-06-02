package com.example.demo.service;

import com.example.demo.dto.request.CreateUserRequest;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class UserService {

        private final UserRepository userRepository;
        public UserService(UserRepository userRepository){
            this.userRepository= userRepository;
        }

        public UserResponse CreateUser(CreateUserRequest request){
            User user = new User(
                    request.getUsername(),
                    request.getEmail(),
                    request.getPassword(),
                    request.getCreatedAt()
            );

            User saveduser = userRepository.save(user);

            return new UserResponse(
                    saveduser.getId(),
                    saveduser.getUsername(),
                    saveduser.getEmail(),
                    saveduser.getCreatedAt()
            );
        }

        public List<UserResponse> getAllusers(){

            return userRepository.findAll()
                    .stream()
                    .map(user-> new UserResponse(
                            user.getId(),
                            user.getUsername(),
                            user.getEmail(),
                            user.getCreatedAt()
                    )) .toList();

        }



}
