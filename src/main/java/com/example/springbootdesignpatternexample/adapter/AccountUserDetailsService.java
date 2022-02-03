package com.example.springbootdesignpatternexample.adapter;

import com.example.springbootdesignpatternexample.adapter.security.UserDetails;
import com.example.springbootdesignpatternexample.adapter.security.UserDetailsService;

// 1. target interface를 구현
public class AccountUserDetailsService implements UserDetailsService {

    // 2. Adaptee를 사용
    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }
}
