package Nov2023_vB_Q1;

import java.util.Scanner;

public class Product {
	
	Scanner scan = new Scanner(System.in);
	
	
	int productID;
	String name;
	double price;
	int quantity;
	
	
	public Product() {
		this.productID = 0;
		this.name = null;
		this.price = 0.0;
		this.quantity = 0;
	}


	public Product(int productID, String name, double price, int quantity) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public void read() {
		
		System.out.print("Product ID : ");
		productID=scan.nextInt();
		
		System.out.print("Name       : ");
		name=scan.next();
		
		System.out.print("Price      : ");
		price=scan.nextDouble();
		
		System.out.print("Quantity   : ");
		quantity=scan.nextInt();
		
	}
	
	public void Display() {
		System.out.println("Product ID : " + productID);
		System.out.println("Name       : " + name);
		System.out.println("Price      : " + price );
		System.out.println("Quantity   : " + quantity);

	}
	
}
