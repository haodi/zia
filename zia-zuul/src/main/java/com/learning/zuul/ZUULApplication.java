package com.learning.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableOAuth2Sso
@SpringCloudApplication
public class ZUULApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZUULApplication.class, args);
    }
}


