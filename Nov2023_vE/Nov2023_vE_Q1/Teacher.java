package Nov2023_vE_Q1;

import java.util.ArrayList;

public class Teacher extends Person{
	ArrayList<Course> coursesTaught;
	
	public Teacher() {
		super();
		this.coursesTaught = new ArrayList<>();
	}
	
	public Teacher(int ID, String name) {
		super(ID,name);
		this.coursesTaught = new ArrayList<>();
	}
	 public void coursesTaught(Course c) {
		 coursesTaught.add(c);
	 }
	@Override
	public void DisplayDtails() {
		// TODO Auto-generated method stub
		System.out.println("Teacher ID   : " + ID);	
		System.out.println("Teacher name : " + name);
		System.out.println("List of courses teach : ");
		for (Course c: coursesTaught) {
			c.DisplayCourseDtails();
		}
		System.out.println();
	}

}
