package com.app.userApp.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User { // TODO: Record?

    private final String userName;

    private final String userPassword;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }
}
