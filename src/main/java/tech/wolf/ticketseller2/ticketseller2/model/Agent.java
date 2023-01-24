package tech.wolf.ticketseller2.ticketseller2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Agent {

    @Id
    String id;
    String password;
    String type;
    String idBus;
}
