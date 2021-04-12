package com.company.rental;

public class BrazilTaxCalculator implements TaxCalculator {

    @Override
    public double taxCalculator(double value) {
        double tax = value > 100 ? 0.15: 0.2;
        return value * tax;
    }
}
