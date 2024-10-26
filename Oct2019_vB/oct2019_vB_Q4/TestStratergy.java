package oct2019_vB_Q4;

public class TestStratergy {
	public static void main(String[] args) {
		Student Ps = new PostGraduateStudent();
		Ps.setFestifal(new CodeFest());
		Ps.setProgram(new MScPrograms());
		Ps.displayStudents();
		
		System.out.println();
		Student Us = new UndergraduateStudent();
		Us.setFestifal(new RoboFest());
		Us.setProgram(new BScPrograms());
		Us.displayStudents();
		
	}
}
