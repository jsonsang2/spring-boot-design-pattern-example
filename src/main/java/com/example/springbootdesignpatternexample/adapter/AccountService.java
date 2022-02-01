package com.example.springbootdesignpatternexample.adapter;

public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setEmail("email@email.com");
        account.setPassword("password");
        return account;
    }

    public Account createAccount() {
        return null;
    }

    public Account updateAccount() {
        return null;
    }

}
