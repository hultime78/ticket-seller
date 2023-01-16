package tech.wolf.ticketseller2.ticketseller2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.wolf.ticketseller2.ticketseller2.model.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {
}
