package com.example.demo.service;

import com.example.demo.model.reponse.response.AccountResponse;
import com.example.demo.model.request.request.CreateAccountRequest;

import java.util.List;

public interface AccountService {
    AccountResponse save(CreateAccountRequest request);

    AccountResponse findById(Long id);

    List<AccountResponse> findAll();

}
