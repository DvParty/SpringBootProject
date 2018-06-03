package com.dvparty.example.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContorller {

    @RequestMapping("/test")
    public String test(){
        return "Hello Wolrd!";
    }
}
