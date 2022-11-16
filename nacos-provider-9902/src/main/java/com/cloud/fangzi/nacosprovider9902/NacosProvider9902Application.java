package com.cloud.fangzi.nacosprovider9902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosProvider9902Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9902Application.class, args);
    }

}
