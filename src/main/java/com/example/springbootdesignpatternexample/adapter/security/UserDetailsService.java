package com.example.springbootdesignpatternexample.adapter.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
