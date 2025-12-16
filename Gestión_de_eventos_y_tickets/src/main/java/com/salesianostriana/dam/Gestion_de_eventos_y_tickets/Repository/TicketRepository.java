package com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository;

import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Event;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {

    Set<Ticket> findByEvent(Long evento_id);
}
