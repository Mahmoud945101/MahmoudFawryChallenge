package com.fawry.fawryinternshipchallenge;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void add(Product product, int quantity) {
        if (quantity <= product.getQuantity()) {
            items.add(new CartItem(product, quantity));
        } else {
            System.out.println("Requested quantity is not available for product: " + product.getName());
        }
    }

    public void checkout(Customer customer) {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double subtotal = 0;
        double shipping = 0;
        List<Shippable> toShip = new ArrayList<>();

        for (CartItem item : items) {
            Product p = item.getProduct();

            if (p.isExpired()) {
                System.out.println("Product is expired: " + p.getName());
                return;
            }

            if (item.getQuantity() > p.getQuantity()) {
                System.out.println("Requested quantity is not available: " + p.getName());
                return;
            }

            subtotal += item.getTotalPrice();

            if (p.needsShipping() && p instanceof Shippable) {
                toShip.add((Shippable) p);
                shipping += 30;
            }
        }

        double total = subtotal + shipping;

        if (customer.getBalance() < total) {
            System.out.println("Insufficient balance.");
            return;
        }

        customer.deduct(total);

        for (CartItem item : items) {
            item.getProduct().reduceQuantity(item.getQuantity());
        }

        if (!toShip.isEmpty()) {
            ShippingService.ship(toShip);
        }

        System.out.println();
        System.out.println("** Checkout Receipt **");
        for (CartItem item : items) {
            System.out.printf("%dx %s\t%.2f\n", item.getQuantity(), item.getProduct().getName(), item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.printf("Subtotal:\t%.2f\n", subtotal);
        System.out.printf("Shipping:\t%.2f\n", shipping);
        System.out.printf("Total:\t\t%.2f\n", total);
        System.out.printf("Balance Left:\t%.2f\n", customer.getBalance());
    }
}
