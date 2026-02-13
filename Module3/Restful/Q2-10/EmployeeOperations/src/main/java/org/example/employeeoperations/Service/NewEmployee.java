package org.example.employeeoperations.Service;

import org.example.employeeoperations.DTO.Employee;
import org.example.employeeoperations.DTO.EmployeeList;
import org.springframework.stereotype.Service;

@Service
public class NewEmployee {

    private final EmployeeList employeeList;

    public NewEmployee(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }
    public String addEmployee(Employee employee) {
        employeeList.addEmployee(employee);
        return "Employee added successfully with id: " + employee.getId();
    }
}
