package com.example.springbootdesignpatternexample.facade;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class EmailSettings {

    private String host;

    public String getHost() {
        return host;
    }
}
