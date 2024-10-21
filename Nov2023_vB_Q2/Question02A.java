package Nov2023_vB_Q2;

import java.util.*;

public class Question02A {
	public static void main(String[] Args) {
		ArrayList<String> AL = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		
		while(true) {
			System.out.print("Enter Employee name : ");
			name =scan.next();
			
			if(name.equalsIgnoreCase("Done")) {
				break;
			}
			AL.add(name);
		}
		
		System.out.print("\nEnter the Employee name to remove: ");
		String rName = scan.next();
		for(String i : AL) {
			if(i.equals(rName)) {
				AL.remove(i);
				System.out.println("name  was  successfully removed.... ");
			}
			else {
				System.out.println("name was not found..... ");

			}			
		}
		System.out.println("\nTotalnumberofemployees inthe ArrayList :" + AL.size());
		System.out.println("\nAll the remaining employee names ");
		for(String i : AL) {
			System.out.println(i);	
		}
		scan.close();
	}
}
