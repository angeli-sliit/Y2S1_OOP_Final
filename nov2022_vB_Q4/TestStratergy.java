package nov2022_vB_Q4;

public class TestStratergy {

	public static void main(String[] args) {
		Meal meal=new Breakfast();
		meal.setFlavor(new chickenFlavour());
		meal.setDuration(new ThirtyMinute());
		meal.displayMeal();
		
		System.out.println();
		Meal meal2 = new Lunch();
        meal2.setFlavor(new FishFlavour());
        meal2.setDuration(new OneHour());
        meal2.displayMeal();

        System.out.println();
        Meal meal3 = new Dinner();
        meal3.setFlavor(new EggFlavour());
        meal3.setDuration(new FourtyFiveMinutes());
        meal3.displayMeal();

	}

}
