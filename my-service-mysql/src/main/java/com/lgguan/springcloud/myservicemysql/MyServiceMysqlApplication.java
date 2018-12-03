package com.lgguan.springcloud.myservicemysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyServiceMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyServiceMysqlApplication.class, args);
    }
}
