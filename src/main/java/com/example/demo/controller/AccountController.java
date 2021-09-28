package com.example.demo.controller;

import com.example.demo.model.BaseResponse;
import com.example.demo.model.reponse.response.AccountResponse;
import com.example.demo.model.request.request.CreateAccountRequest;
import com.example.demo.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("public-api/v1.0.0/accounts")
public class AccountController {

    private final AccountService accountService;


    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public BaseResponse<AccountResponse> createAccount(@RequestBody CreateAccountRequest request) {
        return BaseResponse.ofSuccess(accountService.save(request));
    }

    @GetMapping("{id}")
    public BaseResponse<AccountResponse> findById(@PathVariable Long id) {
        return BaseResponse.ofSuccess(accountService.findById(id));
    }

    @GetMapping("")
    public BaseResponse<List<AccountResponse>> findAll() {
        return BaseResponse.ofSuccess(accountService.findAll());
    }
}
