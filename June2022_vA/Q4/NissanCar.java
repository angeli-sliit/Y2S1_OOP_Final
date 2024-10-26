package Q4;

public class NissanCar extends Car {
	CarAirBag airBag;
	public NissanCar(CarAirBag AirBag) {
		this.airBag=AirBag;
		System.out.println("Assembling for Nissan");
	}
	@Override
	public void assembleLight() {
		airBag.airBagLightIndicator();

	}

	@Override
	public void assembleMotionSensor() {
		airBag.airBagMotionDetection();

	}

}
