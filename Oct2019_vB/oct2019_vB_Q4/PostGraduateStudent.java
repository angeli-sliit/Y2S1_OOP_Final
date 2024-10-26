package oct2019_vB_Q4;

public class PostGraduateStudent extends Student{

	@Override
	public void displayStudents() {
		// TODO Auto-generated method stub
		offerPrograms();
		conductEvents();
		DisplayCost();
		System.out.println("Display post gtaduate Students");
		
		
	}

	@Override
	public void DisplayCost() {
		System.out.println("Cost for postGraduate progtam is " + p.getCost());
		
	}

}
