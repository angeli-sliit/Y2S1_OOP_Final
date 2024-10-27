package Q4;

public abstract class Meal {
	IPrepareDeliciously iPrepareDeliciously;
	IPrepareQuickly iPrepareQuickly;

	public void setFlavor(IPrepareDeliciously ip){
		iPrepareDeliciously=ip;
	}
	
	public void setDuration(IPrepareQuickly iq) {
		iPrepareQuickly = iq;
	}
	
	public void mealWhithFlavor(){
		iPrepareDeliciously.addFlavour();
	}
	
	public void mealInDuration() {
		iPrepareQuickly.deliveryTime();
	}
	
	public abstract void displayMeal();
	public abstract void displayCost();
}
