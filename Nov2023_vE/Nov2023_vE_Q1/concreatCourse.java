package Nov2023_vE_Q1;

public class concreatCourse extends Course {
	public concreatCourse() {
        super();
    }

    public concreatCourse(String code, String courseName) {
        super(code,courseName);
    }

    @Override
    public void  DisplayCourseDtails() {
        System.out.println("Course Code: " + code + ", Course Name: " + courseName);
    }
}
