package com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository;

import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
