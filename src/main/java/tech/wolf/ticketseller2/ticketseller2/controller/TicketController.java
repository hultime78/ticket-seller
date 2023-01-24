package tech.wolf.ticketseller2.ticketseller2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.wolf.ticketseller2.ticketseller2.model.Ticket;
import tech.wolf.ticketseller2.ticketseller2.service.TicketService;

import java.util.Set;

@RestController
public class TicketController {

    TicketService service;
    TicketController(TicketService service){
        this.service=service;
    }

    @PostMapping("/ticket/new")
    Ticket addNew(@RequestBody Ticket ticket){
        return service.generateNew(ticket);
    }
    @GetMapping("/ticket/all")
    Set<Ticket> all(){
        return service.retrieveAll();
    }


}
