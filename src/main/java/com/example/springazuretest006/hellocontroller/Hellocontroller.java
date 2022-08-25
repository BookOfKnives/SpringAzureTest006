package com.example.springazuretest006.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hellocontroller {
    @RequestMapping("/1")
    public String hello() {
        return "hello";
    }
}
