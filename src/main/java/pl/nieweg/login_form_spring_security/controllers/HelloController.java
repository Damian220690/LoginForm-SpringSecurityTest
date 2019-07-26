package pl.nieweg.login_form_spring_security.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/rest")
public class HelloController {

    @GetMapping("/greeting")
    @ResponseBody
    public String hello(){
        return "Hello everyone";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/greeting")
    @ResponseBody
    public String securedHello(){
        return "Secured Hello";
    }

}
