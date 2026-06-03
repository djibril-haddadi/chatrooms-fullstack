package com.example.demo.exception;

import org.springframework.boot.webmvc.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private final ErrorController errorController;

    public GlobalExceptionHandler(ErrorController errorController) {
        this.errorController = errorController;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity <Map<String, Object>> handleerror (IllegalArgumentException exception){

        Map<String,Object> errorResponse = new HashMap<>();

        errorResponse.put("timestamp",LocalDateTime.now());
        errorResponse.put("status",400);
        errorResponse.put("error", "Bad Request" );
        errorResponse.put("message",exception.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);


    }


}
