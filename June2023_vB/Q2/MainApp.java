package Q2;

public class MainApp {
	public static void main(String[] args) {
		Pair<String , Integer> obj1 = new Pair<>("Test 1", 42);
		Pair<Double, String> obj2 = new Pair<>(3.14,"Test 2");
		
		System.out.println("Printing First Pair ");
		System.out.println("First value  :  " + obj1.getFirst());
		System.out.println("Second value :  " + obj1.getSecond());
		System.out.println();
		System.out.println("Printing Second Pair ");
		System.out.println("First value  :  " + obj2.getFirst());
		System.out.println("Second value :  " + obj2.getSecond());
		
	}
}


class Pair<T, U>{
	T value1;
	U value2;
	
	public Pair(T value1, U value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public T getFirst() {
		return value1;
	}
	public U getSecond() {
		return value2;
	}
	
}
