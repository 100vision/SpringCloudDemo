package com.bearfamily.springbootsvcconsumer.controller;

import com.bearfamily.springbootsvcconsumer.pojo.IProducerClient;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ConsumerController {

    // 容器自动注入Feign客户端
    @Autowired
    private IProducerClient producerClient;

    @GetMapping(value = "/product")
    @ResponseBody
    public String getProductById(@RequestParam("id") String id) {

        //调用远程服务的方法。
        String product = producerClient.getProductById(id);
        return  product;
    }


    @GetMapping(value = "/health")
    @ResponseBody
    public String health() {

        return  "I'm alive";
    }

    @GetMapping(value = "/hostname")
    @ResponseBody
    public String hostName() {

        return  producerClient.getProducerHostName();
    }

}
