package Nov2023_vE_Q4;

public class Benz implements ICar{
	public static Benz instence;
	
	public synchronized static Benz getInstence() {
		if(instence == null) {
			instence = new Benz();
		}
		return instence;
	}
	public void displayVehicle() {
		System.out.println("Factory turn out Benz Car");
	}

}
