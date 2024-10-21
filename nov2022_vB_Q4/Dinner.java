package nov2022_vB_Q4;

public class Dinner extends Meal{

	@Override
	public void displayMeal() {
		System.out.println("Preparing Dinner...");
		mealwithFlavour();
		meallnDuration();
		displaycost();
		
	}

}
