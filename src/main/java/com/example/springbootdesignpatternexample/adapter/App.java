package com.example.springbootdesignpatternexample.adapter;

import com.example.springbootdesignpatternexample.adapter.security.LoginHandler;
import com.example.springbootdesignpatternexample.adapter.security.UserDetailsService;

public class App {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("json", "password");
        System.out.println(login);
    }
}
