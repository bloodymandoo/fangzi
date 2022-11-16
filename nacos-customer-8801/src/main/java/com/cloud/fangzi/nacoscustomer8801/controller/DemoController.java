package com.cloud.fangzi.nacoscustomer8801.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Value("${provider.service.url}")
    private String providerServiceUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getProviderServerPort")
    public String getProviderServerPort(){
        String serverPort = restTemplate.getForObject(providerServiceUrl + "/getServerPort", String.class);
        return "nacos provider server port :" + serverPort;
    }
}
