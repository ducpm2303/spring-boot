package com.example.demo.service.impl;

import com.example.demo.entity.Account;
import com.example.demo.entity.User;
import com.example.demo.exception.BusinessCode;
import com.example.demo.exception.BusinessException;
import com.example.demo.mapper.AccountMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.reponse.response.AccountResponse;
import com.example.demo.model.reponse.response.UserResponse;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;
    private final AccountRepository accountRepository;

    private final UserMapper userMapper;
    private final AccountMapper accountMapper;
    public UserServiceImpl(UserRepository userRepo, AccountRepository accountRepository, UserMapper userMapper, AccountMapper accountMapper) {
        this.userRepo = userRepo;
        this.accountRepository = accountRepository;
        this.userMapper = userMapper;
        this.accountMapper = accountMapper;
    }

    @Override
    public UserResponse findById(Long id) {
        User user = userRepo.findById(id).orElseThrow(
                () -> new BusinessException(BusinessCode.NOT_FOUND_USER)
        );
        Account account = accountRepository.findById(user.getAccount().getId()).orElseThrow(
                () -> new BusinessException(BusinessCode.NOT_FOUND_ACCOUNT)
        );
        AccountResponse accountResponse = accountMapper.toResponse(account);
        UserResponse userResponse = userMapper.toReponse(user);
        userResponse.setAccount(accountResponse);
        return userResponse;
    }


    @Override
    public List<UserResponse> findALL() {
        List<User> users = userRepo.findAll();
        return users.stream().map(userMapper::toReponse).collect(Collectors.toList());
    }
}
