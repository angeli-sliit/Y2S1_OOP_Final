package oct2019_vB_Q4;

public class BScPrograms implements IPrograms {
	double cost; 
	@Override
	public void offerPrograms() {
		System.out.println("Offer BSc Programs");

	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost=120000.00;
		return cost;
	}


}
