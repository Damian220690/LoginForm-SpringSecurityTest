package pl.nieweg.login_form_spring_security.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greeting")
    public String hello(){
        return "Hello everyone";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/greeting")
    public String securedHello(){
        return "Secured Hello";
    }
}
