package org.example.employeejpa.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//Q1- Employee entity created
@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String location;

    public Employee(Long id, Integer age, String name, String location) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.location = location;
    }

    public Employee() {

    }
}
