package com.devfreaks.tripper.entities;

import com.devfreaks.tripper.entities.enums.ReservationStatus;
import java.util.UUID;

public class Reservation {
    
    private UUID id;
    private Client client;
    private Flight flight;
    private ReservationStatus status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
    
    
    
}
