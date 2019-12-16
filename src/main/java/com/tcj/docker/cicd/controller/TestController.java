package com.tcj.docker.cicd.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Auther: 谢星星
 * @Date: 2019/12/4 15:22
 * @Description:
 */
@RestController
public class TestController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object checkIsFavorited() {
        return "Hello， O2O-20191216。";
    }
}
