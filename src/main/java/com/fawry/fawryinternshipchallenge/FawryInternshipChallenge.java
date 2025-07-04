package com.fawry.fawryinternshipchallenge;

import java.time.LocalDate;
import com.fawry.fawryinternshipchallenge.Customer;
import com.fawry.fawryinternshipchallenge.Product;
import com.fawry.fawryinternshipchallenge.Cheese;
import com.fawry.fawryinternshipchallenge.Cart;

public class FawryInternshipChallenge {
    public static void main(String[] args) {
        Customer customer = new Customer("Mahmoud", 100); // رصيد قليل

        Product cheese = new Cheese("Cheese", 100, 5, 200, java.time.LocalDate.of(2025, 7, 15));
        Cart cart = new Cart();
        cart.add(cheese, 2); // سعرهم 200
        cart.checkout(customer);
    }
}

