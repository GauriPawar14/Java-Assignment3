package assignment;

public class TestShopping {

	public static void main(String[] args) {
		  Product product1 = new Product("Laptop", 999.99);
	        Product product2 = new Product("Phone", 699.99);
	        Product product3 = new Product("Headphones", 99.99);

	        ShoppingCart cart = new ShoppingCart();
	        cart.addProduct(product1);
	        cart.addProduct(product2);
	        cart.addProduct(product3);

	        cart.displayCart();
	}

}
