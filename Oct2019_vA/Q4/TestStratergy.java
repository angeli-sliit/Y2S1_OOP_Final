package Q4;

public class TestStratergy {

	public static void main(String[] args) {
		Meal meal = new Breakfast();
		meal.setFlavor(new ChickenFlavor());
		meal.setDuration(new ThirtyMinutes());
		meal.displayMeal();
		

		Meal meal1 = new Breakfast();
		meal1.setFlavor(new FishFlavor());
		meal1.setDuration(new OneHour());
		meal1.displayMeal();
		
		
		Meal meal2 = new Breakfast();
		meal2.setFlavor(new EggFlavor());
		meal2.setDuration(new FortyFiveMinutes());
		meal2.displayMeal();
	}

}
