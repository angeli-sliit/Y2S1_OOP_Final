package Q4;

public class RocketMissileSystem implements MissileSystem {
	private static RocketMissileSystem instence;
	
	public static  RocketMissileSystem getInstence() {
		if(instence == null) {
			instence=new RocketMissileSystem();
			System.out.println("Initialize Rocket Missile System....");
		}
		return instence;
	}
	
	@Override
	public void launch(String source) {
		System.out.print("Rocket missile launch from " + source);
		
	}

	@Override
	public void Blast(String destination) {
		System.out.println(" and Rocket missile blast Flight " + destination);
		
	}

}
