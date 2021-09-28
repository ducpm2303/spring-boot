package com.example.demo.mapper;

import com.example.demo.entity.Account;
import com.example.demo.entity.User;
import com.example.demo.model.reponse.response.AccountResponse;
import com.example.demo.model.request.request.CreateAccountRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper implements Mapper<Account>{
    
    public Account toAccount(CreateAccountRequest request){
        Account account = new Account();
        BeanUtils.copyProperties(request,account);
        return account;
    }

    public AccountResponse toResponse(Account account){
        AccountResponse accountResponse = new AccountResponse();
        BeanUtils.copyProperties(account, accountResponse);
        return accountResponse;
    }

}
