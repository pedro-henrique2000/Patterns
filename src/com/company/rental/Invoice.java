package com.company.rental;

public class Invoice {

    private double basicValue;
    private double tax;

    public Invoice(double basicValue, double tax) {
        this.basicValue = basicValue;
        this.tax = tax;
    }

    public double getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(double basicValue) {
        this.basicValue = basicValue;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double total() {
        return getBasicValue() + getTax();
    }

    public double basicValue() {
        return getBasicValue();
    }
}
