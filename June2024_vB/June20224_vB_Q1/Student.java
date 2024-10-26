package June20224_vB_Q1;

import java.util.*;

public class Student {
	int studentID;
	String name;
	int age;
	String major;
	double GPA;
	public Student() {
		super();
		this.studentID = 0;
		this.name = null;
		this.age = 0;
		this.major = null;
		this.GPA =0.0;
	}
	
	public Student(int studentID, String name, int age, String major, double GPA) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.major = major;
		this.GPA = GPA;
	}
	
	public void updateGPA(double newGPA) {
		this.GPA=newGPA;
	}
	public void displayStudentDetails() {
		System.out.println("Student ID   : " + studentID);
		System.out.println("Student name : " + name);
		System.out.println("Age          : " + age);
		System.out.println("Major        : " + major);
		System.out.println("GPA          : " + GPA);
		System.out.println("........................................\n");
	}
	
}


class StudentManager{
	ArrayList<Student> studentList ;

	public StudentManager() {
		this.studentList =new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void searchStudent(int SID) {
		for(Student i : studentList) {
			if(i.studentID == SID) {
				i.displayStudentDetails();
			}
		}
	}
	
	public void updateStudentGPA(int SID, double newGPA) {
		for(Student i : studentList) {
			if(i.studentID == SID) {
				i.GPA=newGPA;
				System.out.println("GPA updated Successfully");
			}
		}
	}
	public void displayAllStudent() {
		for(Student i : studentList) {
				i.displayStudentDetails();
		}
	}

	
}



class StudentManagementApp{
	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		
		sm.addStudent(new Student(101, "Wickrama", 19, "IT", 3.2));
		sm.addStudent(new Student(102, "Arachchige", 23, "SE", 2.71));
		sm.addStudent(new Student(103, "Angeli", 22, "DS", 3.82));
		sm.addStudent(new Student(104, "Tharushika", 21, "ISE", 3.01));
		sm.addStudent(new Student(105, "Fernando", 20, "CN", 2.9));
		
		sm.searchStudent(104);
		
		System.out.println("Update Student :");
		sm.updateStudentGPA(104, 2.95);
		sm.searchStudent(104);
		
		
		System.out.println("All Student :");
		sm.displayAllStudent();
		
	}
}






























