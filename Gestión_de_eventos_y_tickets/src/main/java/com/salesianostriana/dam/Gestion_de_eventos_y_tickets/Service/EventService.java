package com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Service;

import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Event;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Organizer;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Venue;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository.EventRepository;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository.OrganizerRepository;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository.VenueRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EventService {

    private EventRepository eventRepository;
    private OrganizerRepository organizerRepository;
    private VenueRepository venueRepository;

    public Event crearEvento(Long organizerId, Long venueId, Event eventDetails) {
        Organizer organizer = organizerRepository.findById(organizerId)
                .orElseThrow(() -> new EntityNotFoundException("Organizer not found"));
        Venue venue = venueRepository.findById(venueId)
                .orElseThrow(() -> new EntityNotFoundException("Venue not found"));

        eventDetails.setOrganizer(organizer);
        eventDetails.setVenue(venue);

        return eventRepository.save(eventDetails);
    }

    public Set<Event> listarEventoSegunSuCiudad(String city) {
        if (eventRepository.findByVenueCity(city).isEmpty()){
            throw new RuntimeException("Nose ha encontrado el evento de esa Ciudad");
        }else{
            return eventRepository.findByVenueCity(city);
        }
    }
}
