package tech.wolf.ticketseller2.ticketseller2.service.impl;

import tech.wolf.ticketseller2.ticketseller2.model.Ticket;
import tech.wolf.ticketseller2.ticketseller2.repository.TicketRepository;
import tech.wolf.ticketseller2.ticketseller2.service.TicketService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class TicketServiceImpl implements TicketService {

    TicketRepository repo;

    TicketServiceImpl(TicketRepository repo){
        this.repo=repo;
    }

    @Override
    public Ticket generateNew(Ticket ticket) {
        return repo.save(ticket);
    }

    @Override
    public Set<Ticket> retrieveAll() {
        return new HashSet<>(repo.findAll());
    }

    @Override
    public Ticket findOneById(long id) {
        Optional<Ticket> ticket=repo.findById(id);
        if(ticket.isPresent()){
            return ticket.get();
        }else throw new RuntimeException("Ticket not found");

    }

    @Override
    public Set<Ticket> findManyByAgent(long AgentId) {
        return new HashSet<>(repo.findAll().
                stream().filter(ticket -> ticket.getAgentID()==AgentId).toList());
    }
}
