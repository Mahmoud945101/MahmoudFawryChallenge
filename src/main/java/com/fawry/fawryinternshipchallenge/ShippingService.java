package com.fawry.fawryinternshipchallenge;

import java.util.List;

public class ShippingService {
    public static void ship(List<Shippable> items) {
        System.out.println();
        System.out.println("** Shipment Notice **");
        double totalWeight = 0;
        for (Shippable item : items) {
            System.out.printf("1x %s\t%.0fg\n", item.getName(), item.getWeight());
            totalWeight += item.getWeight();
        }
        System.out.printf("Total package weight: %.1fkg\n", totalWeight / 1000);
    }
}
