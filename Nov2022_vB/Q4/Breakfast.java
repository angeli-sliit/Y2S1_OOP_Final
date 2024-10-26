package Q4;

public class Breakfast extends Meal {

	public Breakfast() {
		super();
		System.out.println("Preparing Breakfast......");
	}

	@Override
	public void dispalyMeal() {
		super.mealWithFlavor();
		super.mealInDuration();
		displayCost();
	}

	@Override
	public void displayCost() {
		System.out.println("Cost for the meal is : " + PD.getCost() );
	}

}
