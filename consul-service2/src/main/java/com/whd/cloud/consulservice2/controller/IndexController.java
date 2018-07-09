package com.whd.cloud.consulservice2.controller;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author whd
 * @className IndexController
 * @date 2018/7/9 11:43
 * @desc Describe the function of this class in one sentence
 */
//@RestControllerEndpoint(id = "ds")
@RestController
public class IndexController {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/")
    public String home() {
        return this.restTemplate().getForObject("http://consul-service1/", String.class) + " FROM REMOTE";
    }
}
