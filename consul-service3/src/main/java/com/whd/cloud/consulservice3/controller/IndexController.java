package com.whd.cloud.consulservice3.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String home() {
        return restTemplate.getForObject("http://consul-service1/", String.class) + " FROM REMOTE";
    }

    @RequestMapping("/index")
    public String index() {
        return "hello,consul service3";
    }
}
