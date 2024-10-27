package Q4;

public class OneHour implements IPrepareQuickly {

	@Override
	public void deliveryTime() {
		System.out.println("Meal is ready in 60 minutes");

	}

}












class ThirtyMinutes implements IPrepareQuickly {

	@Override
	public void deliveryTime() {
		System.out.println("Meal is ready in 30 minutes");

	}

}


















class FortyFiveMinutes implements IPrepareQuickly {

	@Override
	public void deliveryTime() {
		System.out.println("Meal is ready in 45 minutes");

	}

}
