package com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Service;

import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Event;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Ticket;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class TicketsService {

    private TicketRepository ticketRepository;

    public Set<Ticket> listarTicketSegunEventos(Long evento_id){
        if (ticketRepository.findByEvent(evento_id).isEmpty()){
            throw new RuntimeException("No se ha encontrado ningun ticket para ese evento");
        }else{
            return ticketRepository.findByEvent(evento_id);
        }
    }
}
