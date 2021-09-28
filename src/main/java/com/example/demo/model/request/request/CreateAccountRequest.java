package com.example.demo.model.request.request;

import com.example.demo.entity.User;
import lombok.Data;

@Data
public class CreateAccountRequest {

    private String username;
    private String password;
    private User user;
}
