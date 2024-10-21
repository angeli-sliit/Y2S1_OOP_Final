package nov2023_vE_Q4;

public class Fuso implements IBus {
    private static Fuso instance;

    private Fuso() {}

    public static synchronized Fuso getInstance() {
        if (instance == null) {
            instance = new Fuso();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Factory turns out Fuso Bus");
    }
}
