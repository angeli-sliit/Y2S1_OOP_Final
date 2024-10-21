package nov2022_vB_Q4;

public abstract class Meal {
	static IPrepareQuickly quick;
	static IPrepareDeliciously delicious;

	
	public void setDuration(IPrepareQuickly quick) {
		Meal.quick=quick;
	}
	public void setFlavor(IPrepareDeliciously delicious) {
		Meal.delicious=delicious;
	}
	
	public static void mealwithFlavour() {
		delicious.addFlavour();
	}
	
	public static void meallnDuration() {
		quick.deliveryTime();
	} 
	public static void displaycost() {
		System.out.println("Cost for the meal is = " + delicious.getcost());
	}
	
	public abstract void displayMeal();
	
	
}
