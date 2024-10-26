package Q1;

import java.util.ArrayList;

public class DemoApp {
	public static void main(String[] args) {
//		Employee Pemp1 = new PermanentEmp(101, "Nimali", 56000);
//		Employee Pemp2 = new PermanentEmp(102, "Amal", 74000);
//		
//		Employee Temp1 = new TemporaryEmp(201, "Sunil", 6,3150);
//		Employee Temp2 = new TemporaryEmp(202, "Piyal", 5,2510);
//		
//		Pemp1.display();
//		Pemp2.display();
//		
//		Temp1.display();
//		Temp2.display();
		
		ArrayList<PermanentEmp> pEmps = new ArrayList<PermanentEmp>();
		pEmps.add(new PermanentEmp(101, "Nimali", 56000));
		pEmps.add(new PermanentEmp(102, "Amal", 74000));
		
		for(PermanentEmp iEmp : pEmps) {
			iEmp.calculateNetSalary();
			iEmp.display();
		}
		
		ArrayList<TemporaryEmp> tEmps = new ArrayList<TemporaryEmp>();
		tEmps.add(new TemporaryEmp(201, "Sunil", 6,3150));
		tEmps.add(new TemporaryEmp(202, "Piyal", 5,2510));
		
		for(TemporaryEmp iEmp : tEmps) {
			iEmp.calculateNetSalary();
			iEmp.display();
		}
	}

}


abstract class Employee{
	 int id;
	 String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Employee ID    : " + id);
		System.out.println("Employee name  : " + name);
	}
	 public abstract double calculateNetSalary();
}


class PermanentEmp extends Employee{
	Employee emp;
	double basicSal;
	double commission;
	
	public PermanentEmp(int id, String name, double basicSal) {
		super(id, name);
		this.basicSal=basicSal;
		commission = basicSal*0.15;
	}

	@Override
	public double calculateNetSalary() {
		double netSal= basicSal+commission;
		return netSal;
		
	}
	public void display() {
		super.display();
		System.out.println("Basic Salary   : " + basicSal);
		System.out.println("Commission     : " + commission);
		System.out.println("Net Salary     : " + calculateNetSalary());
		System.out.println();
	}
	
}







class TemporaryEmp extends Employee{
	
	int otHrs;
	double otRate;
	double minWage;
	

	public TemporaryEmp(int id, String name, int otHrs, double otRate) {
		super(id, name);
		this.otHrs = otHrs;
		this.otRate = otRate;
		this.minWage = 15000;
	}

	@Override
	public double calculateNetSalary() {
		double netSal = minWage+(otHrs*otRate);
		return netSal;
	}
	public void display() {
		super.display();
		System.out.println("Minimum Wage   : " + minWage);
		System.out.println("Net Salary     : " + calculateNetSalary());
		System.out.println();
	}
}