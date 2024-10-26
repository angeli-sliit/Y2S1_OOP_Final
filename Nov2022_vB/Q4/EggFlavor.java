package Q4;

public class EggFlavor implements IPrepareDeliciously {

	@Override
	public void addFlavor() {
		System.out.println("Added Egg for the meal");

	}

	@Override
	public double getCost() {
		double cost = 60;
		return cost;
	}
	
	

}
