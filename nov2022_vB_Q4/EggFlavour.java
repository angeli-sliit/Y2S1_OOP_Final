package nov2022_vB_Q4;

public class EggFlavour implements IPrepareDeliciously {

	private double cost;
	@Override
	public void addFlavour() {
		System.out.println("Added Egg for meal");

	}

	@Override
	public double getcost() {
		cost = 60;
		return cost;
	}

}
