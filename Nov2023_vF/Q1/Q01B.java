package Q1;

import java.util.HashMap;
import java.util.Map;

public class Q01B {
    static HashMap<String, Product> hMap = new HashMap<>();

    public static void main(String[] args) {
        
    	Q01B.addProduct("P001", "Laptop", 10, 799.99);
        Q01B.addProduct("P002", "Smartphone", 25, 499.99);
        Q01B.addProduct("P001", "Laptop", 5, 299.99); // Update existing Laptop quantity
        Q01B.addProduct("P004", "Headphones", 30, 99.99);
        Q01B.addProduct("P005", "Smartwatch", 20, 199.99);

        System.out.println("\nInitial Inventory:");
        Q01B.displayProduct();

        System.out.println("\nRemoving some products...");
        Q01B.removeProduct("P001");
        Q01B.removeProduct("P004");

        System.out.println("\nInventory after removals:");
        Q01B.displayProduct();
    }
	
	
	public static void addProduct(String code, String name, int quantity,double price) {
		if(hMap.containsKey(code)) {
			Product exitProduct = hMap.get(code);
			exitProduct.quantity += quantity;
			System.out.println("Product updated successfully");
			
		}
		else {
			Product newProduct = new Product(code, name, quantity, price);
			hMap.put(code, newProduct);
			System.out.println("Product added successfully.");
		}
		
		
	}
	public static void removeProduct(String code) {
		if(hMap.containsKey(code)) {
			hMap.remove(code);
			System.out.println("Product successfully removed.");
		}
		else {
			System.out.println("Product with code not found.");
		}
	}
	
	public static void displayProduct() {
		System.out.println("Product in ");
		for(Map.Entry<String, Product> i : hMap.entrySet()) {
			 System.out.println("Product Code: " + i.getKey() + ", " + i.getValue());
			
		}
	}
}

class Product{

	String code;
	String name;
	int quantity;
	double price;


	public Product(String code, String name, int quantity, double price) {
		super();
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		 return "Name: " + name + ", Quantity: " + quantity + ", Price: $" + price;
	}
	
}
