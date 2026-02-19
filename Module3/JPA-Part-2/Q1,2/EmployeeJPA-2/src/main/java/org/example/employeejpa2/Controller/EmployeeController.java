package org.example.employeejpa2.Controller;

import org.example.employeejpa2.Entity.Employee;
import org.example.employeejpa2.Service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TTN")
public class EmployeeController {

    private final JPQLSalaryAboveAvg JPQLSalaryAboveAvg;
    private final JPQLUpdateBelowAvg JPQLUpdateBelowAvg;
    private final JPQLDeleteEmployee JPQLDeleteEmployee;
    private final NATIVE_nameWithSingh native_nameWithSingh;
    private final NATIVE_deleteEmployee native_deleteEmployee;

    public EmployeeController(JPQLSalaryAboveAvg JPQLSalaryAboveAvg, JPQLUpdateBelowAvg JPQLUpdateBelowAvg, JPQLDeleteEmployee JPQLDeleteEmployee, NATIVE_nameWithSingh nativeNameWithSingh, NATIVE_deleteEmployee nativeDeleteEmployee) {
        this.JPQLSalaryAboveAvg = JPQLSalaryAboveAvg;
        this.JPQLUpdateBelowAvg = JPQLUpdateBelowAvg;
        this.JPQLDeleteEmployee = JPQLDeleteEmployee;
        native_nameWithSingh = nativeNameWithSingh;
        native_deleteEmployee = nativeDeleteEmployee;
    }

    //Q1-(1) get the employee with salary above avg salary using JPQL
    @GetMapping("/aboveAvg")
    public List<Employee> salaryAboveAvg()
    {
        return JPQLSalaryAboveAvg.getAboveAverage();
    }
    //Q1-(2) Update salary of employee using JPQL
    @PatchMapping("/update")
    public Integer updateSalary(@RequestParam Double newSalary)
    {
        return JPQLUpdateBelowAvg.updateSalary(newSalary);
    }
    //Q1-(3)- Delete all employees with minimum salary.
    @DeleteMapping("/delete")
    public Integer deleteEmp()
    {

        return  JPQLDeleteEmployee.deleteEmployeesWithMinimumSalary();
    }
    //Q2-(1) Display the id, first name, age of all employees where last name ends with "singh"
    @GetMapping("/singh")
    public List<String> nameWithSIngh(){
        return native_nameWithSingh.getEmployeesEndingWithSingh();
    }

    //Q2-(2) Delete all employees with age greater than 45(Should be passed as a parameter)
    @DeleteMapping("/delete/{age}")
    public Integer deleteOlderEmployee(@PathVariable Integer age){
        return native_deleteEmployee.deleteEmployeeWithAgeMore(age);
    }
}
