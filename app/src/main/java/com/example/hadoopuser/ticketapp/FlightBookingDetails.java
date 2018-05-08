package com.example.hadoopuser.ticketapp;

public class FlightBookingDetails {
    private String name;
    private String age;
    private String source;
    private String destination;
    private String flight;
    private String fare;

    public FlightBookingDetails(String name, String age, String source, String destination, String flight, String fare, String schedule) {
        this.name = name;
        this.age = age;
        this.source = source;
        this.destination = destination;
        this.flight = flight;
        this.fare = fare;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    private String schedule;

}
