package Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arrayList =new ArrayList<Integer>();
		ArrayList<Integer> oddList =new ArrayList<Integer>();
		
		System.out.println("Enter numbers (0 to quit): ");
		while(true) {
			
			int num = scan.nextInt();
			if(num == 0) {
				break;
			}
			arrayList.add(num);
		}
		for(Integer i : arrayList) {
			if(i%2 != 0) {
				oddList.add(i);
			}
		}
		System.out.print("Odd numbers : " + oddList);	
		scan.close();
	}
}
