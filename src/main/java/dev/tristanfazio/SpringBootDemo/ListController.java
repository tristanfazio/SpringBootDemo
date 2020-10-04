package dev.tristanfazio.SpringBootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {
    @GetMapping("/")
    public String defaultRoute() {
        return "Hello World, Spring Boot Demo Running";
    }
}
