package org.example.authoraddress.Entity;

import jakarta.persistence.Embeddable;


//Q1- Created class Address

@Embeddable
public class Adderess {

    private Integer streetNumber;
    private String location;
    private String state;

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
