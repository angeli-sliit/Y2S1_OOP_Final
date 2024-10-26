package Nov2023_vE_Q4;

public class VehicleSelectionDemo {
	private static final String CAR = "car";
	private static final String BUS = "bus";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ((ICar) Vehicleproducer.getVehical(CAR).getModel("RollsRoys")).displayVehicle();
	     ((ICar) Vehicleproducer.getVehical(CAR).getModel("Benz")).displayVehicle();
	     ((ICar) Vehicleproducer.getVehical(CAR).getModel("BMW")).displayVehicle();

	     ((IBus) Vehicleproducer.getVehical(BUS).getModel1("Volvo")).displayVehicle();
	     ((IBus) Vehicleproducer.getVehical(BUS).getModel1("Fuso")).displayVehicle();
	     ((IBus) Vehicleproducer.getVehical(BUS).getModel1("TATA")).displayVehicle();

	}

}
