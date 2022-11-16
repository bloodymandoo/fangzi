package com.cloud.fangzi.nacosconfig9903;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfig9903Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfig9903Application.class, args);
    }

}
