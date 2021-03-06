package com.whd.cloud.consulservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author whd
 * @className ConsulService2Application
 * @date 2018/7/9 11:29
 * @desc Describe the function of this class in one sentence
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulService2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulService2Application.class, args);
    }
}
