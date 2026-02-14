package org.example.filteringdemo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StaticUser {

    private Integer id;

    private String name;

    @JsonIgnore
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
