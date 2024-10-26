package Q4;

public class FishFlavor implements IPrepareDeliciously {

	@Override
	public void addFlavor() {
		System.out.println("Added Fish for the meal");

	}

	@Override
	public double getCost() {
		double cost = 80;
		return cost;
	}

}
