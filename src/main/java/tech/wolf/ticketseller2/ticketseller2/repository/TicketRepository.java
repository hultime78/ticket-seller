package tech.wolf.ticketseller2.ticketseller2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.wolf.ticketseller2.ticketseller2.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
