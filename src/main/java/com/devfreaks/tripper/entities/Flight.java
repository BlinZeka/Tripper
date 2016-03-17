package com.devfreaks.tripper.entities;

import com.devfreaks.tripper.entities.enums.FlightStatus;
import com.devfreaks.tripper.entities.enums.FlightType;
import java.util.Date;

public class Flight {
    
    private String id;
    private Airplane airplane;
    private Date time;
    private City from;
    private City to;
    private FlightStatus status;
    private FlightType type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public City getFrom() {
        return from;
    }

    public void setFrom(City from) {
        this.from = from;
    }

    public City getTo() {
        return to;
    }

    public void setTo(City to) {
        this.to = to;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    public FlightType getType() {
        return type;
    }

    public void setType(FlightType type) {
        this.type = type;
    }

    
    
}
