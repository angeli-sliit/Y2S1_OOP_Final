package Q4;

public class ChickenFlavor implements IPrepareDeliciously {
	
	@Override
	public void addFlavour() {
		System.out.println("Add Chiken for the meal");
		
	}

	@Override
	public double getCost() {
		double cost = 100;
		return cost;
	}

}











class FishFlavor implements IPrepareDeliciously{

	@Override
	public void addFlavour() {
		System.out.println("Add Fish for the meal");
		
	}

	@Override
	public double getCost() {
		double cost = 80;
		return cost;
	}

}














class EggFlavor implements IPrepareDeliciously{

	@Override
	public void addFlavour() {
		System.out.println("Add Egg for the meal");
		
	}

	@Override
	public double getCost() {
		double cost = 60;
		return cost;
	}

}