package Q4;

public class TestStratergy {
	public static void main (String[] args) {
		Meal meal = new Breakfast();
		meal.setFlavour(new ChickenFlavor());
		meal.setDuration(new ThirtyMinutes());
		meal.dispalyMeal();
		System.out.println();
		
		Meal meal1 = new Lunch();
		meal1.setFlavour(new FishFlavor());
		meal1.setDuration(new OneHour());
		meal1.dispalyMeal();
		System.out.println();
		
		Meal meal3 = new Dinner();
		meal3.setFlavour(new EggFlavor());
		meal3.setDuration(new FourtyFiveMinutes());
		meal3.dispalyMeal();
		System.out.println();
	}
		
}
