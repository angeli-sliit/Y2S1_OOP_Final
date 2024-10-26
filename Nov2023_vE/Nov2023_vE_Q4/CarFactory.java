package Nov2023_vE_Q4;

public class CarFactory implements VehicleFactory{
	public static CarFactory instence;
	
	public static synchronized CarFactory getInstence() {
		if(instence == null) {
			instence = new CarFactory();
		}
		return instence;
	}
	public ICar getModel(String vehical) {
		if(vehical.equalsIgnoreCase("BMW")) {
			return BMW.getInstence();
		}
		else if(vehical.equalsIgnoreCase("Benz")) {
			return Benz.getInstence();
		}
		else if(vehical.equalsIgnoreCase("RollsRoys")) {
			return RollsRoys.getInstence();
		}
		else {
			System.out.println("Invalid Input......");
			return null;
		}
		
		
	}
	@Override
	public IBus getModel1(String busModel) {
		// TODO Auto-generated method stub
		return null;
	}
}
