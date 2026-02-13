package org.example.employeeoperations.DTO;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


//Q2- Created bean of employee
@Component
public class EmployeeList {

    List<Employee> list = new ArrayList<>();
    public List<Employee> getAllEmployees() {
        return list;
    }

    public String deleteEmployee(Integer id) {
        Iterator<Employee> iterator = list.iterator();

        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getId().equals(id)) {
                iterator.remove();
                return "Employee is removed";
            }
        }
        //Q6- Exception is handled here
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Employee not found with id: " + id
        );
    }


    public boolean updateEmployee(Integer id, Employee updatedEmployee) {
        for (Employee emp : list) {
            if (emp.getId().equals(id)) {
                emp.setName(updatedEmployee.getName());
                emp.setAge(updatedEmployee.getAge());
                return true;
            }
        }
        return false;
    }
    public Optional<Employee> getById(Integer id) {
        return list.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst();
    }

    public void addEmployee(Employee employee) {
        list.add(employee);
    }


}
