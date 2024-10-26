package Q4;

public abstract class Meal {
	IPrepareQuickly PQ;
	IPrepareDeliciously PD;
	public void setFlavour(IPrepareDeliciously PD) {
		this.PD=PD;
	}
	public void setDuration(IPrepareQuickly PQ) {
		this.PQ=PQ;
	}
	
	public void mealWithFlavor() {
		PD.addFlavor();
	}
	public void mealInDuration() {
		PQ.deliveryTime();
	}
	
	public abstract void dispalyMeal();
	public abstract void displayCost(); 
}
