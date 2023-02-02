package com.example.Bank.Service;

import com.example.Bank.Entity.AccountsEntity;

public interface AccountService {
	
    public AccountsEntity getAccount(Long account_number);

    public AccountsEntity addAccount(AccountsEntity accountsEntity);
}
