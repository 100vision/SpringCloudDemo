package com.bearfamily.springbootsvcconsumer.pojo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="producer-service",url="http://springboot-svc-producer.devops:8080/")
public interface IProducerClient {

    //定义一个远程方法
    @GetMapping(value="/producer")
    public String getProductById(@RequestParam("id") String id);

    @GetMapping(value="/hostname")
    public String getProducerHostName();

}
