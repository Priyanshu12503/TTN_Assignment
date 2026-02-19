package org.example.permittedppl.Entity;


import jakarta.persistence.*;

@Entity
@DiscriminatorValue("AUDIENCE")
public class Audience extends PermittedPerson {

    private String seatNumber;

    public Audience() {}

    public Audience(String aadhaar, String name, Integer age, String seatNumber) {
        super(aadhaar, name, age);
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}
