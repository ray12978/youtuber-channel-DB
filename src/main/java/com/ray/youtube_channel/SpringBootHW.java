package com.ray.youtube_channel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SpringBootHW {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    @GetMapping("/x")
    public String hello(){
        return "Hey, Spring Boot 的 Hello World !";
    }

    @GetMapping("/index")
    public String helloIndex(){
        return "index";
    }
}
