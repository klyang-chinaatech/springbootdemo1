package com.kunlo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ykl on 2021/5/9.
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    String index(){
        return "Hello World!";
    }
}
