package org.example.permittedppl.JoinedEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "performer_joined")
public class PerformerJoined extends JoinedPerson {

    @Column(name = "skill")
    private String skill;

    public String getSkill() { return skill; }
    public void setSkill(String skill) { this.skill = skill; }


}
