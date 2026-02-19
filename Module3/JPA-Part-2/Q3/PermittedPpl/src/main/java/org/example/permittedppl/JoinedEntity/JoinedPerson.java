package org.example.permittedppl.JoinedEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "joined_person")
@Inheritance(strategy = InheritanceType.JOINED)
public class JoinedPerson {

    @Id
    @Column(name = "aadhaar")
    private String aadhaar;

    @Column(name = "name")
    private String name;

    public String getAadhaar() { return aadhaar; }
    public void setAadhaar(String aadhaar) { this.aadhaar = aadhaar; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
