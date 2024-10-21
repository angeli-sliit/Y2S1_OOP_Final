package June2024_vB_Q1;

public class Student {
	int studentID;
	String name;
	String major;
	double GPA;
	
	public Student() {
		this.studentID = 0;
		this.name = null;
		this.major = null;
		this.GPA = 0.0;
	}

	public Student(int studentID, String name, String major, double GPA) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.major = major;
		this.GPA = GPA;
	}
	public void updateGPA(double newGPA) {
		this.GPA=newGPA;
	}
	public void displayStudentDetails() {
		System.out.println("Student ID :" + studentID);
		System.out.println("Name       :" + name);
		System.out.println("Major      :" + major);
		System.out.println("GPA        :" + GPA);
	}
	
}
