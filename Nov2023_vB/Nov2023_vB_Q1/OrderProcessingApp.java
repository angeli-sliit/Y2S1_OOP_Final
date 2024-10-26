package Nov2023_vB_Q1;

public class OrderProcessingApp {
	public static void main(String[] args) {
		Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        
        System.out.println("Enter details for Product 1:");
        p1.read();

        System.out.println("Enter details for Product 2:");
        p2.read();

        System.out.println("Enter details for Product 3:");
        p3.read();

        System.out.println("Enter details for Product 4:");
        p4.read();
        
        Order o1 = new Order(101, "Angeli", "2024.10.21");
        Order o2 = new Order(102, "Tharushika", "2024.10.28");
        
        o1.addProduct(p1);
        o1.addProduct(p3);
        
        o2.addProduct(p2);
        o2.addProduct(p4);
        
        System.out.println("\nOrder 1 Details:");
        o1.processOrder();

        System.out.println("\nOrder 2 Details:");
        o2.processOrder();
		
	}  

}
