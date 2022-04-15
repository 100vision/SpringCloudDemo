package com.bearfamily.springbootsvcproducer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class producerController {

    private final String producerHostName = System.getenv("HOSTNAME");

    @GetMapping(value = "/producer")
    public String getProductById(@RequestParam int id) {

        Map<Integer,String> products = new HashMap<>();
        products.put(1,"Apple iPhone 13 MAX");
        products.put(2,"Xiaomi RedNote 10");

        String product = products.get(id);
        log.info("Producer Service Remote call has been executed successfully");
        return  product;

    }

    @GetMapping(value = "/hostname")
    public String getProducerHostName() {

            return this.producerHostName;

    }


}
