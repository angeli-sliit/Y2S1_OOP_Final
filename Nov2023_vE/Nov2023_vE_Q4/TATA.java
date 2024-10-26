package Nov2023_vE_Q4;

public class TATA implements IBus{
	public static TATA instence;
	
	public synchronized static TATA getInstence() {
		if(instence == null) {
			instence = new TATA();
		}
		return instence;
	}
	public void displayVehicle() {
		System.out.println("Factory turn out TATA Bus");

	}

}
