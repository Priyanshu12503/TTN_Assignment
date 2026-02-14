package org.example.xmlgetpost.Controller;

import org.apache.tomcat.util.http.parser.MediaType;
import org.example.xmlgetpost.Entity.Employee;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.MediaTray;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    private List<Employee> list = new ArrayList<>();

    @PostMapping("/add")
    public Employee newEmp(@RequestBody Employee e)
    {
        list.add(e);
        return e;
    }

    @GetMapping(value = "/getall")
    public List<Employee> getAll()
    {
        return list;
    }

}
