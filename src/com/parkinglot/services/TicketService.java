package com.parkinglot.services;

import com.parkinglot.models.*;
import com.parkinglot.repositories.ParkingLotRepository;
import com.parkinglot.repositories.SpotRepository;
import com.parkinglot.repositories.TicketRepository;
import com.parkinglot.strategies.slotallocation.SpotAllocationStrategy;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private SpotAllocationStrategy spotAllocationStrategy;
    private SpotRepository spotRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, SpotAllocationStrategy spotAllocationStrategy, SpotRepository spotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.spotAllocationStrategy = spotAllocationStrategy;
        this.spotRepository = spotRepository;
    }

    public Ticket createTicket(Vehicle vehicle, Gate gate){
        Ticket ticket=new Ticket();
        ticket.setGate(gate);
        ticket.setLocalDateTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setOperator(gate.getOperator());
        Spot spot=spotAllocationStrategy.assignSpot(parkingLotRepository.getParkingLotforGate(),vehicle.getVehicleType());
        spot.setSpotStatus(SpotStatus.FILLED);
        ticket.setSpot(spotRepository.saveSpot(spot));
        return ticketRepository.saveTicket(ticket);
    }
}
