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

            if(userRepository.existsByemail(request.getEmail())){
                throw new IllegalArgumentException("Email already existing");
            }
            if(request.getUsername() == null || request.getUsername().isBlank()){
                throw new IllegalArgumentException("Username is Required");
            }
            if(request.getEmail() == null || request.getEmail().isBlank()){
                throw new IllegalArgumentException("Email is required");
            }
            if(!request.getEmail().contains("@")){
                throw new IllegalArgumentException("Email need an @");
            }
            if(request.getPassword()==null || request.getPassword().isBlank()){
                throw new IllegalArgumentException("Need a password");
            }
            if(request.getPassword().length()<6){
                throw new IllegalArgumentException("Pas assez de caractere pour le mot de passe");
            }

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
