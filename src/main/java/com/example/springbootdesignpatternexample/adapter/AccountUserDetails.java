package com.example.springbootdesignpatternexample.adapter;

import com.example.springbootdesignpatternexample.adapter.security.UserDetails;

// 요 객체 또한 Adapter
// 1. target interface를 구현
public class AccountUserDetails implements UserDetails {

    // 2. Adaptee를 사용
    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
