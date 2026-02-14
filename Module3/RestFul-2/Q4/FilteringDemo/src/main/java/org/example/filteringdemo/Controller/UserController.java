package org.example.filteringdemo.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.filteringdemo.Entity.DynamicUser;
import org.example.filteringdemo.Entity.StaticUser;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.converter.json.MappingJacksonValue;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    List<StaticUser> list = new ArrayList<>();
    List<DynamicUser> list2 = new ArrayList<>();

    @PostMapping("/dynamic/add")
    public String saveUser(@RequestBody DynamicUser user) throws Exception {
        list2.add(user);
        return filterResponse(user);
    }

    @GetMapping("/dynamic/all")
    public String getAllUsers() throws Exception {
        return filterResponse(list2);
    }

    private String filterResponse(Object data) throws Exception {

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "name");

        SimpleFilterProvider filters = new SimpleFilterProvider().addFilter("UserFilter", filter);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setFilterProvider(filters);

        return mapper.writeValueAsString(data);
    }

    @PostMapping("/static/addUser")
    public String addUser(@RequestBody StaticUser staticUser)
    {
        list.add(staticUser);
        return "New user is added successflly";
    }

    @GetMapping("/static/getAll")
    public List<StaticUser> getAllUser()
    {
        return list;
    }
}
