package Q4;

public class ChickenFlavor implements IPrepareDeliciously {

	@Override
	public void addFlavor() {
		System.out.println("Added Chicken for the meal");
	}

	@Override
	public double getCost() {
		double cost = 100;
		return cost;
	}

}
