package org.example.employeejpa.Controller;

import org.example.employeejpa.Entity.Employee;
import org.example.employeejpa.Service.*;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TTN")
public class EmployeeController {

private final CreateEmployee createEmployee;
private final UpdateEmployee updateEmployee;
private final DeleteEmployee deleteEmployee;
private final ReadById readById;
private final CountEmployee countEmployee;
private final PagingSorting pagingSorting;
private final FindByName findByName;
private final EmployeeWithA employeeWithA;
private final EmployeeInAgeRange employeeInAgeRange;

    public EmployeeController(CreateEmployee createEmployee, UpdateEmployee updateEmployee, DeleteEmployee deleteEmployee, ReadById readById, CountEmployee countEmployee, PagingSorting pagingSorting, FindByName findByName, EmployeeWithA employeeWithA, EmployeeInAgeRange employeeInAgeRange) {
        this.createEmployee = createEmployee;
        this.updateEmployee = updateEmployee;
        this.deleteEmployee = deleteEmployee;
        this.readById = readById;
        this.countEmployee = countEmployee;
        this.pagingSorting = pagingSorting;
        this.findByName = findByName;
        this.employeeWithA = employeeWithA;
        this.employeeInAgeRange = employeeInAgeRange;
    }



//Q3-Created new employee using JPA
    @PostMapping("/newEmployee")
    public ResponseEntity<String> addNewEmployee(@RequestBody Employee employee)
    {
        createEmployee.createNewEmployee(employee);
        return ResponseEntity.ok("Employee is added successfully ");
    }


    //Q4-Updated the employee
    @PutMapping("/update")
    public ResponseEntity<Employee> updateInfo(@RequestParam Long id, @RequestBody Employee employee)
    {
     return ResponseEntity.ok(
             updateEmployee.updateEmp(id,employee)
     );
    }

//Q5-Deleted the employee
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id)
    {
        return ResponseEntity.ok(deleteEmployee.deleteEmp(id));
    }

    //Q6- Read employee data
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> findEmployee(@PathVariable Long id){
        return ResponseEntity.ok(readById.getemp(id));
    }

    //Q7 - Count number of employees
    @GetMapping("/count")
    public Long countCurEmployees()
    {
        return countEmployee.countEmp();
    }

    //Q8-Implemented paging and sorting
    @GetMapping("/sortedEmp")
    public Page<Employee> sortedEmployee( @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size){
        return pagingSorting.sortedEmp(page,size);
    }

//Q9- Implemented the finder to find employee by name;
    @GetMapping("/search")
    public List<Employee> getEmployeesByName(@RequestParam String name) {
        return findByName.getEmployeesByName(name);
    }

    //Q10- Get all employee with name starting with A
    @GetMapping("/startWith/A")
    public List<Employee> prefixisA() {
        return employeeWithA.nameWithA();
    }

//Q-11 finding employee in age range
    @GetMapping("/age")
    public List<Employee> EmpinAgeRange()
    {
        return employeeInAgeRange.employeeInRange();
    }

}
