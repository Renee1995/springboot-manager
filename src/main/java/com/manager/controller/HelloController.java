package com.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(path = {"/helloSpringBoot"})
    public String HelloSpring (){
        System.out.println("hello spring boot");
        return "hello spring boot";
    }
}
