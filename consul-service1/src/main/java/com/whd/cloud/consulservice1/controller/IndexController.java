package com.whd.cloud.consulservice1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author whd
 * @className IndexController
 * @date 2018/7/9 14:43
 * @desc Describe the function of this class in one sentence
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "Hello Consul, This is my first time to use consul";
    }
}
