package Nov2023_vE_Q4;

public class BusFactory implements VehicleFactory{
	public static BusFactory instence;
	
	public static synchronized BusFactory getInstence() {
		if(instence == null) {
			instence = new BusFactory();
		}
		return instence;
		
	}
	public IBus getModel1(String vehical) {
		if(vehical.equalsIgnoreCase("TATA")) {
			return TATA.getInstence();
		}
		else if(vehical.equalsIgnoreCase("Volvo")) {
			return Volvo.getInstence();
		}
		else if(vehical.equalsIgnoreCase("Fuso")) {
			return Fuso.getInstence();
		}
		else {
			System.out.println("Invalid Input......");
			return null;
		}
		
	}
	@Override
	public ICar getModel(String busModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
