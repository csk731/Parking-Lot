package com.parkinglot.controllers;

import com.parkinglot.dtos.CreateTicketRequestDto;
import com.parkinglot.dtos.CreateTicketResponseDto;
import com.parkinglot.models.Ticket;
import com.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public CreateTicketResponseDto createTicket(CreateTicketRequestDto requestDto){
        Ticket ticket=ticketService.createTicket(requestDto.getVehicle(), requestDto.getGate());
        CreateTicketResponseDto responseDto=new CreateTicketResponseDto();
        responseDto.setTicket(ticket);
        return responseDto;
    }
}
