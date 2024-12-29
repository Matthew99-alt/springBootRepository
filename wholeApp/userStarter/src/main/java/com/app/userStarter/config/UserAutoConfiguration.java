package com.app.userStarter.config;

import com.app.userApp.service.User;
import com.app.userApp.service.UserConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfiguration {

    private final UserProperties userProperties;

    public UserAutoConfiguration(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    @Bean
    public User user(UserConfig config) {
        User newUser = new User(config);
        return newUser;
    }

    @Bean
    public UserConfig userConfig() {
        HashMap<String, String> credentials = userProperties.getUsers();
        if(credentials == null || credentials.isEmpty()){
            credentials = new HashMap<>();
            credentials.put("root", "0000");
        }
        return new UserConfig(credentials);
    }
}
