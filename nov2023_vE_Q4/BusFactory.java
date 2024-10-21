package nov2023_vE_Q4;

public class BusFactory implements VehicleFactory {
    private static BusFactory instance;

    private BusFactory() {}

    public static synchronized BusFactory getInstance() {
        if (instance == null) {
            instance = new BusFactory();
        }
        return instance;
    }

    @Override
    public ICar getModel(String carModel) {
        return null; // This factory doesn't produce cars
    }

    @Override
    public IBus getModel1(String busModel) {
        switch (busModel) {
            case "Volvo": return Volvo.getInstance();
            case "Fuso": return Fuso.getInstance();
            case "TATA": return TATA.getInstance();
            default: return null;
        }
    }
}

