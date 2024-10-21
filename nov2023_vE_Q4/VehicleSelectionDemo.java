package nov2023_vE_Q4;

public class VehicleSelectionDemo {
    private static final String CAR = "Car";
    private static final String BUS = "Bus";

    public static void main(String[] args) {
        ((ICar) VehicleProducer.getVehicle(CAR).getModel("RollsRoyce")).displayVehicle();
        ((ICar) VehicleProducer.getVehicle(CAR).getModel("Benz")).displayVehicle();
        ((ICar) VehicleProducer.getVehicle(CAR).getModel("BMW")).displayVehicle();

        ((IBus) VehicleProducer.getVehicle(BUS).getModel1("Volvo")).displayVehicle();
        ((IBus) VehicleProducer.getVehicle(BUS).getModel1("Fuso")).displayVehicle();
        ((IBus) VehicleProducer.getVehicle(BUS).getModel1("TATA")).displayVehicle();
    }
}
