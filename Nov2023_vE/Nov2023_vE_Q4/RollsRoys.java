package Nov2023_vE_Q4;

public class RollsRoys implements ICar{
public static RollsRoys instence;
	
	public synchronized static RollsRoys getInstence() {
		if(instence == null) {
			instence = new RollsRoys();
		}
		return instence;
	}
	public void displayVehicle() {
		System.out.println("Factory turn out RollsRoys Car");

	}
}
