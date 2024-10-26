package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
	static ArrayList<Student> students = new ArrayList<Student>();
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Course c1 = new Course();
		Course c2 = new Course();
		
		s1.read();
		s2.read();
		s3.read();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		c1.read();
		c2.read();
		
		c1.addStudent(s2);
		c1.addStudent(s1);
		c2.addStudent(s3);
		
		System.out.println("Student Information : ");
		for(Student i : students) {
			i.print();
		}
		
		System.out.println("Course Information : ");
		c1.print();
		c2.print();

	}

}





class Student{
	String studentID;
	String name;
	String address;
	String contactNumber;
	Scanner scan = new Scanner(System.in);
	
	public Student() {
		
		super();
		studentID = null;
		this.name = null;
		this.address = null;
		this.contactNumber = null;
	}
	
	public void read() {
		
		
		System.out.print("Enter student ID : ");
		studentID = scan.nextLine();
		
		System.out.print("Enter student name : ");
		name = scan.nextLine();
		
		System.out.print("Enter student address : ");
		address = scan.nextLine();
		
		System.out.print("Enter student contact number : ");
		contactNumber = scan.nextLine();
		System.out.println();
		
		
	}
	public void print() {
		System.out.println("Student ID     : " + studentID);
		System.out.println("Name           : " + name);
		System.out.println("Address        : " + address);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println();
		
	}
	
}

class Course{
	Scanner scan = new Scanner(System.in);
	String courseID;
	String name;
	String instructor;
	Student student;
	ArrayList<Student> enrolledStudent = new ArrayList<Student>() ;
	public Course() {
		super();
		this.courseID = null;
		this.name = null;
		this.instructor = null;
	}
	
	
	public void read() {
		
		
		System.out.print("Enter course ID : ");
		courseID = scan.nextLine();
		
		System.out.print("Enter course name : ");
		name = scan.nextLine();
		
		System.out.print("Enter course address : ");
		instructor = scan.nextLine();
		System.out.println();

	}
	
	public void addStudent(Student stu) {
		
		
		enrolledStudent.add(stu);
	}
	
	public void print() {
		System.out.println("Course ID             : " + courseID);
		System.out.println("Course Name           : " + name);
		System.out.println("Instructor            : " + instructor);
		System.out.println("Enrolled Student      : ");
		for(Student i: enrolledStudent) {
			System.out.println(i.name);
			
		}
		System.out.println();
		
	}
}
