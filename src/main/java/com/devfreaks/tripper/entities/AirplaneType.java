package com.devfreaks.tripper.entities;

import java.util.UUID;

public class AirplaneType {
    
    private UUID id;
    private String name;
    private Short seats;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getSeats() {
        return seats;
    }

    public void setSeats(Short seats) {
        this.seats = seats;
    }
    
    
    
}
