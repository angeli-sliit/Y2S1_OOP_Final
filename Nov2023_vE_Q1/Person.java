package Nov2023_vE_Q1;

public abstract class Person {
	int ID;
	String name;
	public Person() {
		ID = 0;
		this.name = null;
	}
	public Person(int iD, String name) {
		ID = iD;
		this.name = name;
	}
	
	public abstract void DisplayDtails();
	
}
