package com.learning.auth.controller;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@EnableResourceServer
@RestController
public class AuthUserController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
