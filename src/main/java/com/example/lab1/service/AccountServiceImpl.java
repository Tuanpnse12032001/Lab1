package com.example.lab1.service;

import com.example.lab1.dto.AccountDTO;
import com.example.lab1.entity.Account;
import com.example.lab1.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl {

    private final AccountRepository accountRepository;

    public Boolean loginService(Account account1){
       Account account = accountRepository.findByUsernameAndPassword(account1.getUsername(), account1.getPassword());
       if(account == null){
           return false;
       }else {
           return true;
       }
    }
}
