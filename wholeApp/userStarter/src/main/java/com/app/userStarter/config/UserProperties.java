package com.app.userStarter.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;

@ConfigurationProperties(prefix = "auth")
public class UserProperties {

    private HashMap<String, String> users;

    public HashMap<String, String> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, String> users) {
        this.users = users;
    }
}
