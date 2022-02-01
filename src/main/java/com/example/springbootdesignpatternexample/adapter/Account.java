package com.example.springbootdesignpatternexample.adapter;

import com.example.springbootdesignpatternexample.adapter.security.UserDetails;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
// Adaptee를 직접 수정이 가능한 경우, 직접 target interface를 구현하면 된다.
public class Account implements UserDetails {

    private String name;
    private String password;
    private String email;

    @Override
    public String getUsername() {
        return this.name;
    }
}
