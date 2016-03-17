package com.devfreaks.tripper.entities;

import java.util.UUID;

public class Airplane {
    
    private UUID id;
    private String name;
    private AirplaneType type;

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

    public AirplaneType getType() {
        return type;
    }

    public void setType(AirplaneType type) {
        this.type = type;
    }
    
    
    
}
