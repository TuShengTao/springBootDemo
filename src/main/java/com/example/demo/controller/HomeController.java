package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{
    @RequestMapping("test")

    public String Index(){
        // stash
        String stringTest = "此SpringBoot项目基于code-server创建,code-server是vs code online";

        return stringTest;
    }

}
