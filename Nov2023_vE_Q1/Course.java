package Nov2023_vE_Q1;

public abstract class Course {
	String code;
	String courseName;
	public Course() {
		this.code = null;
		this.courseName = null;
	}
	public Course(String code, String courseName) {
		this.code = code;
		this.courseName = courseName;
	}
	public abstract void DisplayCourseDtails();
}
