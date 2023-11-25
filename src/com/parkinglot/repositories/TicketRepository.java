package com.parkinglot.repositories;

import com.parkinglot.models.Ticket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TicketRepository {
    // private List<Ticket> tickets=new ArrayList<>();
    private HashMap<Long, Ticket> tickets=new HashMap<>();
    private long lastIdCount=0;
    public Ticket saveTicket(Ticket ticket){
        ticket.setId(lastIdCount+1);
        tickets.put(lastIdCount+1,ticket);
        lastIdCount+=1;
        return ticket;
    }
    public Ticket getTicketbyId(long id){
//        for(Ticket ticket:tickets){
//            if(ticket.getId()==id){
//                return ticket;
//            }
//        }
        return tickets.get(id);
    }
}
