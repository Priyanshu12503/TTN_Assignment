package org.example.swaggerdesc.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.swaggerdesc.Entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
@Tag(name = "Employee controller ",description = "Api with end point to interact with employee list ")
public class EmployeeController {
    private List<Employee> list = new ArrayList<>();

    @Operation(summary = "Get all employees ", description = "Fetch list of ll employees ")
    @GetMapping("/getall")
    public List<Employee> getEmp()
    {
        return list;
    }

    @Operation(summary = "Save employee ", description = "Add employee into employee list ")
    @PostMapping("/addEmp")
    public Employee newEmp(@RequestBody Employee employee){
        list.add(employee);
        return employee;
    }

    @Operation(summary = "Delete employee", description = "Deletes an employee using employee id")
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        list.removeIf(emp -> emp.getId().equals(id));
        return "Employee deleted successfully";
    }


}
