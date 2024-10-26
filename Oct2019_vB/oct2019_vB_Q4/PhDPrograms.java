package oct2019_vB_Q4;

public class PhDPrograms implements IPrograms {
	
	double cost; 
	
	@Override
	public void offerPrograms() {
		// TODO Auto-generated method stub
		System.out.println("Offer PhD Programs");

	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost = 6000000.00;
		return cost;
	}

	

}
