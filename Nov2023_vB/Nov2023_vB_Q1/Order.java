package Nov2023_vB_Q1;

import java.util.*;

public class Order {
	
	Queue<Product> p =new LinkedList<>();
	Product product;
	int orderID;
	String cusName;
	String orderDate;
	
	public Order() {
		this.orderID = 0;
		this.cusName = null;
		this.orderDate = null;
	}
	
	public Order(int orderID, String cusName, String orderDate) {
		this.orderID = orderID;
		this.cusName = cusName;
		this.orderDate = orderDate;
	}
	
	public void addProduct(Product P) {
		p.add(P);
	}
	
	@SuppressWarnings("unused")
	public void processOrder() {
		System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + cusName);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Products in the Order:");
        
        for(Product i : p) {
        	 System.out.println("-----------------------");
			i.Display();
        }
	}
	
	
}
