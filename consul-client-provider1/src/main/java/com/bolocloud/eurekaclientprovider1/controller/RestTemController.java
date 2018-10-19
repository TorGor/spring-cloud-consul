package com.bolocloud.eurekaclientprovider1.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemController {

    @GetMapping(value = "provider")
    @HystrixCommand
    public String provider() {
        return "Hello 8081";
    }

    @GetMapping(value = "hello")
    @HystrixCommand
    public String hello() {
        return "provider1:Hello 8081";
    }

}
