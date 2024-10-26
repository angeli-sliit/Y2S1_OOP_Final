package Q4;

public class Lunch extends Meal {
	
	public Lunch() {
		super();
		System.out.println("Preparing Lunch......");
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
