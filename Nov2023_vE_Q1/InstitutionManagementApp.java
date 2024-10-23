package Nov2023_vE_Q1;

public class InstitutionManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student (1,"Angeli");
		Student s2 = new Student (2,"Tharushika");
		
		Teacher t1 = new Teacher (001,"Samanka");
		Teacher t2 = new Teacher (002,"Nilmini");
		
		Course c1 = new concreatCourse("101", "Math");
		Course c2 = new concreatCourse("102", "Art");
		Course c3 = new concreatCourse("103", "IT");
		
		s1.EurolIncourse(c1);
		s1.EurolIncourse(c3);
		s2.EurolIncourse(c2);
		
		t1.coursesTaught(c1);
		t1.coursesTaught(c2);
		t2.coursesTaught(c3);

		s1.DisplayDtails();
		s2.DisplayDtails();
		t1.DisplayDtails();
		t2.DisplayDtails();

	}

}
