package com.example.demo.model.reponse.response;

import com.example.demo.entity.Account;
import lombok.Data;

@Data
public class UserResponse {
    private Long id;
    private String name;
    private String phone;
    private String address;
    private AccountResponse account;
}
