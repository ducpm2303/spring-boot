package com.example.demo.service.impl;

import com.example.demo.entity.Account;
import com.example.demo.entity.User;
import com.example.demo.exception.BusinessCode;
import com.example.demo.exception.BusinessException;
import com.example.demo.mapper.AccountMapper;
import com.example.demo.model.reponse.response.AccountResponse;
import com.example.demo.model.request.request.CreateAccountRequest;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.AccountService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final UserRepository userRepository;

    private final AccountMapper accountMapper;
    public AccountServiceImpl(AccountRepository accountRepository, UserRepository userRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public AccountResponse save(CreateAccountRequest request) {
        Account account = accountMapper.toAccount(request);
        User user = request.getUser();
        account = accountRepository.save(account);
        user.setAccount(account);
        userRepository.save(user);
        return accountMapper.toResponse(account);
    }

    @Override
    public AccountResponse findById(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(
                () -> new BusinessException(BusinessCode.NOT_FOUND_ACCOUNT)
        );
        return accountMapper.toResponse(account);
    }

    @Override
    public List<AccountResponse> findAll() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().map(accountMapper::toResponse).collect(Collectors.toList());
    }
}
