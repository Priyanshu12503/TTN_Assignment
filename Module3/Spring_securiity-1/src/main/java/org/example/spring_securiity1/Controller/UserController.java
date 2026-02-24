package org.example.spring_securiity1.Controller;

import org.springframework.web.bind.annotation.*;

//Q1- Accessible only by User.


@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/home")
    public String home() {
        return "user home";
    }
}