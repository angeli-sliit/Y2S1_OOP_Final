package Q4;

public class Test {

	public static void main(String[] args) {
		HeatMissileSystem hms = HeatMissileSystem.getInstence();
		RocketMissileSystem rms = RocketMissileSystem.getInstence();
		
		MissileController c = MissileController.getInstence();
		
		c.setOperattion(new LaunchMissile(hms), new BlastMissile(hms) );
		c.performLaunching("Colombo");
		c.performBlasting("MH 370");
		
		
		c.setOperattion(new LaunchMissile(rms), new BlastMissile(rms) );
		c.performLaunching("Kandy");
		c.performBlasting("MH 420");
		
	}

}
