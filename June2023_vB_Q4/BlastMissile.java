package June2023_vB_Q4;

public class BlastMissile implements MissileOperation{
	MissileSystem missile;
	
	public BlastMissile (MissileSystem missile) {
		this.missile=missile;
	}
	@Override
	public void initiateoperation(String location) {
		missile.blast(location);
		
	}

}
