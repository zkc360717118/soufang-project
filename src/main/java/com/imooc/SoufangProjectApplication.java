package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SoufangProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoufangProjectApplication.class, args);
    }

    @RequestMapping("/hi")
    public String hello(){
        return "hello kevin";
    }
}
