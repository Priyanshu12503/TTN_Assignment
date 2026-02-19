package org.example.permittedppl.TablePerClassEnity;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class TPCPerson {

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
