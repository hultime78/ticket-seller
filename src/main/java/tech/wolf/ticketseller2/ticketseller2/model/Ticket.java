package tech.wolf.ticketseller2.ticketseller2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    long cost;
    String destination;
    @OneToOne
    @JoinColumn(name = "agent_Id")
    Agent agent;
    Date date;
}
