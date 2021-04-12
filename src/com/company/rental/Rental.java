package com.company.rental;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Rental {
    private Date start;
    private Date end;
    private Vehicle vehicle;
    private Invoice invoice;
    private static final int HOUR_IN_SECONDS = 3600;

    public Rental(Date start, Date end, Vehicle vehicle) {
        this.start = start;
        this.end = end;
        this.vehicle = vehicle;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
