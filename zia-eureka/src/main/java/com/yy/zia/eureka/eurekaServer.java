package com.yy.zia.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by lihaodi on 2017/5/30.
 * 服务注册中心
 */

@EnableEurekaServer
@SpringBootApplication
public class eurekaServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(eurekaServer.class).web(true).run(args);
    }
}
