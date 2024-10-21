package June2024_vB_Q1;

import java.util.*;

public class StudentManager {
	ArrayList<Student> StuDetailArray;
	Student stu;
	
	
	public StudentManager() {
		StuDetailArray = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		StuDetailArray.add(student);
	}
	
	public void searchStudent(int StudentID) {
		for(Student s :StuDetailArray) {
			if(s.studentID == StudentID) {
				s.displayStudentDetails();
			}
			
		}
	}
	
	public void updateStudent(int StudentID, double newGPA) {
		for(Student s :StuDetailArray) {
			if(s.studentID == StudentID) {
				s.updateGPA(newGPA);
			}
		}
	}
	
	public void displayAllStudent() {
		for(Student s : StuDetailArray) {
			s.displayStudentDetails();
			System.out.println();
		}
	}
	
}
