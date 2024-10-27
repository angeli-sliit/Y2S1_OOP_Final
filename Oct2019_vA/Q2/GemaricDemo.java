package Q2;
import java.util.TreeMap;
import java.util.Map.Entry;

public class GemaricDemo {

	public static void main(String[] args) {
		AssendingTable<Integer, String> myTable = new AssendingTable<>();
		myTable.add(40,"ddd");
		myTable.add(10,"aaa");
		myTable.add(30,"ccc");
		myTable.add(20,"bbb");
		
		AssendingTable<Integer, Double> myTableD = new AssendingTable<>();
		myTableD.add(40,10.123);
		myTableD.add(10,23.456);
		myTableD.add(30,34.567);
		myTableD.add(20,45.678);
		 
		myTable.display();
	    myTableD.display();

	}

}


class AssendingTable <K extends Comparable<K>,V>{
	TreeMap<K, V> tableMap = new TreeMap<K, V>();

	public void add(K keyK , V value) {
		tableMap.put(keyK, value);
		
	}
	
	public void display() {
		for(Entry<K, V> entry : tableMap.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}
	
	
	
	
}