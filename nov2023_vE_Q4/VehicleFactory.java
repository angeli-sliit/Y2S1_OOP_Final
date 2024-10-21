package nov2023_vE_Q4;

public interface VehicleFactory {
    ICar getModel(String carModel);
    IBus getModel1(String busModel);
}
