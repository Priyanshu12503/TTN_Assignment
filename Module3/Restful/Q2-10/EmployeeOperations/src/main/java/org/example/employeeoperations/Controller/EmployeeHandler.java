package org.example.employeeoperations.Controller;
import jakarta.validation.Valid;
import org.example.employeeoperations.DTO.Employee;
import org.example.employeeoperations.Service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeHandler {


    private final NewEmployee newEmployee;
    private final GetallEmployee getallEmployee;
    private final FIndById findById;
    private final UpdateEmployee updateEmployee;
    private final DeleteEmployee deleteEmployee;

    public EmployeeHandler(NewEmployee newEmployee, GetallEmployee getallEmployee, FIndById findById, UpdateEmployee updateEmployee, DeleteEmployee deleteEmployee) {
        this.newEmployee = newEmployee;
        this.getallEmployee = getallEmployee;
        this.findById = findById;
        this.updateEmployee = updateEmployee;
        this.deleteEmployee = deleteEmployee;
    }

    //Q5 - Post mapping is implemented here
    //Q9 - validation is applied on request body defined in Employee class
    @PostMapping("/newEmployee")
    public ResponseEntity<String> addEmployee(@Valid @RequestBody Employee employee) {
        return ResponseEntity.ok(newEmployee.addEmployee(employee));
        }


    //Q3-Implemented the get mapping
    @GetMapping("/findAll")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(getallEmployee.getAllEmployees());
    }

    //Q4-Implemented the get mapping with path variable
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
        return findById.getEmployeeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    //Q8- Implemented the put mapping
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateEmployee(
            @PathVariable Integer id,
            @RequestBody Employee employee) {
        return ResponseEntity.ok(
                updateEmployee.updateEmployee(id, employee)
        );
    }

    // Q7 - Delete mapping is implemented here
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {
        return ResponseEntity.ok(
                deleteEmployee.deleteEmployee(id)
        );
    }
}


