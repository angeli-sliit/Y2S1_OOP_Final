package nov2023_vE_Q4;

public class RollsRoyce implements ICar {
    private static RollsRoyce instance;

    private RollsRoyce() {}

    public static synchronized RollsRoyce getInstance() {
        if (instance == null) {
            instance = new RollsRoyce();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Factory turns out RollsRoyce Car");
    }
}
