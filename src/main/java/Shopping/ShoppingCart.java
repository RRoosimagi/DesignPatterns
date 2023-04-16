package Shopping;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        this.cartItems.add(product);
    }

    public void removeProduct(Product product) {
        this.cartItems.remove(product);
    }

    public void displayCartItems() {
        if (this.cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (Product product : this.cartItems) {
                System.out.println(product.getProductName() + " - $" + product.getPrice() + " - " + product.getQuantity() + " pcs");
            }
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : this.cartItems) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }

    public void clearCart() {
        this.cartItems.clear();
    }

    public static void main(String[] args) {
        // Create some test products
        Product product1 = new Product(1, "Product 1", 10.99, 5);
        Product product2 = new Product(2, "Product 2", 5.99, 10);
        Product product3 = new Product(3, "Product 3", 7.49, 3);

        // Create an instance of the shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to the cart
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Display the products in the cart
        System.out.println("Products in the cart:");
        cart.displayCartItems();
        System.out.println();

        // Calculate the total price of the items in the cart
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total price of items in the cart: $" + totalPrice);
        System.out.println();

        // Remove a product from the cart
        System.out.println("Removing Product 2 from the cart...");
        cart.removeProduct(product2);
        System.out.println();

        // Display the updated contents of the cart

        System.out.println("Products in the cart after removing Product 2:");
        cart.displayCartItems();
        System.out.println();

        // Clear the cart
        System.out.println("Clearing the cart...");
        cart.clearCart();
        System.out.println();

        // Display the contents of the cart again (should be empty)
        System.out.println("Products in the cart after clearing:");
        cart.displayCartItems();
    }
}
