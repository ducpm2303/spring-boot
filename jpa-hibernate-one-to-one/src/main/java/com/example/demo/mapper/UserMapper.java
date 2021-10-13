package com.example.demo.mapper;

import com.example.demo.entity.Account;
import com.example.demo.entity.User;
import com.example.demo.model.reponse.response.AccountResponse;
import com.example.demo.model.reponse.response.UserResponse;
import com.example.demo.model.request.request.CreateUserRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<User> {


    public User toUser(CreateUserRequest request) {
        User user = new User();
        BeanUtils.copyProperties(request, user);
        return user;
    }

    public UserResponse toReponse(User user) {
        AccountMapper accountMapper = new AccountMapper();
        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(user, userResponse);
        Account account = user.getAccount();
        AccountResponse accountResponse = accountMapper.toResponse(account);
        userResponse.setAccount(accountResponse);
        return userResponse;
    }


}
