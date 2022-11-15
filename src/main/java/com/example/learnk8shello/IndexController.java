package com.example.learnk8shello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/{name}")
    public String index(@PathVariable String name) {
        return "Hello "+name+"!";
    }

}
