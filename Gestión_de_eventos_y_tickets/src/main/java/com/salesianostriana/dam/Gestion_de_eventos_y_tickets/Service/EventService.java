package com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Service;

import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository.EventRepository;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository.OrganizerRepository;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository.VenueRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private EventRepository eventRepository;
    private OrganizerRepository organizerRepository;
    private VenueRepository venueRepository;

    
}
