package com.example.lab1.controller;

import com.example.lab1.dto.AccountDTO;
import com.example.lab1.entity.Account;
import com.example.lab1.entity.Car;
import com.example.lab1.service.AccountServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account_data")
@AllArgsConstructor
public class AccountController {

    private final AccountServiceImpl accountService;

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(@RequestBody AccountDTO accountDTO) {

        Account account = new Account(accountDTO.getUsername(), accountDTO.getPassword());

        Boolean status = accountService.loginService(account);
        return ResponseEntity.ok(status);
    }
}
