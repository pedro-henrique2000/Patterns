package com.company.rental;

import java.time.temporal.ChronoUnit;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private TaxCalculator taxCalculator;

    public RentalService(double pricePerHour, double pricePerDay, TaxCalculator taxCalculator) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxCalculator = taxCalculator;
    }

    public TaxCalculator getTaxCalculator() {
        return taxCalculator;
    }

    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void createInvoice(Rental rental) {
        double basicValue;
        double hours = (rental.getEnd().getTime() - rental.getStart().getTime()) / 1000 /60/60;

        if(hours > 12) {
            basicValue = Math.ceil(hours / 24) * pricePerDay;
        } else {
            basicValue = pricePerHour * Math.ceil(hours);
        }

        double tax = taxCalculator.taxCalculator(basicValue);

        rental.setInvoice(new Invoice(basicValue, tax));
    }
}
