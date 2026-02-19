package org.example.permittedppl.TablePerClassEnity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "performer_tpc")
public class TPCPerformer extends TPCPerson {

    @Column(name = "skill")
    private String skill;

    public String getSkill() { return skill; }
    public void setSkill(String skill) { this.skill = skill; }
}
