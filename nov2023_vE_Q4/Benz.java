package nov2023_vE_Q4;

public class Benz implements ICar {
    private static Benz instance;

    private Benz() {}

    public static synchronized Benz getInstance() {
        if (instance == null) {
            instance = new Benz();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Factory turns out Benz Car");
    }
}


