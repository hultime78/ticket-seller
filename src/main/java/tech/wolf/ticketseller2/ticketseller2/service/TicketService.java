package tech.wolf.ticketseller2.ticketseller2.service;

import tech.wolf.ticketseller2.ticketseller2.model.Ticket;

import java.util.Set;

public interface TicketService {


    Ticket generateNew(Ticket ticket);
    Set<Ticket> retrieveAll();
    Ticket findOneById(long id);
    Set<Ticket> findManyByAgent(long AgentId);

}
