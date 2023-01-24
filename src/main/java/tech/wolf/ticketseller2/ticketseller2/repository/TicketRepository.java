package tech.wolf.ticketseller2.ticketseller2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.wolf.ticketseller2.ticketseller2.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
