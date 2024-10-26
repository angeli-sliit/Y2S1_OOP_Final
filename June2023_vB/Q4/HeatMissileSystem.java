package Q4;

public class HeatMissileSystem implements MissileSystem {
	private static HeatMissileSystem instence;
	
	public static HeatMissileSystem getInstence() {
		if(instence == null) {
			instence = new HeatMissileSystem();
			System.out.println("Initialize Heat Missile System....");
		}
		return instence;
	}
	@Override
	public void launch(String source) {
		System.out.print("Heat missile launch from " + source);
		
	}

	@Override
	public void Blast(String destination) {
		System.out.println(" and Heat missile blast Flight " + destination);
		
	}

}
