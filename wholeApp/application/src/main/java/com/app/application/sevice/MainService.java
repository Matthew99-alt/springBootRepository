package com.app.application.sevice;

import com.app.userApp.service.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class MainService implements CommandLineRunner {

    private final User user;

    public MainService(User user) {
        this.user = user;
    }

    @Override
    public void run(String... args) {
        user.checkUser("stepa");
    }
}
