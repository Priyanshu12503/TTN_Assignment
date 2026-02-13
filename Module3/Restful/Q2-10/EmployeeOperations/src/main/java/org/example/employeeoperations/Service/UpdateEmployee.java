package org.example.employeeoperations.Service;

import org.example.employeeoperations.DTO.Employee;
import org.example.employeeoperations.DTO.EmployeeList;
import org.springframework.stereotype.Service;

@Service
public class UpdateEmployee {

    private final EmployeeList employeeList;

    public UpdateEmployee(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }
    public String updateEmployee(Integer id, Employee updatedEmployee) {

        boolean updated = employeeList.updateEmployee(id, updatedEmployee);

        if (updated) {
            return "Employee updated successfully with id: " + id;
        } else {
            throw new RuntimeException("Employee not found with id: " + id);
        }
    }
}
