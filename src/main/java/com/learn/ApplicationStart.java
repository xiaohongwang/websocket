package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class ApplicationStart {
    public static void main(String[] args){
        SpringApplication.run(ApplicationStart.class, args);
    }

    @RequestMapping("/")
    public String test(){
        return "index";
    }
}
