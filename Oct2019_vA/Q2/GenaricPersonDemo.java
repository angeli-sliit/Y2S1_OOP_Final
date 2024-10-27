package Q2;

import java.util.ArrayList;

public class GenaricPersonDemo {
	public static <T> void main (String[] array) {
		ArrayList<Student> students = new  ArrayList<Student>();
		students.add(new Student("STD1111", 6));
		students.add(new Student("STD2222", 7));
		students.add(new Student("STD3333", 12));
		students.add(new Student("STD4444", 11));
		students.add(new Student("STD5555", 10));
		
		ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
		lecturers.add(new Lecturer("EMP0000", "IT"));
		lecturers.add(new Lecturer("EMP1111", "SE"));
		lecturers.add(new Lecturer("EMP2222", "CSN"));
		lecturers.add(new Lecturer("EMP3333", "EE"));
		lecturers.add(new Lecturer("EMP4444", "IS"));
		
		GenaricPerson genaricPerson = new GenaricPerson();
		genaricPerson.displayElement(students);
		System.out.println();
		genaricPerson.displayElement(lecturers);
	}
}



interface Iperson{
	public String displayDetails();
}

class Student implements Iperson{
	String studentID;
	int grade;
	
	public Student(String studentID, int grade) {
		super();
		this.studentID = studentID;
		this.grade = grade;
	}

	@Override
	public String displayDetails() {
		 return "Student ID: " + studentID + ", Grade: " + grade;
	}
	
	
}


class Lecturer implements Iperson{
	String employeeID;
	String department;
	
	public Lecturer(String employeeID, String department) {
		super();
		this.employeeID = employeeID;
		this.department = department;
	}

	@Override
	public String displayDetails() {
		return "Employee ID: " + employeeID + ", Department: " + department;
	}
}


class GenaricPerson <T extends Iperson>{
	public void displayElement(ArrayList<T> ar) {
		for(T i : ar) {
			System.out.println(i.displayDetails());
		}
	}
}






























