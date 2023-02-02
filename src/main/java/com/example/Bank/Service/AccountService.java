package com.example.Bank.Service;

import com.example.Bank.Entity.AccountsEntity;

import java.util.List;

public interface AccountService {
	
    public AccountsEntity getAccount(Long account_number);

    public AccountsEntity addAccount(AccountsEntity accountsEntity);

    public List<AccountsEntity> getAllAccount();
}
