package Nov2023_vE_Q4;

public class BMW implements ICar{
public static BMW instence;
	
	public synchronized static BMW getInstence() {
		if(instence == null) {
			instence = new BMW();
		}
		return instence;
	}
	public void displayVehicle() {
		System.out.println("Factory turn out BMW Car");

	}
}
