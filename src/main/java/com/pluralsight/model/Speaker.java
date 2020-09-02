package com.pluralsight.model;

import java.util.Date;

public class Speaker {

    private String firstName;
    private String lastName;
    private Date conferenceDate;
    private double ticketNumber;

    public double getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(double ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getConferenceDate() {
        return conferenceDate;
    }

    public void setConferenceDate(Date conferenceDate) {
        this.conferenceDate = conferenceDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
