package June2023_vB_Q4;

public class RocketMissileSystem implements MissileSystem {
	
	private static RocketMissileSystem RMS;
	
	private RocketMissileSystem() {}
	
	public static RocketMissileSystem getInstence() {
		if(RMS == null) {
			RMS = new RocketMissileSystem();
			System.out.println("Initialize Rocket Missile System.....");
		}
		return RMS;
	}
	@Override
	public void launch(String source) {
		System.out.print("Rocket Missile system launch from "+ source);

	}

	@Override
	public void blast(String destination) {
		System.out.println(" and Missile blast Flight "+ destination);
		
		

	}

}
