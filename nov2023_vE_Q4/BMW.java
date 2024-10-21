package nov2023_vE_Q4;

public class BMW implements ICar {
    private static BMW instance;

    private BMW() {}

    public static synchronized BMW getInstance() {
        if (instance == null) {
            instance = new BMW();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Factory turns out BMW Car");
    }
}