package org.example.swaggerdesc.Entity;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Employee entity representing details of employee ")
public class Employee {

    @Schema(description = "Unique id of employee ")
    private Integer id;

    @Schema(description = "Name of employee ")
    private String name;

    @Schema(description = "Age of employee")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
