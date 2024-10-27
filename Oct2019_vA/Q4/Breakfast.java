package Q4;

public class Breakfast extends Meal {
	
	public Breakfast() {
		System.out.println("Preparing Breakfast.....");
	}

	@Override
	public void displayMeal() {
		mealWhithFlavor();
		mealInDuration();
		displayCost();
		System.out.println();

	}

	@Override
	public void displayCost() {
		System.out.println("Cost for meal = "+ iPrepareDeliciously.getCost());

	}

}

class Lunch extends Meal {
	public Lunch() {
		System.out.println("Preparing Lunch.....");
	}

	@Override
	public void displayMeal() {
		mealWhithFlavor();
		mealInDuration();
		displayCost();
		System.out.println();

	}

	@Override
	public void displayCost() {
		System.out.println("Cost for meal = "+ iPrepareDeliciously.getCost());

	}

}


class Dinner extends Meal {
	public Dinner() {
		System.out.println("Preparing Dinner.....");
	}

	@Override
	public void displayMeal() {
		mealWhithFlavor();
		mealInDuration();
		displayCost();
		System.out.println();

	}

	@Override
	public void displayCost() {
		System.out.println("Cost for meal = "+ iPrepareDeliciously.getCost());

	}

}
