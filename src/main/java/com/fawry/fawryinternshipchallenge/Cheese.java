package com.fawry.fawryinternshipchallenge;

import java.time.LocalDate;

public class Cheese extends Product implements Shippable {
    private LocalDate expiryDate;
    private double weight;

    public Cheese(String name, double price, int quantity, double weight, LocalDate expiryDate) {
        super(name, price, quantity);
        this.weight = weight;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }

    @Override
    public boolean needsShipping() {
        return true;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
