package Nov2023_vE_Q1;

import java.util.ArrayList;

public class Student extends Person{
	ArrayList<Course> enrolledCourses;
	
	public Student() {
		super();
		this.enrolledCourses = new ArrayList<>();
	}
	
	public Student(int ID, String name) {
		super(ID,name);
		this.enrolledCourses = new ArrayList<>();
	}
	 public void EurolIncourse(Course c) {
		 enrolledCourses.add(c);
	 }

	@Override
	public void DisplayDtails() {
		System.out.println("Student ID   : " + ID);	
		System.out.println("Student name : " + name);
		System.out.println("Enrolled courses : ");
		for (Course c: enrolledCourses) {
			c.DisplayCourseDtails();
		}
		System.out.println();
	}
}
