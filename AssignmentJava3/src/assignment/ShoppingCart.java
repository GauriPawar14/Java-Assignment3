package assignment;
import java.util.ArrayList;
public class ShoppingCart {
	private ArrayList<Product> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public double calculateTotalCost() {
        double totalCost=0;
        for (Product product : cart) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product product : cart) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total cost: $" + calculateTotalCost());
    }
}
