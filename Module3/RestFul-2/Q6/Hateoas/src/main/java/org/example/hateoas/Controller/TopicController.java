package org.example.hateoas.Controller;

import org.example.hateoas.Entity.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class TopicController {


    @GetMapping("/users/{id}/topics")
    public List<Topic> getAllTopics(@PathVariable Integer id) {
        return List.of(
                new Topic(1, "Spring Boot"),
                new Topic(2, "JAVA")
        );
    }
}
