package nov2023_vE_Q4;

public class TATA implements IBus {
    private static TATA instance;

    private TATA() {}

    public static synchronized TATA getInstance() {
        if (instance == null) {
            instance = new TATA();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Factory turns out TATA Bus");
    }
}
