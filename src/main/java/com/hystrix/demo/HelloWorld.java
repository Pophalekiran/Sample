package com.hystrix.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloWorld {


    @GetMapping("/hello")


    public String helloWorld() {
        return "Hello World Kiran";
    }


}
