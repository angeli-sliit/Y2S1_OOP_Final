package oct2019_vB_Q4;

public class RoboFest implements IFestival {
	double budget;
	@Override
	public void performEvent() {
		System.out.println("perform RoboFest event for " +getBudget());

	}

	@Override
	public double getBudget() {
		// TODO Auto-generated method stub
		budget=800000.00;
		return budget;
	}

}
