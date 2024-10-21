package nov2022_vB_Q4;

public class chickenFlavour implements IPrepareDeliciously {
	private double cost;
	@Override
	public void addFlavour() {
		System.out.println("Added chicken for meal");

	}

	@Override
	public double getcost() {
		cost = 100;
		return cost;
	}

}
