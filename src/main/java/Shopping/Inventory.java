package Shopping;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> getProductsByPrice(double price) {
        return this.products.stream()
                .filter(p -> p.getPrice() < price)
                .toList();
    }

    public List<Product> getProductsByQuantity(int quantity) {
        return this.products.stream()
                .filter(p -> p.getQuantity() >= quantity)
                .toList();
    }

    public double getTotalPrice() {
        return this.products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public double getAveragePrice() {
        return this.products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0);
    }

    public Product getMostExpensiveProduct() {
        return this.products.stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
    }
    public static void main(String[] args) {
        Product product1 = new Product(1, "Product 1", 10.99, 5);
        Product product2 = new Product(2, "Product 2", 5.99, 10);
        Product product3 = new Product(3, "Product 3", 15.99, 20);

        Inventory inventory = new Inventory();
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        List<Product> productsByPrice = inventory.getProductsByPrice(9);
        System.out.println("Price is less than a given: " +productsByPrice.size());   // Output: 2

        List<Product> productsByQuantity = inventory.getProductsByQuantity(15);
        System.out.println("Product quanty is greater than given: " +productsByQuantity.size());    // Output: 1

        System.out.println("Inventory prices sum is:  " +inventory.getTotalPrice());   // Output: 32.97
        System.out.println("Average prices of all the products is: " +inventory.getAveragePrice()); // Output: 10.99

        Product mostExpensiveProduct = inventory.getMostExpensiveProduct();
        System.out.println("Most expensive product is: " +mostExpensiveProduct.getProductName());  // Output: "Product 3"
    }
}
