package com.whd.cloud.consulservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author whd
 * @className ConsulService1Application
 * @date 2018/7/3 11:27
 * @desc Describe the function of this class in one sentence
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulService1Application {


    @RequestMapping("/index")
    public String home(){
        return "<h1>Hello Consul</h1>";
    }


    public static void main(String[] args) {
        SpringApplication.run(ConsulService1Application.class, args);
    }
}
