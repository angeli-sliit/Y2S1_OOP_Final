package Q4;

public class LaunchMissile implements MissileOperation {
	MissileSystem mSystem;
	
	public LaunchMissile(MissileSystem rms) {
		this.mSystem= rms;
	}
	public void initiateOperation(String location) {
		mSystem.launch(location);

	}

}
