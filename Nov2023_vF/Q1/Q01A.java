package Q1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q01A {

	public static void main(String[] args) {
		
		PriorityQueue<String> bookTitle = new PriorityQueue<String>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter Book Name : ");
			String title = scan.nextLine();
			if(title.equalsIgnoreCase("Done")) {
				break;
			}
			bookTitle.add(title);
		}
		
		System.out.print("\nEnter the title of the book they want to remove : ");
		String removeTitle = scan.nextLine();
		
		if(bookTitle.contains(removeTitle)) {
			bookTitle.remove(removeTitle);
			System.out.println("Book was successfully removed. ");
		}
		else {
			System.out.println("The book title was not found. ");
		}
		
		
		System.out.println("\nTotal number of books in the priorityQueue : " + bookTitle.size());
		
		
		System.out.println("\nRemaining book titles in the priorityQueue : "); 
		for(String i : bookTitle) {
			System.out.println(i);
		}
		scan.close();

	}

}
