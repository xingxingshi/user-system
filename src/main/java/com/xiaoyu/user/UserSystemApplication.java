package com.xiaoyu.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserSystemApplication {

    public static void main(String[] args) {

        System.out.println();
        SpringApplication.run(UserSystemApplication.class, args);
    }
}


