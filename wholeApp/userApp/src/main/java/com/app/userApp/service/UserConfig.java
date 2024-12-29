package com.app.userApp.service;

import lombok.Getter;

import java.util.Map;

@Getter
public class UserConfig {

    private final Map<String, String> users;

    public UserConfig(Map<String, String> users) {
        this.users = users;
    }

}
