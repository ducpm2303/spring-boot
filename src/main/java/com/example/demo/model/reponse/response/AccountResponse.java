package com.example.demo.model.reponse.response;

import com.example.demo.entity.User;
import lombok.Data;

@Data
public class AccountResponse {
    private Long id;
    private String username;
    private String password;
}
