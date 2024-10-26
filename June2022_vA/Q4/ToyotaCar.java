package Q4;

public class ToyotaCar extends Car{
	CarAirBag airBag;
	public ToyotaCar(CarAirBag AirBag) {
		this.airBag=AirBag;
		System.out.println("Assembling for Toyota");
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
