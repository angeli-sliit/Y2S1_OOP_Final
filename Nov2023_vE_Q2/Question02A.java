package Nov2023_vE_Q2;

import java.util.*;

public class  Question02A {
	public static void main(String[] args) {
		 PriorityQueue<String> book = new PriorityQueue<>();
		Scanner scan = new Scanner(System.in);
		String bookName;
		
		while (true) {
			System.out.print("Enter book name : ");
			bookName=scan.next();
			if(bookName.equalsIgnoreCase("Done")) {
				break;
			}
			book.add(bookName);
		}
		System.out.println();
		System.out.println("enter the title of the book you want to remove");
		String rBook = scan.next();
			if(book.remove(rBook)) {
				
				System.out.println("book was successfully removed....");
			}
			else {
				System.out.println("Title was not found.....");
			}
		
			System.out.println();
		System.out.println("Total number of books in the priorityQueue : " + book.size());
		
		System.out.println();
		System.out.println("Book list : ");
		for(String i : book) {
			System.out.println(i);
		}
	}
	
}
