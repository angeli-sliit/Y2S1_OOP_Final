package Nov2023_vE_Q4;

public class Fuso implements IBus{
	public static Fuso instence;
		
	public synchronized static Fuso getInstence() {
		if(instence == null) {
			instence = new Fuso();
		}
		return instence;
	}
	public void displayVehicle() {
		System.out.println("Factory turn out Fuso Bus");

	}
}
