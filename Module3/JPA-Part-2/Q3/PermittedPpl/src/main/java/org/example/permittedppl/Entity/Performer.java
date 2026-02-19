package org.example.permittedppl.Entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("PERFORMER")
public class Performer extends PermittedPerson {

    private String performanceType;
    private Double performanceFee;

    public Performer() {}

    public Performer(String aadhaar, String name, Integer age,
                     String performanceType, Double performanceFee) {
        super(aadhaar, name, age);
        this.performanceType = performanceType;
        this.performanceFee = performanceFee;
    }

    public String getPerformanceType() {
        return performanceType;
    }

    public void setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
    }

    public Double getPerformanceFee() {
        return performanceFee;
    }

    public void setPerformanceFee(Double performanceFee) {
        this.performanceFee = performanceFee;
    }
}
