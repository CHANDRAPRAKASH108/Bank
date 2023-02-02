package com.example.Bank.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.Bank.Entity.AccountsEntity;


public interface AccountDao extends JpaRepository<AccountsEntity, Long>{
    @Query(value = "select acc from AccountsEntity acc where acc.account_no=?1")
    AccountsEntity getOneAccount(Long account_number);
}
