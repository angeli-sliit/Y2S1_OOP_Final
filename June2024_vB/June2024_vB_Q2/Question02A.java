package June2024_vB_Q2;

import java.util.*;
public class Question02A {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		Scanner scan =new Scanner(System.in);
		
		int ID = 0;
		int Quantity=0;
		int rid;
// 1
		while(true) {
			System.out.print("Product ID : ");
			ID=scan.nextInt();
			if(ID==-99) {
				break;
			}
			
			System.out.print("Quantity   : ");
			Quantity=scan.nextInt();
			
			hm.put(ID,Quantity);
		}
		System.out.println();
		
//2		
		System.out.print("Enter Prouduct ID needs to be remove : ");
		rid=scan.nextInt();
		if(hm.containsKey(rid)) {
			hm.remove(rid);
			System.out.println("Recode was successfully removed.......");
		}
		else {
			System.out.println("Product ID not found!!!!");
		}

//3
		System.out.println();
		System.out.println("Total number of product in HashMap : " + hm.size());
	
//4		
		System.out.println();
		for(HashMap.Entry<Integer, Integer> i : hm.entrySet()) {
				 System.out.println("key: " + i.getKey() + " value: " + i.getValue());
		}
		scan.close();
	}

}
