package com.parkinglot.dtos;

import com.parkinglot.models.Ticket;

public class CreateTicketResponseDto {
    // Practically, I should not expose this ticket model to the client.
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
