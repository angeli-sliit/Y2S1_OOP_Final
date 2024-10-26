package Nov2023_vE_Q4;

public class Vehicleproducer {
	ICar car;
	IBus bus;
	public static VehicleFactory getVehical(String vehicalType) {
		if(vehicalType.equalsIgnoreCase("CAR")) {
			return CarFactory.getInstence();
		}
		else if(vehicalType.equalsIgnoreCase("Bus")) {
			return BusFactory.getInstence();
		}
		return null;
	}
}
