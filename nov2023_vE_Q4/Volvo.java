package nov2023_vE_Q4;

public class Volvo implements IBus {
    private static Volvo instance;

    private Volvo() {}

    public static synchronized Volvo getInstance() {
        if (instance == null) {
            instance = new Volvo();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Factory turns out Volvo Bus");
    }
}

