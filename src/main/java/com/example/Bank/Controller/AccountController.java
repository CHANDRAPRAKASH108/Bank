package com.example.Bank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Bank.Entity.AccountsEntity;
import com.example.Bank.Service.AccountService;
@RestController
public class AccountController {
    @Autowired
    private AccountService accountsService;

    @GetMapping("/account/{account_number}")
    public AccountsEntity getAccount(@PathVariable String account_number){
        return accountsService.getAccount(Long.parseLong(account_number));
    }

    @PostMapping("/account")
    public AccountsEntity createAccount(@RequestBody AccountsEntity accountsEntity){
        return accountsService.addAccount(accountsEntity);
    }
}