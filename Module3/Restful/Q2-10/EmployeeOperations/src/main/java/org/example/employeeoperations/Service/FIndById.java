package org.example.employeeoperations.Service;

import org.example.employeeoperations.DTO.Employee;
import org.example.employeeoperations.DTO.EmployeeList;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class FIndById {

    private final EmployeeList employeeList;

    public FIndById(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }

    public Optional<Employee> getEmployeeById(Integer id) {
        return employeeList.getById(id);
    }
}
