package org.example.versioning.Controller;

import org.example.versioning.Entity.BasicUser;
import org.example.versioning.Entity.EnhancedUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mime")
public class UserMime {
    @GetMapping(value = "/details", produces = "application/app-v1+json")
    public BasicUser getUserV1() {
        return new BasicUser(1, "Priyanshu");
    }

    @GetMapping(value = "/details", produces = "application/app-v2+json")
    public EnhancedUser getUserV2() {
        return new EnhancedUser(
                1,
                "Priyanshu",
                "priyanshu@gmail.com",
                "Delhi"
        );
    }
}
