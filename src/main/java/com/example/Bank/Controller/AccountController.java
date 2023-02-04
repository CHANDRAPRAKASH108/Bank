package com.example.Bank.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Bank.Entity.AccountsEntity;
import com.example.Bank.Service.AccountService;

import java.util.List;
import java.util.Optional;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountsService;

    @GetMapping("/accounts")
    public ResponseEntity<List<AccountsEntity>> getAllAccounts(){
        List<AccountsEntity> acc = accountsService.getAllAccount();
        if (acc.size()<=0){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        else {
            return ResponseEntity.of(Optional.of(acc));
        }
    }

    @GetMapping("/account/{account_number}")
    public ResponseEntity<AccountsEntity> getAccount(@PathVariable String account_number){
        AccountsEntity entity = accountsService.getAccount(Long.parseLong(account_number));
        if (entity!=null){
            return ResponseEntity.of(Optional.of(entity));
        }else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/account")
    public ResponseEntity<AccountsEntity> createAccount(@RequestBody AccountsEntity accountsEntity){
        AccountsEntity entity = accountsService.addAccount(accountsEntity);
        if (entity!=null){
            return ResponseEntity.of(Optional.of(entity));
        }else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/account")
    public ResponseEntity<Optional<AccountsEntity>> updateAccount(@RequestBody AccountsEntity accountsEntity){
        AccountsEntity entity = accountsService.updateAccount(accountsEntity);
        if (entity!=null){
            return ResponseEntity.of(Optional.of(Optional.of(entity)));
        }else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/account")
    public ResponseEntity<Object> deleteAccount(@RequestBody AccountsEntity accountsEntity){
        return accountsService.deleteAccount(accountsEntity);
    }
}
