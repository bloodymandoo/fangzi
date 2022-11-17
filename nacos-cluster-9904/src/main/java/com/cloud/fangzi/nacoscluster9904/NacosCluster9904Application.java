package com.cloud.fangzi.nacoscluster9904;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosCluster9904Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosCluster9904Application.class, args);
    }

}
