package tech.wolf.ticketseller2.ticketseller2.service.impl;

import org.springframework.stereotype.Service;
import tech.wolf.ticketseller2.ticketseller2.model.Agent;
import tech.wolf.ticketseller2.ticketseller2.repository.AgentRepository;
import tech.wolf.ticketseller2.ticketseller2.service.AgentService;

import java.util.List;
import java.util.Optional;

@Service
public class AgentServiceImpl implements AgentService {

    AgentRepository repo;

    AgentServiceImpl(AgentRepository repo){
        this.repo=repo;
    }

    @Override
    public Agent addNew(Agent agent) {
        return repo.save(agent);
    }

    @Override
    public List<Agent> findAll() {
        return repo.findAll();
    }

    @Override
    public Agent findOne(String id) {
        Optional<Agent> agent=repo.findById(id);
        if(agent.isPresent()){
            return agent.get();
        }else throw new RuntimeException("Agent Not found");
    }

    @Override
    public boolean delete(String id) {
        Optional<Agent> agent=repo.findById(id);
        if(agent.isPresent()){
            repo.delete(agent.get());
            return true;
        }else throw new RuntimeException("Couldn't  delete the agent, cause: agent not found");
    }
}
