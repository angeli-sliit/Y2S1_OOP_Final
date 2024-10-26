package Nov2023_vE_Q2;
import java.util.*;

public class Question02B {
    static HashMap<String, Product> productMap = new HashMap<>();
    
    public void addProduct(String code, String name, int quantity, double price) {
        if (productMap.containsKey(code)) {
            Product existingProduct = productMap.get(code);
            existingProduct.setQuantity(existingProduct.getQuantity() + quantity); // Update quantity
            System.out.println("Product already exists. Updated quantity: " + existingProduct.getQuantity());
        } else {
            Product newProduct = new Product(name, quantity, price);
            productMap.put(code, newProduct);
            System.out.println("Added new product: " + name);
        }
    }
    
    public void removeProduct(String code) {
        if (productMap.containsKey(code)) {
            productMap.remove(code);
            System.out.println("Product deleted successfully...");
        } else {
            System.out.println("Product does not exist....");
        }
    }
    
    public void displayProducts() {
        System.out.println("\nCurrent Inventory:");
        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.println("Product Code: " + entry.getKey() + ", " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Question02B inventoryManager = new Question02B();

    
        inventoryManager.addProduct("P001", "Laptop", 10, 799.99);
        inventoryManager.addProduct("P002", "Smartphone", 25, 499.99);
        inventoryManager.addProduct("P001", "Laptop", 5, 299.99); // Update existing Laptop quantity
        inventoryManager.addProduct("P004", "Headphones", 30, 99.99);
        inventoryManager.addProduct("P005", "Smartwatch", 20, 199.99);
        

        inventoryManager.displayProducts();

        System.out.println();
        inventoryManager.removeProduct("P001");
        inventoryManager.removeProduct("P004");

        inventoryManager.displayProducts();
    }
}

class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', quantity=" + quantity + ", price=" + price + "}";
    }
}
