package June2024_vB_Q1;

public class StudentManagementApp {
	public static void main(String[] args) {
		StudentManager sm =new StudentManager();
		
		Student s1 = new Student(1,"Wickrama","IT", 3.66);
		Student s2 = new Student(2,"Arachchige","DS", 3.55);
		Student s3 = new Student(3,"Angeli","SE", 2.78);
		Student s4 = new Student(4,"Tharushika","ISE", 3);
		Student s5 = new Student(5,"Fernando","SC", 2.95);
		
		sm.addStudent(s1);
		sm.addStudent(s2);
		sm.addStudent(s3);
		sm.addStudent(s4);
		sm.addStudent(s5);
		
		sm.searchStudent(2);
		System.out.println();
		
		sm.searchStudent(4);
		sm.updateStudent(4, 3.7);
		sm.searchStudent(4);
		System.out.println();
		
		sm.displayAllStudent();
		System.out.println();
	}
}
