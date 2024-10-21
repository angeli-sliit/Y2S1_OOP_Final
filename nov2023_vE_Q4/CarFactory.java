package nov2023_vE_Q4;

public class CarFactory implements VehicleFactory {
    private static CarFactory instance;

    private CarFactory() {}

    public static synchronized CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    @Override
    public ICar getModel(String carModel) {
        switch (carModel) {
            case "BMW": return BMW.getInstance();
            case "Benz": return Benz.getInstance();
            case "RollsRoyce": return RollsRoyce.getInstance();
            default: return null;
        }
    }

    @Override
    public IBus getModel1(String busModel) {
        return null; // This factory doesn't produce buses
    }
}
