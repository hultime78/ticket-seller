package tech.wolf.ticketseller2.ticketseller2.service;

import tech.wolf.ticketseller2.ticketseller2.model.Agent;

import java.util.List;

public interface AgentService {


    Agent addNew(Agent agent);
    List<Agent> findAll();
    Agent findOne(String id);
    boolean delete(String id);
}
