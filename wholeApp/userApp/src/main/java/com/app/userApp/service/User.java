package com.app.userApp.service;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class User { // TODO: Record? Нееее

    public final UserConfig userConfig;

    public User(UserConfig userConfig) {
        this.userConfig = userConfig;
    }

    public void checkUser(String name) {
        Map<String, String> correctUsers = userConfig.getUsers();
        if(correctUsers == null || correctUsers.isEmpty()){
            correctUsers = new HashMap<>();

            correctUsers.put("blablabla", "0000");
        }
        if (correctUsers.containsKey(name)) {
            System.out.println("Welcome back, " + name);
        } else {
            System.out.println("Access denied, user was not found");
        }
    }
}
