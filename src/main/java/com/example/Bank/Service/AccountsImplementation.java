package com.example.Bank.Service;
import com.example.Bank.Dao.AccountDao;
import com.example.Bank.Entity.AccountsEntity;
import org.springframework.beans.factory.annotation.Autowired;
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
}
