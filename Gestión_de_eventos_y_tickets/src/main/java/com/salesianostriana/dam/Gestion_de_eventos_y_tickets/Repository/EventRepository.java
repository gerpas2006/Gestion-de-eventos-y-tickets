package com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository;

import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
}
