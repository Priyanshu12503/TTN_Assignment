package org.example.permittedppl.JoinedEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "audience_joined")
public class AudienceJoined extends JoinedPerson {

    @Column(name = "ticket_number")
    private String ticketNumber;


    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }
}
