package oct2019_vB_Q4;

public class GameFest implements IFestival {
	double budget;
	
	public void performEvent() {
		// TODO Auto-generated method stub
		System.out.println("perform GameFest event for " + getBudget());

	}

	@Override
	public double getBudget() {
		// TODO Auto-generated method stub
		budget=400000.00;
		return budget;
	}

}
