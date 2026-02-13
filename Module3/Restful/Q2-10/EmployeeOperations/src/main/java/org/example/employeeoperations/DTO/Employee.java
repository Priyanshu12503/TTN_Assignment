package org.example.employeeoperations.DTO;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

//Q2- Created the employee structure
public class Employee {

    @Nonnull
    private Integer id;
    @Size(min=2,message = "Name is too short")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Nonnull
    public Integer getId() {
        return id;
    }

    public void setId(@Nonnull Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Positive
    private Integer age;

}
