package nov2023_vE_Q4;

public class VehicleProducer {
    public static VehicleFactory getVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return CarFactory.getInstance();
        } else if (vehicleType.equalsIgnoreCase("Bus")) {
            return BusFactory.getInstance();
        }
        return null;
    }
}
