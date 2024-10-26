package Nov2023_vE_Q4;

public class Volvo implements IBus{
public static Volvo instence;
	
	public synchronized static Volvo getInstence() {
		if(instence == null) {
			instence = new Volvo();
		}
		return instence;
	}
	public void displayVehicle() {
		System.out.println("Factory turn out Volvo Bus");

	}
}
