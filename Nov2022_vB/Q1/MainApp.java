package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<RegCostomer> rCus = new ArrayList<RegCostomer>();
		
		rCus.add(new RegCostomer(101, "Kamal"));
		rCus.add(new RegCostomer(105, "Sunil"));
		
		for(RegCostomer i : rCus) {
			i.display();
			System.out.println();
		}

	}

}

abstract class Customer{
	Scanner scan = new Scanner(System.in);
		int id;
		String name;
		public Customer(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
		public void display() {
			System.out.println("Customer ID  : " + id);
			System.out.println("Customer name: " + name);
		
			
		}
		
		public abstract double calculateBill();
}


class RegCostomer extends Customer{
	static double rewardPoint;
	double netPoint;
	static double netAmount;
	
	public RegCostomer(int id, String name) {
		super(id, name);
		rewardPoint=0;
		netPoint=0;	}

	@Override
	public double calculateBill() {
		System.out.print("Enter Bill Amount: ");
		double BillAmount = scan.nextDouble();
		rewardPoint=0;
		if(BillAmount>950) {
			rewardPoint= BillAmount*0.15;
		}
		
		netAmount =  BillAmount - BillAmount*0.07;
		
		return netAmount;
		
		
		
	}
	
	public void display() {
		super.display();
		
		
		calculateBill() ;
		System.out.println("Coustomer reward point : " + RegCostomer.rewardPoint);
		System.out.println("Coustomer net amount   : " + RegCostomer.netAmount);
		
	}
	
}
