package com.bearfamily.springbootsvcconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.bearfamily.springbootsvcconsumer"})
public class SpringbootSvcConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSvcConsumerApplication.class, args);
    }

}
