package com.parkinglot;

import com.parkinglot.controllers.ParkingLotController;
import com.parkinglot.controllers.TicketController;
import com.parkinglot.dtos.CreateTicketRequestDto;
import com.parkinglot.dtos.CreateTicketResponseDto;
import com.parkinglot.repositories.ParkingLotRepository;
import com.parkinglot.repositories.SpotRepository;
import com.parkinglot.repositories.TicketRepository;
import com.parkinglot.services.TicketService;
import com.parkinglot.strategies.slotallocation.RandomSpotAssignmentStrategy;
import com.parkinglot.strategies.slotallocation.SpotAllocationStrategy;

public class Client {
    public static void main(String[] args) {
        ObjectRegistry objectRegistry=new ObjectRegistry();
        objectRegistry.register("parkingLotRepository", new ParkingLotRepository());
        objectRegistry.register("ticketRepository", new TicketRepository());
        objectRegistry.register("spotRepository",new SpotRepository());

        objectRegistry.register("spotAllocationStrategy",new RandomSpotAssignmentStrategy());

        objectRegistry.register("ticketService",
                new TicketService(
                        (TicketRepository) objectRegistry.get("ticketRepository"),
                        (ParkingLotRepository) objectRegistry.get("parkingLotRepository"),
                        (SpotAllocationStrategy) objectRegistry.get("spotAllocationStrategy"),
                        (SpotRepository) objectRegistry.get("spotRepository"))
                );

        objectRegistry.register("parkingLotController", new ParkingLotController());
        objectRegistry.register("ticketController", new TicketController((TicketService) objectRegistry.get("ticketService")));

        CreateTicketRequestDto request=new CreateTicketRequestDto();

/*
        Vehicle vehicle=new Vehicle();
        vehicle.setVehicleNumber("1234");
        vehicle.setVehicleType(VehicleType.CAR);
*/
        request.setVehicle(null);

/*
        Gate gate=new EntryGate();
        gate.setGateNumber(1);
        gate.setGateStatus(GateStatus.OPEN);
*/
        request.setGate(null);

        CreateTicketResponseDto response=((TicketController)objectRegistry.get("ticketController")).createTicket(request);
    }
}
