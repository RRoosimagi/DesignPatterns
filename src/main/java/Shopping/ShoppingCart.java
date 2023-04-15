package Shopping;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void removeProduct(Product product) {
        cartItems.remove(product);
    }

    public void displayProducts() {
        System.out.println("Products in the cart:");
        for (Product p : cartItems) {
            System.out.println("- " + p.getProductName() + ", price: " + p.getPrice());
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product p : cartItems) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    public void clearCart() {
        cartItems.clear();
        System.out.println("Cart is cleared.");
    }
}
