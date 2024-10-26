package Q2;

import java.util.HashMap;

public class Company{
	public static void main(String[] args) {
		 HashMap<Integer, Employee<?, ?>> empList = new HashMap<>();

	        Employee<String, String> emp1 = new Employee<>("EMP12345", "Nisal Perera");
	        Employee<Integer, String> emp2 = new Employee<>(123456, "Krishan Gamage");
		empList.put(1, emp1);
		empList.put(2, emp2);
		
		for(int id : empList.keySet()) {
			Employee<?,?> value = empList.get(id);
			System.out.println("Employee Number: " + id + " and the Employee ID is : "+ value.getEmpID());
		}
	}
}




class Employee <T , U> {
	 T empID;
	 U name;

	 public Employee(T empID, U name) {
	     this.empID = empID;
	     this.name = name;
	 }
	
	public T getEmpID() {
		return empID;
	}
}



