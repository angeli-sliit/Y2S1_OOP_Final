package nov2022_vB_Q4;

public class FishFlavour implements IPrepareDeliciously {

	private double cost;
	@Override
	public void addFlavour() {
		System.out.println("Added Fish for meal");

	}

	@Override
	public double getcost() {
		cost = 80;
		return cost;
	}

}
