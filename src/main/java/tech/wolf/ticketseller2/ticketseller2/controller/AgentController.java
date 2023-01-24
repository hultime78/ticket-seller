package tech.wolf.ticketseller2.ticketseller2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.wolf.ticketseller2.ticketseller2.model.Agent;
import tech.wolf.ticketseller2.ticketseller2.service.AgentService;

import java.util.List;

@RestController
public class AgentController {

    AgentService service;
    AgentController (AgentService service){
        this.service=service;
    }

    @PostMapping("/agent/new")
    Agent addNew(@RequestBody Agent agent){
        return service.addNew(agent);
    }

    @GetMapping("/agent/all")
    List<Agent> all(){
        return service.findAll();
    }

}
