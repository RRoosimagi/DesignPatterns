package Shopping;

public class Test {
    public static void main(String[] args) {
        Product tomato = new Product(10, "Tomato", 2.4);
        Product cucumber = new Product(20, "Cucumber", 3.2);
        Product pear = new Product(30, "Pear", 2.9);
        Product milk = new Product(40, "Milk", 0.75);
        Product pork = new Product(50, "Pork", 6.75);
        Product lemonade = new Product(60, "Lemonade", 0.85);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(tomato);
        cart.addProduct(cucumber);
        cart.addProduct(pear);
        cart.addProduct(milk);
        cart.addProduct(pork);
        cart.addProduct(lemonade);

        System.out.println("Products in the cart:");
        cart.displayProducts();

        System.out.println("Total price: $" + cart.calculateTotalPrice());

        cart.removeProduct(pear);

        System.out.println("Products in the cart after removing Pear:");
        cart.displayProducts();

        System.out.println("Total price after removing Pear: $" + cart.calculateTotalPrice());

        cart.clearCart();

        System.out.println("Products in the cart after clearing:");
        cart.displayProducts();

        System.out.println("Total price after clearing: $" + cart.calculateTotalPrice());
    }
}

