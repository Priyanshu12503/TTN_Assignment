package org.example.spring_securiity1.Controller;

import org.springframework.web.bind.annotation.*;


//Q1- Accessible only by ADMIN.
@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "admin dashboard";
    }
}