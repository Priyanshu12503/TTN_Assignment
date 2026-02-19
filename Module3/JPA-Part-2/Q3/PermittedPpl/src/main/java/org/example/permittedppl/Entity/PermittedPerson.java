package org.example.permittedppl.Entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  // change here
@DiscriminatorColumn(name = "person_type")
public abstract class PermittedPerson {

    @Id
    @Column(name = "aadhaar_number")
    private String aadhaarNumber;

    private String name;
    private Integer age;

    public PermittedPerson() {
    }

    public PermittedPerson(String aadhaarNumber, String name, Integer age) {
        this.aadhaarNumber = aadhaarNumber;
        this.name = name;
        this.age = age;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}