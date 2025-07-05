public class FawryInternshipChallenge {
    public static void main(String[] args) {

        // Test Case 1: Normal purchase
        Customer customer = new Customer("Mahmoud", 500);

        Product cheese = new Cheese("Cheese", 100, 5, 200, LocalDate.of(2025, 7, 15));
        Product biscuits = new Cheese("Biscuits", 150, 3, 700, LocalDate.of(2025, 7, 20));
        Product scratchCard = new ScratchCard("Scratch Card", 50, 10);

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);

        cart.checkout(customer);

        /*
        // Test Case 2: Empty cart
        Customer customer = new Customer("Mahmoud", 500);
        Cart cart = new Cart();
        cart.checkout(customer);
        */

        /*
        // Test Case 3: Expired product
        Customer customer = new Customer("Mahmoud", 500);
        Product expiredCheese = new Cheese("Expired Cheese", 100, 5, 200, LocalDate.of(2024, 1, 1));
        Cart cart = new Cart();
        cart.add(expiredCheese, 1);
        cart.checkout(customer);
        */

        /*
        // Test Case 4: Quantity exceeds available stock
        Customer customer = new Customer("Mahmoud", 500);
        Product cheese = new Cheese("Cheese", 100, 3, 200, LocalDate.of(2025, 7, 15));
        Cart cart = new Cart();
        cart.add(cheese, 5); // Requested 5, but only 3 available
        cart.checkout(customer);
        */

        /*
        // Test Case 5: Insufficient balance
        Customer customer = new Customer("Mahmoud", 100);
        Product cheese = new Cheese("Cheese", 100, 5, 200, LocalDate.of(2025, 7, 15));
        Cart cart = new Cart();
        cart.add(cheese, 2); // Total = 200, but customer only has 100
        cart.checkout(customer);
        */

        /*
        // Test Case 6: Only non-shippable product
        Customer customer = new Customer("Mahmoud", 300);
        Product scratchCard = new ScratchCard("Scratch Card", 50, 10);
        Cart cart = new Cart();
        cart.add(scratchCard, 1);
        cart.checkout(customer);
        */
    }
}
