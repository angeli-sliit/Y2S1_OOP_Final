package Q4;

public class Dinner extends Meal {

	
	public Dinner() {
		super();
		System.out.println("Preparing Dinner......");
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
	
	


