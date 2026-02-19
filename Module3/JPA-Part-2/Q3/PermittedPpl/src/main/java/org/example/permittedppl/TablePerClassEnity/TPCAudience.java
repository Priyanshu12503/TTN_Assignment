package org.example.permittedppl.TablePerClassEnity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "audience_tpc")
public class TPCAudience extends TPCPerson {

    @Column(name = "ticket_number")
    private String ticketNumber;

    // Getters and Setters
    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }
}
