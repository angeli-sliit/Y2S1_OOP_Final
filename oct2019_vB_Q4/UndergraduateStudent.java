package oct2019_vB_Q4;

public class UndergraduateStudent extends Student {

	@Override
	public void displayStudents() {
		// TODO Auto-generated method stub
		offerPrograms();
		conductEvents ();
		DisplayCost();
		System.out.println("Display Under gtaduate Students");
		
		
	}

	@Override
	public void DisplayCost() {
		System.out.println("Cost for UnderGraduate progtam is " + p.getCost());
		
	}

}
