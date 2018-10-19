package com.bolocloud.eurekaclientzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableCircuitBreaker
@EnableHystrix
public class EurekaClientZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientZuulApplication.class, args);
    }
}
