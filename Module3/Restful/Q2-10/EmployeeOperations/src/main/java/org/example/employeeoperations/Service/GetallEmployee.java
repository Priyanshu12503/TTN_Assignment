package org.example.employeeoperations.Service;

import org.example.employeeoperations.DTO.Employee;
import org.example.employeeoperations.DTO.EmployeeList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetallEmployee {

    private final EmployeeList employeeList;

    public GetallEmployee(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getAllEmployees() {
        return employeeList.getAllEmployees();
    }

}
