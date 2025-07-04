package com.fawry.fawryinternshipchallenge;

public class ScratchCard extends Product {

    public ScratchCard(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public boolean needsShipping() {
        return false;
    }
}
