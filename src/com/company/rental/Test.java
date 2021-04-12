package com.company.rental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Vehicle vehicle = new Vehicle("Golfão Brabo");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Scanner sc = new Scanner(System.in);

        System.out.println("Price per day");
        double pricePerDay = sc.nextDouble();
        System.out.println("Price per hour:");
        double pricePerHour = sc.nextDouble();

        Date start = simpleDateFormat.parse("12/03/2021 19:35");
        Date end = simpleDateFormat.parse("14/03/2021 20:45");

        Rental rental = new Rental(start, end, vehicle);
        RentalService service = new RentalService(pricePerHour, pricePerDay, new BrazilTaxCalculator());
        service.createInvoice(rental);

        System.out.println("VALUES");
        System.out.println(rental.getInvoice().total());
        System.out.println(rental.getInvoice().getTax());
        System.out.println(rental.getInvoice().getBasicValue());

    }
}
