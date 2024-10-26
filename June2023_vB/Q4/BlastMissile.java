package Q4;

public class BlastMissile implements MissileOperation {
	MissileSystem mSystem;
	public BlastMissile(MissileSystem mSystem) {
		this.mSystem=mSystem;
	}
	@Override
	public void initiateOperation(String location) {
		mSystem.Blast(location);

	}

}
