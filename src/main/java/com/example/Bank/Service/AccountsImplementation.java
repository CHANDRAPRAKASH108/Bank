package com.example.Bank.Service;
import com.example.Bank.Dao.AccountDao;
import com.example.Bank.Entity.AccountsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsImplementation implements AccountService{
    @Autowired
    private AccountDao ad;
   @Override
    public AccountsEntity getAccount(Long account_number) {
        return ad.getOneAccount(account_number);
    }

    @Override
    public AccountsEntity addAccount(AccountsEntity account) {
        return ad.save(account);
    }

    @Override
    public List<AccountsEntity> getAllAccount() {
        return ad.findAll();
    }

    @Override
    public AccountsEntity updateAccount(AccountsEntity accountsEntity) {
        return ad.save(accountsEntity);
    }

    @Override
    public ResponseEntity<Object> deleteAccount(AccountsEntity accountsEntity) {
       boolean isthere = ad.existsById(accountsEntity.getAccount_no());
       if (isthere){
           try{
               ad.delete(accountsEntity);
               return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
           }catch (Exception e){
               e.printStackTrace();
               return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
           }
       }
       return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
