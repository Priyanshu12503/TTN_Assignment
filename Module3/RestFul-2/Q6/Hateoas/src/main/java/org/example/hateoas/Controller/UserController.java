package org.example.hateoas.Controller;

import org.example.hateoas.Entity.User;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public EntityModel<User> getUser(@PathVariable Integer id) {

        User user = new User(id, "Priyanshu");

        EntityModel<User> model = EntityModel.of(user);

        model.add(linkTo(methodOn(TopicController.class).getAllTopics(id)).withRel("all-topics"));
        return model;
    }
}
