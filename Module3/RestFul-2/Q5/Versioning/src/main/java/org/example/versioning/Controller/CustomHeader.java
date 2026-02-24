package org.example.versioning.Controller;

import org.example.versioning.Entity.BasicUser;
import org.example.versioning.Entity.EnhancedUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/header")
public class CustomHeader {

    @GetMapping(value = "/details", headers = "next-api=1")
    public BasicUser getUserV1() {
        return new BasicUser(1, "Priyanshu");
    }

    @GetMapping(value = "/details", headers = "X-API-VERSION=2")
    public EnhancedUser getUserV2() {
        return new EnhancedUser(
                1,
                "Priyanshu",
                "priyanshu@gmail.com",
                "Delhi"
        );
    }
}
