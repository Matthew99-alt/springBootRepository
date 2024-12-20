package com.app.userApp.service;

import java.util.Objects;

public class UserConfig {

    private final User user;

    public UserConfig(User user) {
        this.user = user;
    }

    //TODO: вынести, у меня это был Аутентификатор
    public void checkUser(String name, String password) {
        if (Objects.equals(user.getUserName(), name) && Objects.equals(user.getUserPassword(), password)) {
            System.out.println("User is authorized, welcome back!");
        } else {
            System.out.println("Access denied");
        }
    }

}
